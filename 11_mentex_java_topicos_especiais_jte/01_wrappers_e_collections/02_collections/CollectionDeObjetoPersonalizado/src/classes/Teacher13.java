package classes;

public class Teacher13 implements Comparable<Teacher13>{
    /*
     * attribute
     */
    private String name;
    private String department;

    /*
     * constructor
     */
    public Teacher13(String name, String department) {
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
    public void displayData() {
        System.out.println("Exibindo dados do Professor(a)");
        System.out.printf("Nome:         %s%n", this.getName());
        System.out.printf("Departamento: %s%n%n", this.getDepartment());
    }

    @Override
    public int compareTo(Teacher13 other) {
        return this.getName().compareTo(other.getName());
    }
}
