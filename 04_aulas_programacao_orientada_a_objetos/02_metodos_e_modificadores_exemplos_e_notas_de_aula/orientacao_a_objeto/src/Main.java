import classes.Car;
import classes.Person;

public class Main {

	public static void main(String[] args) {

		Person person_1 = new Person("Amanda", "Silva", 15);
		
		Person person_2 = new Person("Carlos", "Jose", 23);
		
		Person person_3 = new Person(18);		
		person_3.increaseAge();
		
		Car car_1 = new Car();
		// car_1.setModel("i30");
		
		Car car_2 = new Car();
		car_2.setModel("fusca");
		car_2.setOwner(person_2);
		
		System.out.println(car_1.getNameOwner());
		
		System.out.println(car_2.getNameOwner());
	}

}
