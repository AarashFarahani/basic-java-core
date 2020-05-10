package map.hashmap;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<String, String> hashSet = new HashMap<>();
        hashSet.put("1", "Test1");
        hashSet.put("2", "Test2");
        hashSet.put("3", "Test3");
        hashSet.put("4", "Test4");
        hashSet.put("5", "Test5");
        hashSet.put("5", "Test5");
        hashSet.put("6", null);
        hashSet.put("7", null);

        hashSet.forEach((k, v)->
                System.out.println(String.format("%s | %s | %s", k.hashCode(), k, v))
        );
    }
}
