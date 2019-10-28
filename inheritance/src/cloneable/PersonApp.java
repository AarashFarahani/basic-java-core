package cloneable;

public class PersonApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Arash", "Farahani");
        System.out.println(person1);

        System.out.println(person1.clone());
    }
}
