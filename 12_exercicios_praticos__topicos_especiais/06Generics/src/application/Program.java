/*-------------------- packages section --------------------*/
package application;

/*-------------------- class Program --------------------*/
public class Program {

	/*-------------------- functions section --------------------*/
	private static void runProgram() {
//		Kennel<Animal> kennel = new Kennel<Cat>(); 	// não compila
//		Kennel<Cat> kennel = new Kennel<Animal>(); 	// não compila
		
		/*
		 * Kennel<?> kennel = new Kennel<Cat>(); 	// não compila
		 * kennel.setAnimal(new Cat());
		 */
		
		/*
		 * Kennel = new Kennel<>();					// não compila
		 * kennel.setAnimal(new Cat());
		 */
	}
	
	private static void displayMessageEnfOfProgram() {
		System.out.println("\n---- fim do programa -----");
	}
	
	/*-------------------- main method --------------------*/
	public static void main(String[] args) {
		runProgram();
		displayMessageEnfOfProgram();
	}
}
