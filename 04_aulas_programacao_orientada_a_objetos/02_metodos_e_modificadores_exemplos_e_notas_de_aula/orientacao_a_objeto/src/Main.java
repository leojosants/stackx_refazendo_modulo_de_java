import classes.Car1;
import classes.Person5;

public class Main {

	public static void main(String[] args) {

		Person5 person_1 = new Person5("Amanda", "Silva", 15);
		
		Person5 person_2 = new Person5("Carlos", "Jose", 23);
		
		Person5 person_3 = new Person5(18);		
		person_3.increaseAge();
		
		Car1 car_1 = new Car1();
		// car_1.setModel("i30");
		
		Car1 car_2 = new Car1();
		car_2.setModel("fusca");
		car_2.setOwner(person_2);
		
		System.out.println(car_1.getNameOwner());
		
		System.out.println(car_2.getNameOwner());
	}

}
