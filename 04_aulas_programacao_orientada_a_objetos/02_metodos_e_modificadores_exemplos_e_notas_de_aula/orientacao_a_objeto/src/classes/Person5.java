package classes;

public class Person5 {
    private String first_name;
	private String last_name;
	private int age = 0;
	
	// Construtor padr�o
	// public Person()
	// {
	// }
	
	public Person5(String first_name, String last_name, int age) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
	}
	
	public Person5(int age) {
		this.age = age;
	}
	
	public String getFirstName() {
		return first_name;
	}
	
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLastName() {
		return last_name;
	}
	
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void increaseAge() {
		this.age++;
	}
	
	public void setFullName(String first_name, String last_name) {
		this.first_name = first_name;
		this.last_name = last_name;
	}
}
