package classes;

public abstract class Animal {
    /*
     * attribute
     */
    private String name;

    /*
     * getters and setters
     */
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    /*
     * methods
     */
    public abstract void makeSound();
}
