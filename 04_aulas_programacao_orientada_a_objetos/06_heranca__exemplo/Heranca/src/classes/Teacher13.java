package classes;

public class Teacher13 extends Person13 {
    
    private String department;
	
	public Teacher13(String name, int registration, String department) {
		super(name, registration);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
