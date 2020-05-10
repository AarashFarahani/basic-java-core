package set.hashset;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Test1");
        hashSet.add("Test2");
        hashSet.add("Test3");
        hashSet.add("Test4");
        hashSet.add("Test5");
        hashSet.add("Test5");

        hashSet.forEach(a->
                System.out.println(String.format("%s | %s", a.hashCode(), a))
        );
    }
}
