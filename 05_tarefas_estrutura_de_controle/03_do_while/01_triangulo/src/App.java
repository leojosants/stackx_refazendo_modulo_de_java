import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        double base = 0.0;
        double height = 0.0;
        double calculatesArea = 0.0;

        System.out.println("\nCALCULO DA AREA DE UM TRIANGULO");

        System.out.print("Informe a base   [cm]: ");
        base = reader.nextDouble();

        do {
            if (base <= 0) {
                System.out.print("Entrada inválida, somente valores positivos [cm]: ");
                base = reader.nextDouble();
            }
        } while (base <= 0);

        System.out.print("Informe a altura [cm]: ");
        height = reader.nextDouble();

        do {
            if (height <= 0) {
                System.out.print("Entrada inválida, somente valores positivos [cm]: ");
                height = reader.nextDouble();
            }
        } while (height <= 0);

        calculatesArea = (base * height) / 2;

        System.out.println("\nEXIBINDO DADOS");
        System.out.printf("A área do triângulo é: %.2fcm%n%n", calculatesArea);

        reader.close();
    }
}
