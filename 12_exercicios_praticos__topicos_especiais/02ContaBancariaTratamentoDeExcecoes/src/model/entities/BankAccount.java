package model.entities;

import javax.security.auth.login.AccountException;

public class BankAccount {
	/*
	 * attributes section
	 */
	private Double balance;
	private Double limit;

	/*
	 * constructor section
	 */
	// constructor - default
	public BankAccount() {
		//
	}

	// constructor - overload
	public BankAccount(Double balance, Double limit) {
		this.setBalance(balance);
		this.setLimit(limit);
	}

	public Double getBalance() {
		return this.balance;
	}

	private void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getLimit() {
		return this.limit;
	}

	private void setLimit(Double limit) {
		this.limit = limit;
	}
	
	public Double getBalanceWithLimit() {
		return this.getBalance() + this.getLimit();
	}
	
	public Boolean withdraw(double amount) throws AccountException {
		if(this.getBalance() == 0) {
			throw new AccountException("quantia acima do limite ou saldo insuficiente");
		}
		
		if(amount > 500.00) {
			throw new AccountException("quantia acima do limite ou saldo insuficiente");
		}
		
		if((this.getBalanceWithLimit() - amount) <= 0) {
			throw new AccountException("quantia acima do limite ou saldo insuficiente");
		}
		
		if((amount - this.getBalance()) < 0) {
			throw new AccountException("quantia acima do limite ou saldo insuficiente");
		}
		
		this.setBalance(this.getBalance() - amount);
		return true;
	}
	
	public void deposit(double amount) throws AccountException {
		if(amount <= 1_000.00) {
			this.setBalance(this.getBalance() + amount);
		}
		else {
			throw new AccountException("quantia excede valor permitido para depósito");
		}
	}
	
	public void displayBalance() {
		System.out.printf("Saldo ..: R$ %.2f%n", this.getBalance());
	}
}
