package classes;

public class Person {
    /* attributes */
    private String firstName;
    private String lastName;
    private int age = 0;

    /* constructor methods */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /* getters and setters */
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    /* methods */
    public void increaseAge() {
        this.age++;
        System.out.printf("Idade incrementada [+ %d]%n", this.age);
    }

    public void displayData() {
        System.out.printf("Nome: %s%n", this.getFirstName());
        System.out.printf("Sobrenome: %s%n", this.getLastName());
        System.out.printf("Idade: %d anos %n", this.getAge());
    }
}
