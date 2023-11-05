package classes;

public class Teacher extends Person11 {
    /*
     * attributes
     */
    private String specialty;
    private double salary;

    /*
     * constructor
     */
    public Teacher() {
    }

    /*
     * getters and setters
     */
    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /*
     * methods
     */
    public void receiveARaise() {

    }
}
