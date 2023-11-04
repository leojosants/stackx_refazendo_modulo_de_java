import classes.Mutant;

public class Main {

	public static void main(String[] args) {
		
		Mutant mutant_1 = new Mutant();
		mutant_1.first_name = "Charles";
		mutant_1.last_name = "Xavier";
		mutant_1.name_mutant = "Professor X";
		mutant_1.age = 64;
		mutant_1.level = 5;
		
		System.out.println(mutant_1.toString());
		System.out.println(mutant_1.getLevelName());
		
		System.out.println();
		
		Mutant mutant_2 = new Mutant();
		mutant_2.first_name = "Scott";
		mutant_2.last_name = "Summer";
		mutant_2.name_mutant = "Ciclope";
		mutant_2.age = 32;
		mutant_2.level = 4;
				
		System.out.println(mutant_2.toString());
		System.out.println(mutant_2.getLevelName());
	}
}
