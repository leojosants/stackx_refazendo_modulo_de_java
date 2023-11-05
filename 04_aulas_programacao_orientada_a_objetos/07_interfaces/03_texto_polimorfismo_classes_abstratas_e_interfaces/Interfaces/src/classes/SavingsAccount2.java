package classes;

public class SavingsAccount2 implements Account {
    /*
     * attributes
     */
    private double balance;

    /*
     * getter
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
        this.balance += value;
    }

    @Override
    public void toWithdraw(double value) {
        this.balance -= value;
    }
}
