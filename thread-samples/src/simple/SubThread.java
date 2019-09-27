package simple;

public class SubThread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ChildThread thread = new ChildThread("Thread " + i);
            thread.start();
        }
    }
}
