package simple;

import java.util.ArrayList;
import java.util.List;

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            ChildThread thread = new ChildThread("Thread " + i);
            thread.start();
            thread.join();
        }

        System.out.println("*****************************************************************");

        for (int i = 0; i < 10; i++) {
            ChildThread thread = new ChildThread("Thread " + i);
            threadList.add(thread);
            thread.start();
        }

        for (Thread thread: threadList)
            thread.join();
    }
}
