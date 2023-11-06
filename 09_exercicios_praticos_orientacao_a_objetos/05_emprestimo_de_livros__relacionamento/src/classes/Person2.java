package classes;

public class Person2 {
    /*
     * attributes
     */
    private String name;
    private int age;

    /*
     * constructor
     */
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String getFirstName() {
        return null;
    }
}
