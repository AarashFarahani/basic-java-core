package set.linkedhashset;

import java.util.LinkedHashSet;

public class Program {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
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
