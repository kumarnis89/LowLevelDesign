package MachineCoding.RateLimiter.SlidingWindowCounterRateLimiter;


import java.util.concurrent.ConcurrentHashMap;

public class SlidingWindowCounterRateLimiter {
    private final long windowSizeInMillis;
    private final int maxRequests;

    private final ConcurrentHashMap<String, WindowState> store =
            new ConcurrentHashMap<>();

    public SlidingWindowCounterRateLimiter(long windowSizeInMillis, int maxRequests){
        this.windowSizeInMillis = windowSizeInMillis;
        this.maxRequests = maxRequests;
    }

    public boolean allowRequest(String key){
        long now = System.currentTimeMillis();
        long currentWindow = now / windowSizeInMillis;

        WindowState windowState = store.computeIfAbsent(key, (k) -> new WindowState(currentWindow));

        synchronized (windowState){
            // If current window has changed, Shift windows
            if(currentWindow != windowState.currentWindow){
                windowState.currentWindow = currentWindow;
                windowState.previousWindowCount = windowState.currentWindowCount;
                windowState.currentWindowCount = 0;
            }

            long elapsedInCurrentWindow = now - (currentWindow * windowSizeInMillis);
            double overlapRatio = (double) (windowSizeInMillis - elapsedInCurrentWindow) / windowSizeInMillis;

            double effectiveCount = windowState.currentWindowCount + windowState.previousWindowCount * overlapRatio;

            if(effectiveCount < maxRequests){
                windowState.currentWindowCount++;
                return true;
            }

            return false;
        }
    }

    static class WindowState{
        long currentWindow;
        int currentWindowCount;
        int previousWindowCount;

        WindowState(long currentWindow){
            this.currentWindow = currentWindow;
        }
    }
}
