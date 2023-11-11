package classes;

public class Teacher extends Person {
    /*
     * attributes
     */
    private String department;

    /*
     * constructor
     */
    public Teacher(String name, String department) {
        super(name);
        this.setDepartment(department);
    }

    /*
     * getters and setters
     */
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
