import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            int vectorLength = 10;
            int numbers[] = new int[vectorLength];
            int numbersCopy[];

            FillVector(numbers, scanner);

            numbersCopy = MakeVectorCopy(numbers);

            CheckOddNnumber(numbersCopy);
            CheckEvenNumber(numbersCopy);

        } catch (InputMismatchException e) {
            System.out.println("--> Erro: entrada inválida de dados");

        } finally {
            scanner.close();
            System.out.println("Fim do programa");
        }
    }

    /* SUB-ROUTINES */
    public static int[] MakeVectorCopy(int vector[]) {
        int vectorCopied[] = new int[vector.length];
        System.arraycopy(vector, 0, vectorCopied, 0, vector.length);
        return vectorCopied;
    }

    public static void FillVector(int vector[], Scanner scanner) {
        System.out.println("\nInforme 10 números inteiros");

        for (int i = 0; i < vector.length; i++) {
            do {
                System.out.printf("Digite o %dº número [positivo]: ", (i + 1));
                vector[i] = scanner.nextInt();
            } while (vector[i] < 0);
        }
    }

    public static void CheckOddNnumber(int vector[]) {
        System.out.println("\nNúmero(s) ímpar(s) encontrado(s):");

        for (int i = 0; i < vector.length; i++) {
            if ((vector[i] % 2) == 1) {
                System.out.printf("Posição %d: %d%n", i, vector[i]);
            }
        }
    }

    public static void CheckEvenNumber(int vector[]) {
        System.out.println("\nNúmero(s) par(s) encontrado(s):");

        for (int i = 0; i < vector.length; i++) {
            if ((vector[i] % 2) == 0) {
                System.out.printf("Posição %d: %d%n", i, vector[i]);
            }
        }
    }
}
