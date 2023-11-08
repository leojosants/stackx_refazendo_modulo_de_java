package classes;

public class NotExactDivision extends Exception {
    /*
     * attributes
     */
    private int number;
    private int denominator;

    /*
     * constructor
     */
    public NotExactDivision(int number, int denominator) {
        this.setNumber(number);
        this.setDenominator(denominator);
    }

    /*
     * getters and setters
     */
    private int getNumber() {
        return this.number;
    }

    private void setNumber(int number) {
        this.number = number;
    }

    private int getDenominator() {
        return this.denominator;
    }

    private void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /*
     * methods
     */
    @Override
    public String toString() {
        return "-> resultado de " + this.getNumber() + "/" + this.getDenominator() + " não é um inteiro!";
    }

}
