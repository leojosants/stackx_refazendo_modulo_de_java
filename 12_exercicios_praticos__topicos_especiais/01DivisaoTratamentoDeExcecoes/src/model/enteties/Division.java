package model.enteties;

public class Division {
	/*
	 * attributes section
	 */
	private Double dividend;
	private Double divisor;

	/*
	 * constructors section
	 */
	// constructor - default
	public Division() {
		//
	}

	// constructor - overload
	public Division(Double dividend, Double divisor) {
		this.setDividend(dividend);
		this.setDivisor(divisor);
	}

	public Double getDividend() {
		return this.dividend;
	}

	public void setDividend(Double dividend) {
		this.dividend = dividend;
	}

	public Double getDivisor() {
		return this.divisor;
	}

	public void setDivisor(Double divisor) {
		this.divisor = divisor;
	}
	
	/*
	 * methods section
	 */
	public Double calculateOperation() {
		if(this.getDivisor() == 0) {
			throw new ArithmeticException("não é possível realizar divisão por zero");
		}
		else {
			return this.getDividend() / this.getDivisor();			
		}
	}
	
	@Override
	public String toString() {
		return String.format("Resultado: %.2f", this.calculateOperation());
	}
	
	public void printCalculateOperation() {
		System.out.println(toString());
	}
}
