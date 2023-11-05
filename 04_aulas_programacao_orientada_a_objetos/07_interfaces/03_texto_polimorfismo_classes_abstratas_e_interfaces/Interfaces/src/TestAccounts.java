import classes.CurrentAccount;
import classes.ExtractGenerator;
import classes.SavingsAccount2;

public class TestAccounts {
    public static void main(String[] args) throws Exception {

        CurrentAccount current_account = new CurrentAccount();
        current_account.deposit(1200.20);
        current_account.toWithdraw(300);

        SavingsAccount2 savings_account=new SavingsAccount2();
        savings_account.deposit(500.50);
        savings_account.toWithdraw(25);

        ExtractGenerator extract_generator = new ExtractGenerator();
        extract_generator.accountGenerator(current_account);
        extract_generator.accountGenerator(savings_account);
    }
}
