/*-------------------- packages section --------------------*/
package application;

/*-------------------- imports section --------------------*/
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

/*-------------------- packages section --------------------*/
public class Program {

	/*-------------------- functions section --------------------*/
	private static Scanner generateInstanceScanner() {
		return new Scanner(System.in);
	}

	private static int requestTotalStrings(Scanner scanner) throws IllegalAccessException {
		int total = 0;
		String total_string = null;

		System.out.print("\nQuantas 'Strings' serão informadas ..? ");
		total_string = scanner.nextLine().trim();
		
		while (total_string.isEmpty()) {
			System.out.print("-> campo vazio, tente novamente! Quantas 'Strings' serão informadas ..? ");
			total_string = scanner.nextLine().trim();
		}
		
		total = Integer.parseInt(total_string);
		
		if (total < 0) {
			throw new IllegalAccessException("entrada inválida ..: " + total);
		}
	
		return total;
	}

	private static void fillSet(Set<String> programming_languages_set, int total_strings, Scanner scanner) {
		String data = null;

		if (total_strings != 0) {
			for (int i = 1; i <= total_strings; i++) {
				System.out.printf("Digite a %dª ..: ", i);
				data = scanner.nextLine();
				
				while (data.isEmpty()) {
					System.out.printf("-> campo vazio, tente novamente! Digite a %dª ..: ", i);
					data = scanner.nextLine();
				}

				programming_languages_set.add(data);
			}
		}
	}

	private static Set<String> generateInstanceHashSet() {
		return new HashSet<>();
	}

	private static int maxLength(Set<String> set) {
		int count = 0;

		if (set.isEmpty()) {
			return 0;
		} else {
			for (String string : set) {
				if (string.length() > count) {
					count = string.length();
				}
			}
		}
		return count;
	}

	private static void displayData(Set<String> set) {
		int count = maxLength(set);

		System.out.println("\n----- Exibindo resultado -----");

		if (count == 0) {
			System.out.printf("O conjunto está vazio ..: %d strings%n", count);
		} 
		else {
			System.out.printf("A string de maior comprimento no conjunto tem '%d' caracteres %n", count);
		}

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
			Set<String> programming_languages_set = generateInstanceHashSet();
			int total_strings = requestTotalStrings(scanner);
			fillSet(programming_languages_set, total_strings, scanner);
			displayData(programming_languages_set);
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
