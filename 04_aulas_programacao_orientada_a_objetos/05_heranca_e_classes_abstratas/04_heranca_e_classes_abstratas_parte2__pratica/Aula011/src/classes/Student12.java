package classes;

public class Student12 extends Person12 {
    /*
     * attributes
     */
    private String registration;
    private String course;

    /*
     * constructor
     */
    public Student12() {
    }

    /*
     * getters and setters
     */
    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    /*
     * methods
     */
    public void payMonthlyFee() {
        System.out.printf("-> pagando mensalidade do aluno '%s'%n", this.getName());
    }
    
    public final void printStudent() {
        System.out.printf("Curso:     %s%n",this.getCourse());
        System.out.printf("Matricula: %s%n",this.getRegistration());
    }
}
