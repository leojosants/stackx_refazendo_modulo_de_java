package application;

import java.util.Locale;
import java.util.Scanner;

import javax.security.auth.login.AccountException;

import model.entities.BankAccount;

public class Program {
	/*
	 * functions section
	 */
	private static Scanner generateInstanceScanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner;
	}
	
	private static BankAccount generateInstanceBankAccount(double balance, double limit) {
		BankAccount bank_acccount = new BankAccount(balance, limit);
		return bank_acccount;
	}
	
	private static double requestBalance(Scanner scanner) {
		double balance = 0.0;
		System.out.print("Digite o saldo ..: R$ ");
		balance = scanner.nextDouble();
		scanner.nextLine(); // buffer
		return balance;
	}
	
	private static double requestLimit(Scanner scanner) {
		double limit = 0.0;
		System.out.print("Digite o limite de crédito..: R$ ");
		limit = scanner.nextDouble();
		scanner.nextLine(); // buffer
		return limit;
	}
	
	private static void displayOptions() {
		System.out.println("[1] - Depositar");
		System.out.println("[2] - Sacar");
	}
	
	private static int requestOperationsOption(Scanner scanner) {
		int operations_option = 0;
		displayOptions();
		
		System.out.print("Digite sua opção ..: ");
		operations_option = scanner.nextInt();
		scanner.nextLine(); // buffer
		
		while((operations_option != 1) && (operations_option != 2)) {
			System.out.print("-> campo 'Digite sua opção', informe somente [1] ou [2]\n");
			displayOptions();
			System.out.print("Digite sua opção ..: ");
			operations_option = scanner.nextInt();
			scanner.nextLine(); // buffer
		}
		
		return operations_option;
	}
	
	private static double requestDepositValue(Scanner scanner) {
		double deposit_value = 0.0;
		deposit_value = scanner.nextDouble();
		scanner.nextLine(); // buffer
		
		while(deposit_value < 0.0) {
			System.out.print("-> campo 'Digite o valor para depósito' não pode ser menor que zero ..: R$ ");
			deposit_value = scanner.nextDouble();
			scanner.nextLine(); // buffer
		}
		
		return deposit_value;
	}
	
	private static double requestWithdrawValue(Scanner scanner) {
		double withdraw_value = 0.0;
		withdraw_value = scanner.nextDouble();
		scanner.nextLine(); // buffer
		
		while(withdraw_value < 0.0) {
			System.out.print("-> campo 'Digite o valor para saque' não pode ser menor que zero ..: R$ ");
			withdraw_value = scanner.nextDouble();
			scanner.nextLine(); // buffer
		}
		
		return withdraw_value;
	}
	
	private static void processOperation(int operations_option, Scanner scanner, BankAccount bank_acccount) throws AccountException {
		if(operations_option == 1) {
			System.out.print("Digite o valor para depósito ..: R$ ");
			double deposit_value = requestDepositValue(scanner);
			bank_acccount.deposit(deposit_value);
			bank_acccount.displayBalance();
		}
		else if(operations_option == 2) {
			System.out.print("Digite o valor para saque ..: R$ ");
			double withdraw_value = requestWithdrawValue(scanner);
			bank_acccount.withdraw(withdraw_value);
			bank_acccount.displayBalance();
		}
	}
	
	private static char requestWantToContinue(Scanner scanner) {
		String want_to_continue_string = "";
		char want_to_continue_char;
		
		System.out.print("Quer continuar [S/N]? ..: ");
		want_to_continue_string = scanner.nextLine().toUpperCase().trim();
		
		while((want_to_continue_string.length() == 0) || (!want_to_continue_string.equals("S") && !want_to_continue_string.equals("N"))) {
			System.out.print("-> campo 'Quer continuar, Sim[S] ou Não[N]?' informe somente [S/N] ..: ");
			want_to_continue_string = scanner.nextLine().toUpperCase().trim();
		}
		
		want_to_continue_char = want_to_continue_string.charAt(0);
		return want_to_continue_char;
	}
	
	private static void displayMessageDomainException(Throwable e) {
		System.out.printf("-> erro de operação ..: %s", e.getMessage());
	}
	
	private static void displayProgramEndMessage() {
		System.out.println("\n-> programa finalizado");
	}
	
	/*
	 * main method
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = generateInstanceScanner();
		
		try {					
			char want_to_continue;
			
			System.out.println("\n----- Entre com os dados da conta -----");
			double balance = requestBalance(scanner);
			double limit = requestLimit(scanner);
			
			BankAccount bank_acccount = generateInstanceBankAccount(balance, limit);
			bank_acccount.displayBalance();
			
			do {
				System.out.println("\n----- Escolha uma operação -----");			
				int operations_option = requestOperationsOption(scanner);
				processOperation(operations_option, scanner, bank_acccount);
				want_to_continue = requestWantToContinue(scanner);			
			} while(want_to_continue != 'N');
		}
		catch (AccountException e) {
			displayMessageDomainException(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			scanner.close();
			displayProgramEndMessage();
		}
	}
}
