package MachineCoding.RateLimiter.FixedWindowRateLimiter;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class FixedWindowRateLimiter {
    private final long windowSizeInMillis;
    private final int maxRequests;

    private final ConcurrentHashMap<String,WindowCounter> store = new ConcurrentHashMap<>();

    public FixedWindowRateLimiter(long windowSizeInMillis, int maxRequests){
        this.windowSizeInMillis = windowSizeInMillis;
        this.maxRequests = maxRequests;
    }

    public boolean allowRequest(String key){
        long currentTime = System.currentTimeMillis();
        long windowId = currentTime / windowSizeInMillis;

        WindowCounter counter = store.compute(key, (k, existing) -> {
            if(existing == null || existing.windowId != windowId){
                return new WindowCounter(windowId);
            }
            return existing;
        });

        return counter.incrementAndCheck(maxRequests);
    }

    static class WindowCounter{
        long windowId;
        AtomicInteger count = new AtomicInteger(0);

        WindowCounter(long windowId){
            this.windowId = windowId;
        }

        boolean incrementAndCheck(int limit){
            return count.incrementAndGet() <= limit;
        }
    }
}
