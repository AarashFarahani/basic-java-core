package simple;

public class ChildThread extends Thread {
    private String name;

    public ChildThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.name);

            try {
                this.currentThread().sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
