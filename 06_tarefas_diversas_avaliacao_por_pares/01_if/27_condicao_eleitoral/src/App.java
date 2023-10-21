import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        String message = "";
        int age = 0;

        System.out.println("\nEntre com os dados abaixo solicitados e verifique a condição eleitoral");

        do {
            System.out.print("Digite a idade: ");
            age = readerScanner.nextInt();

            while (age < 0) {
                System.out.print("Informe somente valores positivos, tente novamente: ");
                age = readerScanner.nextInt();
            }
        } while (age < 0);

        if (age < 16) {
            message = "Não pode votar";

        } else if ((age < 18) || (age >= 65)) {
            message = "Voto facultativo";

        } else if ((age == 18) || (age <= 64)) {
            message = "Voto Obrigatório";
        }

        System.out.println("\nExibindo dados");
        System.out.printf("Para idade de %d anos a condição eleitoral é: %s%n", age, message);

        readerScanner.close();
    }
}