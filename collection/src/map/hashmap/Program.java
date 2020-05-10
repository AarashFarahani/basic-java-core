package map.hashmap;

import model.Person;

import java.util.HashMap;
import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
        HashMap<Person, String> hashSet = new HashMap<>();
        hashSet.put(new Person("Arash"), "Test1");
        hashSet.put(new Person("Maryam"), "Test2");

        hashSet.forEach((k, v)->
                System.out.println(String.format("%s | %s | %s", k.hashCode(), k.getName(), v))
        );
    }
}
