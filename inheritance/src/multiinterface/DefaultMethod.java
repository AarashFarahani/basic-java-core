package multiinterface;

public class DefaultMethod implements InterfaceOne, InterfaceTwo {
    public static void main(String[] args) {
        DefaultMethod instance = new DefaultMethod();
        instance.println(" package1 1");
        InterfaceOne.print(" package1 2 ");
        print(" package1 3");
    }

    public void println(String text) {
        InterfaceTwo.super.println(text);
    }

    public static void print(String text) {
        InterfaceTwo.print(text);
    }
}
