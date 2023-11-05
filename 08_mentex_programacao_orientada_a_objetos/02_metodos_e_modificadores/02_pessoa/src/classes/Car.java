package classes;

public class Car {
    
    /* attributes */
    private String model;
    private Person owner;

    /* constructor methods */
    public Car(String model, Person owner) {
        this.model = model;
        this.owner = owner;
    }

    /* getters and setters */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getOwnerName() {
        return this.owner.getFirstName();
    }
}
