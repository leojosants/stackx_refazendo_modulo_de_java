package classes;

public class CurrentAccount implements Account {
    /*
     * attributes
     */
    private double balance;
    private double operating_fee = 0.45;

    /*
     * getters and setters
     */
    @Override
    public double getBalance() {
        return this.balance;
    }

    /*
     * methods
     */
    @Override
    public void deposit(double value) {
        this.balance += value - this.operating_fee;
    }

    @Override
    public void toWithdraw(double value) {
        this.balance -= value + this.operating_fee;
    }

}
