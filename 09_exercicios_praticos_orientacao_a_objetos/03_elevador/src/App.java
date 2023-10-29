import classes.Elevator;

public class App {
    public static void main(String[] args) throws Exception {

        Elevator elevetor = new Elevator();

        int totalFloorsOfTheBuilding = 10;
        int elevatorCapacity = 10;

        elevetor.start(elevatorCapacity, totalFloorsOfTheBuilding);

    }
}
