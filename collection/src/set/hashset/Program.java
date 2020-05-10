package set.hashset;

import model.Person;

import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("Arash"));
        hashSet.add(new Person("Afshin"));

        hashSet.forEach(a->
            System.out.println(String.format("%s | %s", a.hashCode(), a.getName()))
        );
    }
}
