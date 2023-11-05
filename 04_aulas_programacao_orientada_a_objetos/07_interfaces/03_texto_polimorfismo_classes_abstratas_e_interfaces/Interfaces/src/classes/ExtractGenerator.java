package classes;

public class ExtractGenerator {
    /*
     * method
     */
    public void accountGenerator(Account account) {
        System.out.printf("Saldo atual: R$%.2f%n", account.getBalance());
    }
}
