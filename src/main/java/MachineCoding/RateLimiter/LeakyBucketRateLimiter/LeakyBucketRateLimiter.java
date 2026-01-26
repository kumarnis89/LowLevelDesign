package MachineCoding.RateLimiter.LeakyBucketRateLimiter;

import java.util.concurrent.ConcurrentHashMap;

public class LeakyBucketRateLimiter {
    private final int capacity;
    private final double leakRatePerMillis;

    private final ConcurrentHashMap<String, Bucket> buckets =
            new ConcurrentHashMap<>();

    public LeakyBucketRateLimiter(int capacity, int leakRatePerSecond){
        this.capacity = capacity;
        this.leakRatePerMillis = leakRatePerSecond / 1000.0;
    }

    public boolean allowRequest(String key){
        long now = System.currentTimeMillis();

        Bucket bucket = buckets.computeIfAbsent(key, (k) -> new Bucket(0, now));

        synchronized (bucket){
            leak(bucket, now);

            if(bucket.waterLevel < capacity){
                bucket.waterLevel++;
                return true;
            }
            return false;
        }
    }

    private void leak(Bucket bucket, long now){
        long elapsedTime = now - bucket.lastLeakTimestamp;
        if(elapsedTime <=0) return;

        double leakedRequests = elapsedTime * leakRatePerMillis;
        if(leakedRequests > 0){
            bucket.waterLevel = Math.max(0,bucket.waterLevel - leakedRequests);
            bucket.lastLeakTimestamp =  now;
        }
    }


    static class Bucket {
        double waterLevel;
        long lastLeakTimestamp;

        Bucket(double waterLevel, long lastLeakTimestamp){
            this.waterLevel = waterLevel;
            this.lastLeakTimestamp = lastLeakTimestamp;
        }
    }
}
