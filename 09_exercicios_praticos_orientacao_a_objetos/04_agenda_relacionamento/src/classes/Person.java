package classes;

public class Person {
    /*
     * attributes
     */
    private String name;
    private int age;
    private float height;

    /*
     * constructor
     */
    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}