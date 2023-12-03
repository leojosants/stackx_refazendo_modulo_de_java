package model.exceptions;

public class AccountException extends Exception {
	/*
	 * attributes section
	 */
	private static final long serialVersionUID = 1L;
	
	/*
	 * constructors section
	 */
	public AccountException(String message) {
		super(message);
	}
}
