import java.util.*;

public class Program {
    public static void main(String[] args) {
        HashMap<Person, String> set = new HashMap<>();
        set.put(new Person("Arash"), "Arash");
        set.put(new Person("Maryam"), "Maryam");

        set.entrySet().stream().forEach(a-> System.out.println(a.getValue()));
    }
}
