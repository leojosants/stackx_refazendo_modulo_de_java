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

    /*
     * methods
     */
    @Override
    public String toString() {
        return String.format("Dados da Pessoa\n") +
                String.format("Nome: %s%n", this.getName());
    }
}
