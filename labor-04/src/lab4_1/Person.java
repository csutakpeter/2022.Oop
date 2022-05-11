package lab4_1;

public class Person {
    String firstName;
    String lastName;
    int birthyear;

    public Person(String firstName, String lastName, int birthyear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthyear = birthyear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthyear=" + birthyear +
                '}';
    }
}
