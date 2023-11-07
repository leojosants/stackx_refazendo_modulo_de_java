package classes;

public class Student13 implements Comparable<Student13> {
    /*
     * attributes
     */
    private String name;
    private String course;
    private double grade;

    /*
     * construcroe
     */
    public Student13(String name, String course, double grade) {
        this.setName(name);
        this.setCourse(course);
        this.setGrade(grade);
    }

    /*
     * getters end setters
     */
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return this.course;
    }

    private void setCourse(String course) {
        this.course = course;
    }

    public double getGrade() {
        return this.grade;
    }

    private void setGrade(double grade) {
        this.grade = grade;
    }

    /*
     * methods
     */
    public String toString() {
        return this.getName();
    }

    public void printStudent() {
        System.out.printf("Nome: %s%n", toString());
    }

    @Override
    public int compareTo(Student13 student) {
        return this.getName().compareTo(student.getName());
    }
}
