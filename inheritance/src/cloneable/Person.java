package cloneable;

public class Person implements Cloneable {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return String.format("%s - %s", this.firstName, this.lastName);
    }

    public Object clone() throws
            CloneNotSupportedException
    {
//        return this;
        return super.clone();
    }
}
