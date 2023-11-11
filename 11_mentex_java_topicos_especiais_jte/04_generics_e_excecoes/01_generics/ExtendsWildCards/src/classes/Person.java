package classes;

public class Person {
    /*
     * attribute
     */
    protected String name;

    /*
     * constructor
     */
    public Person(String name) {
        this.setName(name);
    }

    /*
     * getters and setters
     */
    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
