package classes;

public final class Teacher12 extends Person12 {
    /*
     * attributes
     */
    private String specialty;
    private double salary;

    /*
     * constructor
     */
    public Teacher12() {
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
        System.out.printf("-> professor '%s' recendo aumento %n", this.getName());
    }

    public final void printTeacher() {
        System.out.printf("Especialidade: %S%n", this.getSpecialty());
        System.out.printf("Salário:       R$%.2f%n",this.getSalary());
    }
}
