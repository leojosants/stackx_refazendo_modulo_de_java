import classes.Car;
import classes.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person person_1 = createPerson("Leonardo", "Santos", 39);
        person_1.displayData();
        person_1.increaseAge();
        person_1.displayData();

        Car car_1 = createCar("Corvette", person_1);
        System.out.println(car_1.getOwnerName());
    }

    /* SUB ROUTINES */
    private static Person createPerson(String firstName, String lastName, int age) {
        Person person = new Person(firstName, lastName, age);
        return person;
    }

    private static Car createCar(String model, Person person) {
        Car car = new Car(model, person);
        return car;
    }
}
