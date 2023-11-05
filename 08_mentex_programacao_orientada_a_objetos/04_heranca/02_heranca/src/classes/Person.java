package classes;

public class Person {
    /*
     * attribute
     */
    private String name;
    private int registration;

    /*
     * constructor
     */
    public Person(String name, int registration) {
        setName(name);
        setRegistration(registration);
    }

    /*
     * getters and setters
     */
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getRegistration() {
        return registration;
    }

    private void setRegistration(int registration) {
        this.registration = registration;
    }
}
