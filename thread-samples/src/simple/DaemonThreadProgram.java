package simple;

public class DaemonThreadProgram {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            DaemonThread thread = new DaemonThread("Thread " + i);
            thread.start();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
