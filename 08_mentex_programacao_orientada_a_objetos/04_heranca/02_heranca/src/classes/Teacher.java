package classes;

public class Teacher extends Person {
    /*
     * attribute
     */
    private String department;

    /*
     * constructor
     */
    public Teacher(String name, String department, int registration) {
        super(name, registration);
        setDepartment(department);
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
}
