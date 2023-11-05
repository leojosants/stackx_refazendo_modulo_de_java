package classes;

public class Student extends Person11 {
    /*
     * attributes
     */
    private int registration;
    private String course;

    /*
     * constructor
     */
    public Student() {
    }

    /*
     * getters and setters
     */
    public int getRegistration() {
        return this.registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    /*
     * methods
     */
    public void cancelRegistration() {
        System.out.println("-> matrícula será cancelada");
    }
}
