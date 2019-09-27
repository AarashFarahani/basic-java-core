package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LambdaFixedThread {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        try {
            for (int i = 0; i < 8; i++) {
                final int counter = i;
                executorService.execute(()-> {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("Thread " + counter);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        } finally {
            executorService.shutdown();
        }
    }
}
