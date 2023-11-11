package classes;

public class School19 {
    /*
     * attributes
     */
    private String name;

    /*
     * constructor
     */
    public School19(String name) {
        this.setName(name);
    }

    /*
     * getters and setters
     */
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    /*
     * methods
     */
    @Override
    public String toString() {
        return String.format("Dados da Escola\n") +
                String.format("Nome:         %s%n", this.getName());
    }
}
