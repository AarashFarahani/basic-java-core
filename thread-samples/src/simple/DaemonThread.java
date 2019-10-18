package simple;

public class DaemonThread extends ChildThread {
    public DaemonThread(String name) {
        super(name);
        super.setDaemon(true);
    }
}
