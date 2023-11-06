package classes;

public class Elevator {
    /* attributes */
    private int groundFloor = 0;
    private int currentFloor = 0;
    private int elevatorCapacity = 0;
    private int totalFloorsOfTheBuilding = 0;
    private int totalNumberOfOccupantsAtTheMoment = 0;

    /* constructor */
    public Elevator() {
        setGroundFloor(0);
        setCurrentFloor(0);
        setElevatorCapacity(0);
        setTotalFloorsOfTheBuilding(0);
        setTotalNumberOfOccupantsAtTheMoment(0);
    }

    /* getters and setters */
    public int getGroundFloor() {
        return this.groundFloor;
    }

    public void setGroundFloor(int groundFloor) {
        this.groundFloor = groundFloor;
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }

    private void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getTotalFloorsOfTheBuilding() {
        return this.totalFloorsOfTheBuilding;
    }

    private void setTotalFloorsOfTheBuilding(int totalFloorsOfTheBuilding) {
        this.totalFloorsOfTheBuilding = totalFloorsOfTheBuilding;
    }

    public int getElevatorCapacity() {
        return this.elevatorCapacity;
    }

    private void setElevatorCapacity(int elevatorCapacity) {
        this.elevatorCapacity = elevatorCapacity;
    }

    public int getTotalNumberOfOccupantsAtTheMoment() {
        return this.totalNumberOfOccupantsAtTheMoment;
    }

    private void setTotalNumberOfOccupantsAtTheMoment(int totalNumberOfOccupantsAtTheMoment) {
        this.totalNumberOfOccupantsAtTheMoment = totalNumberOfOccupantsAtTheMoment;
    }

    /* methods */
    public void start(int elevatorCapacity, int totalFloorsOfTheBuilding) {
        setElevatorCapacity(elevatorCapacity);
        setTotalFloorsOfTheBuilding(totalFloorsOfTheBuilding);
    }

    public void toEnter() {
        if (getTotalNumberOfOccupantsAtTheMoment() < getElevatorCapacity()) {
            setTotalNumberOfOccupantsAtTheMoment(getTotalNumberOfOccupantsAtTheMoment() + 1);
            System.out.println("\n[ + ] ocupante");

        } else {
            System.out.println("\n-> não é possível 'entrar', elevador atingiu a capacidade máxima");
            System.out.println(toString());
        }
    }

    public void toGoOut() {
        if (getTotalNumberOfOccupantsAtTheMoment() > 0) {
            setTotalNumberOfOccupantsAtTheMoment(getTotalNumberOfOccupantsAtTheMoment() - 1);
            System.out.println("\n[ - ] ocupante");

        } else {
            System.out.println("\n-> não é possível 'sair', elevador já se encontra vazio");
            System.out.println(toString());
        }
    }

    public void moveUp() {
        if (getCurrentFloor() < getTotalFloorsOfTheBuilding()) {
            setCurrentFloor(getCurrentFloor() + 1);
            System.out.println("\n[ + ] andar");

        } else {
            System.out.println("\n-> não é possível 'subir', elevador já se encontra no último andar");
            System.out.println(toString());
        }
    }

    public void moveDow() {
        if (getCurrentFloor() > getGroundFloor()) {
            setCurrentFloor(getCurrentFloor() - 1);
            System.out.println("\n->[ - ] andar");

        } else {
            System.out.println("\n-> não é possível 'descer', elevador já se encontra no andar térreo");
            System.out.println(toString());
        }
    }

    @Override
    public String toString() {
        return "Total de ocupantes atual: " + totalNumberOfOccupantsAtTheMoment +
                "\nAndar atual: " + currentFloor;
    }
}
