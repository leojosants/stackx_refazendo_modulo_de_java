/*-------------------- packages section --------------------*/
package application;

/*-------------------- class Program --------------------*/
public class Program {

	/*-------------------- functions section --------------------*/
	private static void runProgram() {
//		Kennel<Animal> kennel = new Kennel<Cat>(); 	// n�o compila
//		Kennel<Cat> kennel = new Kennel<Animal>(); 	// n�o compila
		
		/*
		 * Kennel<?> kennel = new Kennel<Cat>(); 	// n�o compila
		 * kennel.setAnimal(new Cat());
		 */
		
		/*
		 * Kennel = new Kennel<>();					// n�o compila
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
