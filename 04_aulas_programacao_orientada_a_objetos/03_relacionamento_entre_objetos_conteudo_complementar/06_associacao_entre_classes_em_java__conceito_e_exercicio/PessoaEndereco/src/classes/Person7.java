package classes;

public class Person7 {
    /*
     * attribute
     */
    private String name;
    private int age;
    private char gender;
    private Address address;

    /*
     * constructor
     */
    public Person7() {
        this.setAddress(new Address());
    }

    public Person7(String name, int age, char gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setAddress(new Address());
    }

    public Person7(String name, int age, char gender, Address address) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setAddress(address);
    }

    /*
     * getters and setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /*
     * methods
     */
    public void printData() {
        System.out.println("\nExibindo dados");
        System.out.printf("Nome:  %s%n", this.getName());
        System.out.printf("Idade: %d%n", this.getAge());
        System.out.printf("gender:  %s%n", this.getGender());
        this.getAddress().printData();
    }
}
