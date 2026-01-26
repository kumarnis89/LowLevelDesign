package MachineCoding.RateLimiter.SlidingWindowLog;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ConcurrentHashMap;

public class SlidingWindowLogRateLimiter {
    private final long windowSizeInMillis;
    private final int maxRequests;

    private final ConcurrentHashMap<String, Deque<Long>> store = new ConcurrentHashMap<>();


    public SlidingWindowLogRateLimiter(long windowSizeInMillis, int maxRequests){
        this.windowSizeInMillis = windowSizeInMillis;
        this.maxRequests = maxRequests;
    }

    public boolean allowRequest(String key){
        long now = System.currentTimeMillis();

        Deque<Long> timestamps = store.computeIfAbsent(key, (k) -> new ArrayDeque<>());

        synchronized (timestamps){
            //1. Evict old timestamps
            while(!timestamps.isEmpty() && timestamps.peekFirst() <= (now - windowSizeInMillis)){
                timestamps.pollFirst();
            }

            //2. check limit
            if(timestamps.size() < maxRequests){
                timestamps.addLast(now);
                return true;
            }

            return false;
        }

    }
}
