package multiinterface;

public interface InterfaceTwo {
    static void print(String text) {
        System.out.print("Interface One:" + text);
    }

    default void println(String text) {
        System.out.println("Interface Two:" + text);
    }
}
