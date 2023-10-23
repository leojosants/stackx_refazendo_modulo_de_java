import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);

        try {
            int valueA = ReturnsValueA(reader);
            int valueB = ReturnsValueB(reader);
            DisplayData(valueA, valueB);

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
    public static int ReturnsValueA(Scanner reader) {
        System.out.print("Digite um valor para A [positivo / negativo]: ");
        int valueA = reader.nextInt();
        return valueA;
    }

    public static int ReturnsValueB(Scanner reader) {
        System.out.print("Digite um valor para B [positivo / negativo]: ");
        int valueB = reader.nextInt();
        return valueB;
    }

    public static void InverteValores(int valueA, int valueB) {
        int temporaria = valueA;
        int valorAInvertida = valueB;
        int valorBInvertida = temporaria;
        System.out.printf("Valor de A agora é: %d%n", valorAInvertida);
        System.out.printf("Valor de B agora é: %d%n", valorBInvertida);
    }

    public static void DisplayData(int valueA, int valueB) {
        System.out.println("\nExibindo dados");
        System.out.printf("Valor de A: %d%n", valueA);
        System.out.printf("Valor de B: %d%n", valueB);
        InverteValores(valueA, valueB);
    }
}
