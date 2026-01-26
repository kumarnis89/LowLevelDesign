package MachineCoding.RateLimiter.TokenBucketRateLimiter;

import java.util.concurrent.ConcurrentHashMap;

public class TokenBucketRateLimiter {
    private final int capacity;
    private final double refillRatePerMillis;

    private final ConcurrentHashMap<String, TokenBucket> buckets =
            new ConcurrentHashMap<>();

    public TokenBucketRateLimiter(int capacity, int refillRatePerSecond){
        this.capacity = capacity;
        this.refillRatePerMillis = refillRatePerSecond / 1000.0;
    }

    public boolean allowRequest(String key){
        long now = System.currentTimeMillis();

        TokenBucket bucket = buckets.computeIfAbsent(key, (k) -> new TokenBucket(capacity, now));

        synchronized (bucket){
            refill(bucket, now);

            if(bucket.tokens >= 1){
                bucket.tokens-=1;
                return true;
            }
            return false;
        }
    }

    private void refill(TokenBucket bucket, long now){
        long elapsedTime = now - bucket.lastRefillTimestamp;
        if(elapsedTime <=0) return;

        double tokensToAdd = elapsedTime * refillRatePerMillis;
        if(tokensToAdd > 0){
            bucket.tokens = Math.min(capacity, bucket.tokens + tokensToAdd);
            bucket.lastRefillTimestamp = now;
        }
    }

    static class TokenBucket {
        long lastRefillTimestamp;
        double tokens;

        TokenBucket(int capacity, long now){
            this.tokens = capacity;
            lastRefillTimestamp = now;
        }
    }
}
