import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {
            int numbers[] = { 91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50 };
            int copyNumbers[] = ReturnsCopyNumbers(numbers);
            int numberReceived = RequestsData(scanner);
            boolean numberExistsInVector = CheckIfNumberExistsInVector(numberReceived, copyNumbers);
            String numberExistsInVectorString = ConvertBooleanToString(numberExistsInVector);
            DisplaysData(numberReceived, numberExistsInVectorString);

        } catch (InputMismatchException e) {
            System.out.println("Erro, entrada inválida de dados");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("Fim do programa");
        }
    }

    /* SUB-ROUTINES */
    public static int RequestsData(Scanner scanner) {
        int number = 0;

        do {
            System.out.print("Digite um número inteiro [positivo]: ");
            number = scanner.nextInt();
        } while (number < 0);

        return number;
    }

    public static int[] ReturnsCopyNumbers(int numbers[]) {
        int copy[] = new int[numbers.length];
        System.arraycopy(numbers, 0, copy, 0, numbers.length);
        return copy;
    }

    public static boolean CheckIfNumberExistsInVector(int numberReceived, int copyNumbers[]) {
        boolean numberExistsInVector = false;

        for (int i = 0; i < copyNumbers.length; i++) {
            if (copyNumbers[i] == numberReceived) {
                numberExistsInVector = true;
            }
        }

        return numberExistsInVector;
    }

    public static String ConvertBooleanToString(boolean numberExistsInVector) {
        String responseConvertedToString = "";

        if (numberExistsInVector == true) {
            responseConvertedToString="SIM";
        }else {
            responseConvertedToString="NAO";
        }

        return responseConvertedToString.toUpperCase();
    }

    public static void DisplaysData(int numberReceived, String numberExistsInVectorString) {
        System.out.println("\nExibindo dados");
        System.out.printf("Número recebido: %d%n", numberReceived);
        System.out.printf("Número recebido existe no vetor: %s%n", numberExistsInVectorString);
    }
}
