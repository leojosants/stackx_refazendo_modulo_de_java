package classes;

public class Teacher19 {
    /*
     * attributes
     */
    private String name;
    private String department;

    /*
     * constructor
     */
    public Teacher19(String name, String department) {
        this.setName(name);
        this.setDepartment(department);
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

    public String getDepartment() {
        return this.department;
    }

    private void setDepartment(String department) {
        this.department = department;
    }

    /*
     * methods
     */
    @Override
    public String toString() {
        return String.format("Dados do Professor\n") +
                String.format("Nome:         %s%n", this.getName()) +
                String.format("Departamento: %s%n", this.getDepartment());
    }
}
