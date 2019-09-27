package threadpool;

import java.util.concurrent.*;

public class FutureExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

//        Future<String> future = () -> {
//            // Perform some computation
//            System.out.println("Entered Callable");
//            Thread.sleep(2000);
//            return "Hello from Callable";
//        };

        System.out.println("Submitting Runnable");
        Future<String> future = executorService.submit(()-> {
            try {
                System.out.println("Entered Runnable");
                TimeUnit.SECONDS.sleep(2);
                return "Hello from Runnable";
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        });

        // This line executes immediately
        System.out.println("Do something else while Runnable is getting executed");

        System.out.println("Retrieve the result of the future");
        // Future.get() blocks until the result is available
        String result = future.get();
        System.out.println(result);

        executorService.shutdown();
    }
}
