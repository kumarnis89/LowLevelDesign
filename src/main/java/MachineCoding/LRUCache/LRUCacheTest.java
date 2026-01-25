package MachineCoding.LRUCache;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

public class LRUCacheTest {
    public static void main(String[] args) throws InterruptedException {
        final int CAPACITY = 10;
        final int THREAD_COUNT = 5;
        final LRUCache<Integer,Integer> lruCache = new LRUCache<>(CAPACITY);

        final CountDownLatch latch = new CountDownLatch(THREAD_COUNT);

        for(int i=0;i<THREAD_COUNT;i++){
            new Thread(()->{
                try {
                    ThreadLocalRandom random = ThreadLocalRandom.current();
                    for(int j=1;j<=50;j++){
                        boolean flag = random.nextBoolean();
                        int keyId = random.nextInt(1000);
                        int valueId = random.nextInt(1000);
                        if(flag){
                            System.out.println("put: (" + keyId +"," + valueId+")");
                            lruCache.put(keyId,valueId);
                        }
                        else{
                            System.out.println("get(" + keyId +")->" + lruCache.get(keyId));
                        }
                    }
                } finally {
                    latch.countDown();
                }
            }).start();
        }

        latch.await();
        System.out.println("All threads have finished");
    }
}
