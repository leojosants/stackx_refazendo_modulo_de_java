/*-------------------- packages section --------------------*/
package application;

/*-------------------- imports section --------------------*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*-------------------- packages section --------------------*/
public class Program {

	/*-------------------- functions section --------------------*/
	private static Scanner generateInstanceScanner() {
		return new Scanner(System.in);
	}

	private static int requestTotalIntegers(Scanner scanner) throws IllegalAccessException {
		int total = 0;
		String total_string = null;

		System.out.print("\nQuantos valores serão informados ..? ");
		total_string = scanner.nextLine().trim();
		
		while (total_string.isEmpty()) {
			System.out.print("-> campo vazio, tente novamente! Quantos valores serão informados ..?  ");
			total_string = scanner.nextLine().trim();
		}
		
		total = Integer.parseInt(total_string);
		
		if (total < 0) {
			throw new IllegalAccessException("entrada inválida ..: " + total);
		}
	
		return total;
	}

	private static void fillListOfIntegers(List<Integer> list_of_integers, int total_integers, Scanner scanner) {
		int data = 0;

		if (total_integers != 0) {
			for (int i = 1; i <= total_integers; i++) {
				System.out.printf("Digite o %dª valor ..: ", i);
				data = scanner.nextInt();
				scanner.nextLine(); // buffer
				list_of_integers.add(data);
			}
		}
	}

	private static Set<Integer> generateInstanceHashSet() {
		return new HashSet<>();
	}

	private static int countUnique(List<Integer> list) {
		int count = 0;
		Set<Integer> integers_set = generateInstanceHashSet();
		integers_set.addAll(list);
		
		if (list.isEmpty()) {
			return 0;
		} else {
			count = integers_set.size();
		}
		return count;
	}

	private static void displayData(int total_numbers) {
		System.out.println("\n----- Exibindo resultado -----");
		System.out.printf("A lista possui '%d' valores inteiros exclusivos %n", total_numbers);
	}
	
	private static void displayMessageInputMismatchException() {
		System.out.println("-> erro entrada inválida");
	}

	private static void displayMessageNumberFormatException() {
		System.out.println("-> erro entrada inválida");
	}
	
	private static void displayMessageIllegalAccessException(Throwable e) {
		System.out.printf("-> erro %s%n", e.getMessage());
	}
	
	private static void displayMessageException(Throwable e) {
		System.out.printf("-> erro %s%n", e);
	}
	
	private static void displayMessageEndOfProgram() {
		System.out.println("\n----- fim do programa -----");
	}

	private static void runProgram() {
		Scanner scanner = generateInstanceScanner();

		try {
			List<Integer> list_of_integers = new ArrayList<>();
			int total_integers = requestTotalIntegers(scanner);
			fillListOfIntegers(list_of_integers, total_integers, scanner);
			int total_numbers = countUnique(list_of_integers);
			displayData(total_numbers);
		} 
		catch (InputMismatchException e) {
			displayMessageInputMismatchException();
		}
		catch (NumberFormatException e) {
			displayMessageNumberFormatException();
		}
		catch (IllegalAccessException e) {
			displayMessageIllegalAccessException(e);
		} 
		catch (Exception e) {
			displayMessageException(e);
		} 
		finally {
			scanner.close();
		}
	}

	/*-------------------- main method --------------------*/
	public static void main(String[] args) {
		runProgram();
		displayMessageEndOfProgram();
	}
}
