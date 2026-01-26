package MachineCoding.RateLimiter.FixedWindowRateLimiter;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

public class FixedWindowRateLimiterTest {
    public static void main(String[] args) throws InterruptedException {
        FixedWindowRateLimiter rateLimiter = new FixedWindowRateLimiter(1000l, 5);

        final CountDownLatch latch = new CountDownLatch(5);

        for(int i=1;i<=5;i++){
            new Thread(()-> {
                try {
                    for(int j=1;j<=100;j++){
                        Thread.sleep(ThreadLocalRandom.current().nextInt(200));
                        System.out.println(rateLimiter.allowRequest("nishant")? "Request allowed" : "Request Rejected");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                finally {
                    latch.countDown();
                }
            }).start();
        }

        latch.await();
    }
}
