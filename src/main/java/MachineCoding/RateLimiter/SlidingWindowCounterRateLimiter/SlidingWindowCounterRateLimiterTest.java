package MachineCoding.RateLimiter.SlidingWindowCounterRateLimiter;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

public class SlidingWindowCounterRateLimiterTest {
    public static void main(String[] args) throws InterruptedException {
        SlidingWindowCounterRateLimiter rateLimiter  = new SlidingWindowCounterRateLimiter(1000l,5);
        final CountDownLatch latch = new CountDownLatch(5);

        for(int i=1;i<=5;i++){
            new Thread(()->{
                for(int j=1;j<=100;j++){
                    try {
                        Thread.sleep(ThreadLocalRandom.current().nextInt(200));
                        System.out.println(rateLimiter.allowRequest("nishant")?"Request allowed" : "Request rejected");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    finally {
                        latch.countDown();
                    }
                }
            }).start();
        }

        latch.await();
    }
}
