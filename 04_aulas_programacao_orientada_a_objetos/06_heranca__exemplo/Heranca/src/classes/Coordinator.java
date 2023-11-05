package classes;

public class Coordinator extends Person13 {
    private String coordinating_course;
	
	public Coordinator(String name, int registration, String coordinating_course) {
		super(name, registration);
		this.coordinating_course = coordinating_course;
	}

	public String getCoordinatingCourse() {
		return coordinating_course;
	}

    public void setCoordinatingCourse(String coordinating_course) {
        this.coordinating_course = coordinating_course;
    }

}
