package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SavingsAccount extends Account {

    @Override
    public void printExtract() {
        System.out.println("- Extrato da conta -");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
        Date date = new Date();

        System.out.printf("Saldo: R$%.2f%n", this.getBalance());
        System.out.printf("Data:  %s%n", sdf.format(date));
    }
}
