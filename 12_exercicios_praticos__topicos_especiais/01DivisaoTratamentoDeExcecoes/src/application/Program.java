package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.enteties.Division;

public class Program {
	/*
	 * functions section
	 */
	private static Scanner generateInstaceScanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner;
	}

	private static Division generateIntanceDivision() {
		Division division = new Division(null, null);
		return division;
	}

	private static double requestDividend(Scanner scanner) {
		double dividend = 0.0;
		System.out.print("Entre com o primeiro número..: ");

		dividend = scanner.nextDouble();
		scanner.nextLine(); // buffer
		return dividend;
	}

	private static double requestDivisor(Scanner scanner) {
		double divisor = 0.0;
		System.out.print("Entre com o segundo número...: ");
		divisor = scanner.nextDouble();
		scanner.nextLine(); // buffer
		return divisor;
	}
	
	private static void displayMessageArithmeticException(Throwable e) {
		System.out.printf("-> erro: %s%n", e.getMessage());
	}
	
	private static void displayMessageInputMismatchException() {
		System.out.println("-> erro: esperado dígitos numéricos");
	}
 
	private static void displayProgramEndMessage() {
		System.out.println("-> programa finalizado");
	}

	/*
	 * main method
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = generateInstaceScanner();

		try {
			System.out.println("\nDigite dois números e verifique o resultado da divisão");
			double dividend = requestDividend(scanner);
			double divisor = requestDivisor(scanner);

			Division division = generateIntanceDivision();
			division.setDividend(dividend);
			division.setDivisor(divisor);
			division.calculateOperation();
			division.printCalculateOperation();
		}
		catch (ArithmeticException e) {
			displayMessageArithmeticException(e);
		}
		catch (InputMismatchException e) {
			displayMessageInputMismatchException();
		} 
		finally {
			scanner.close();
			displayProgramEndMessage();
		}
	}
}
