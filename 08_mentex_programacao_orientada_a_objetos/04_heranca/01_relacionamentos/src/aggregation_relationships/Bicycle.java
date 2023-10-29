package aggregation_relationships;

import java.util.ArrayList;
import java.util.List;

public class Bicycle {
    /* attribute */
    private String model;
    private List<Wheel> wheels_list;

    /* constructor */
    public Bicycle(String model) {
        setModel(model);
    }

    /* getters and setters */
    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Wheel> getWellsList() {
        return this.wheels_list;
    }

    public void setWellsList(List<Wheel> wheels) {
        this.wheels_list = wheels;
    }

    public List<String> getWellsListModels() {
        List<String> wheels_list = new ArrayList<String>();

        for (Wheel wheel : this.wheels_list) {
            wheels_list.add(wheel.getModel());
        }

        return wheels_list;
    }

    public void displayWellsListModels() {
        System.out.println("Listagem de modelo(s) de roda(s)");
        System.out.printf("Modelo da bicicleta: %s%n", getModel());
        System.out.printf("Modelos de rodas:    %s%n", getWellsListModels());
    }
}
