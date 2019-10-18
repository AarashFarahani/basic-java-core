package multiinterface;

public interface InterfaceOne {
    static void print(String text) {
        System.out.print("Interface One:" + text);
    }

    default void println(String text) {
        System.out.println("Interface One:" + text);
    }
}
