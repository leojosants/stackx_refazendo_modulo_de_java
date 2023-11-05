package classes;

public class Coordinator extends Person {
    /*
     * attribute
     */
    private String coordinatingCourse;

    /*
     * constructor
     */
    public Coordinator(String name, int registration, String coordinatingCourse) {
        super(name, registration);
        setCoordinatingCourse(coordinatingCourse);
    }

    /*
     * getters and setters
     */

    public String getCoordinatingCourse() {
        return coordinatingCourse;
    }

    private void setCoordinatingCourse(String coordinatingCourse) {
        this.coordinatingCourse = coordinatingCourse;
    }
}
