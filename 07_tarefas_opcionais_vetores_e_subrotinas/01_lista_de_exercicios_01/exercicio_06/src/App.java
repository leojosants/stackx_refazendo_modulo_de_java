import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);

        try {
            double realNumber = ReturnsRealNumber(reader);
            double dollarQuote = ReturnsDollarQuote(reader);
            double conversionFromRealToDollar = ReturnsConversionFromRealToDollar(realNumber, dollarQuote);
            DisplaysData(realNumber, dollarQuote, conversionFromRealToDollar);

        } catch (InputMismatchException e) {
            System.out.println("Erro, entrada inválida");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            reader.close();
            System.out.println("\nFim do programa");
        }
    }

    /* SUB-ROUTINES */
    public static double ReturnsRealNumber(Scanner reader) {
        double realNumber = 0.0;

        do {
            System.out.print("Digite um valor real [utilize vírgula como separador]: ");
            realNumber = reader.nextDouble();
        } while (realNumber < 0);

        return realNumber;
    }

    public static double ReturnsDollarQuote(Scanner reader) {
        double dollarQuote = 0.0;

        do {
            System.out.print("Digite a cotação do dolar [utilize vírgula como separador]: ");
            dollarQuote = reader.nextDouble();
        } while (dollarQuote < 0);

        return dollarQuote;
    }

    public static double ReturnsConversionFromRealToDollar(double realNumber, double dollarQuote) {
        double conversionFromRealToDollar = realNumber * dollarQuote;
        return conversionFromRealToDollar;
    }

    public static void DisplaysData(double realNumber, double dollarQuote, double conversionFromRealToDollar) {
        System.out.println("\nExibindo dados");
        System.out.printf("Valor real: R$ %.2f%n", realNumber);
        System.out.printf("Cotação do dolar: R$ %.2f%n", dollarQuote);
        System.out.printf("Conversão de Real para Dólar: R$ %.2f%n", conversionFromRealToDollar);
    }
}
