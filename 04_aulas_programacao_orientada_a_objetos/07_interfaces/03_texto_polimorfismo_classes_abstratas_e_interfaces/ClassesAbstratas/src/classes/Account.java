package classes;

abstract class Account {
    /*
     * attributes
     */
    private double balance;

    /*
     * getters and setters
     */
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*
     * methods
     */
    public abstract void printExtract();
}
