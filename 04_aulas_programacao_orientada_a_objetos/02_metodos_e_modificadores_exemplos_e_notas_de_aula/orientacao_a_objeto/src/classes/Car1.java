package classes;

public class Car1 {
    private String model;
	private Person5 owner;
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setOwner(Person5 owner) {
		this.owner = owner;
	}
	
	public String getNameOwner() {
		return owner.getFirstName();
	}
}
