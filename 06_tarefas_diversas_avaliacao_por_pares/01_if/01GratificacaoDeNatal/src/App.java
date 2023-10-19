import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitorScanner = new Scanner(System.in);
        double totalHorasExtras = 0.0;
        double totalHorasFaltadas = 0.0;
        double bancoHoras = 0.0;
        double premio = 0.0;

        System.out.println("\nEntre com os dados abaixo.");
        System.out.print("Números de horas extras: ");
        totalHorasExtras = leitorScanner.nextDouble();

        System.out.print("Números de horas faltadas: ");
        totalHorasFaltadas = leitorScanner.nextDouble();

        bancoHoras = totalHorasExtras - (2 / 3 * (totalHorasFaltadas));

        if (bancoHoras < 600) {
            premio = 100.00;
        } else if (bancoHoras <= 1_200) {
            premio = 200.00;
        } else if (bancoHoras <= 1_800) {
            premio = 300.00;
        } else if (bancoHoras <= 2_400) {
            premio = 400.00;
        } else {
            premio = 500.00;
        }

        System.out.println("\nEXIBICAO DOS DADOS.");
        System.out.printf("Valor do prêmio: R$ %.2f%n", premio);

        leitorScanner.close();
    }
}
