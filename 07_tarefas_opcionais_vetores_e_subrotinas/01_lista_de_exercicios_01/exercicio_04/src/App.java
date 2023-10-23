import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        try {
            double realNumber = ReturnsRealNumber(leitor);
            double doubleTheRealNumber = ReturnsDoubleRealNumber(leitor, realNumber);
            DisplaysData(realNumber, doubleTheRealNumber);

        } catch (InputMismatchException e) {
            System.out.println("Erro, entrada inválida");

        } catch (Exception e) {
            // System.out.println(e);

        } finally {
            leitor.close();
            System.out.println("Fim do programa");
        }
    }

    /* SUB-ROUTINES */
    public static double ReturnsRealNumber(Scanner leitor) {
        double realNumber = 0.0;
        System.out.print("Digite um número real [utilize virgula como separador]: ");
        realNumber = leitor.nextDouble();
        return realNumber;
    }

    public static double ReturnsDoubleRealNumber(Scanner leitor, double realNumber) {
        double doubleTheRealNumber = realNumber * 2;
        return doubleTheRealNumber;
    }

    public static void DisplaysData(double realNumber, double doubleTheRealNumber) {
        System.out.println("\nExibe dados");
        System.out.printf("Número real: %.2f%n", realNumber);
        System.out.printf("Dobro do número real: %.2f%n", doubleTheRealNumber);
    }
}
