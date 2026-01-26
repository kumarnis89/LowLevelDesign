package MachineCoding.RateLimiter.LeakyBucketRateLimiter;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

public class LeakyBucketRateLimiterTest {
    public static void main(String[] args) throws InterruptedException {
        LeakyBucketRateLimiter rateLimiter = new LeakyBucketRateLimiter(10,5);
        final CountDownLatch latch = new CountDownLatch(5);

        for(int i=1;i<=5;i++){
            new Thread(()->{
                for(int j=1;j<=100;j++){
                    try{
                        Thread.sleep(ThreadLocalRandom.current().nextInt(200));
                        System.out.println(rateLimiter.allowRequest("Nishant")?"Request allowed" : "Request rejected");
                    } catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    } finally {
                        latch.countDown();
                    }
                }
            }).start();
        }

        latch.await();
    }
}
