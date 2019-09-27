package threadpool;

import simple.ChildThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleFixedThread {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        try {
            for (int i = 0; i < 8; i++)
                executorService.execute(new ChildThread("Thread " + i));
        } finally {
            executorService.shutdown();
        }
    }
}
