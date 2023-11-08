import classes.Financing;

public class App {
    public static void main(String[] args) throws Exception {

        double amount = 1_000.00;
        double entry = 300.00;
        int installments = 5;
        double value_of_the_installment = 0.0;

        try {
            Financing financing = new Financing(amount, entry, installments);
            value_of_the_installment = financing.valueOfTheInstallment();
            System.out.printf("Valor de cada parcela: R$%.2f%n", value_of_the_installment);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        
        } finally {
            System.out.println("-> fim do programa");
        }

    }
}
