package aggregation_relationships;

public class Wheel {
    /* attribute */
    private String model;

    /* contructor */
    public Wheel(String model) {
        setModel(model);
    }

    /* getters and setters */
    public String getModel() {
        return this.model;
    }

    private void setModel(String model) {
        this.model = model;
    }
}
