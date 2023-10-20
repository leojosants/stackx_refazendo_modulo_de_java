import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        int firstValue;
        int secondValue;
        int thirdValue;

        int firstPosition = 0;
        int secondPosition = 0;
        int thirdPosition = 0;

        System.out.println("\nInforme 3 valores inteiros");
        System.out.print("Primeiro valor: ");
        firstValue = readerScanner.nextInt();

        System.out.print("Segundo  valor: ");
        secondValue = readerScanner.nextInt();

        System.out.print("Terceiro valor: ");
        thirdValue = readerScanner.nextInt();

        if ((firstValue > secondValue) && (firstValue > thirdValue)) { // - - pv
            if (secondValue > thirdValue) { // tv sv pv
                firstPosition = thirdValue;
                secondPosition = secondValue;
                thirdPosition = firstValue;

            } else if (thirdValue > secondValue) { // sv tv pv
                firstPosition = secondValue;
                secondPosition = thirdValue;
                thirdPosition = firstValue;
            }
        } else if ((secondValue > firstValue) && (secondValue > thirdValue)) { // - - sv
            if (firstValue > thirdValue) { // tv pv sv
                firstPosition = thirdValue;
                secondPosition = firstValue;
                thirdPosition = secondValue;

            } else if (thirdValue > firstValue) { // pv tv sv
                firstPosition = firstValue;
                secondPosition = thirdValue;
                thirdPosition = secondValue;

            }
        } else if ((thirdValue > firstValue) && (thirdValue > secondValue)) { // - - tv
            if (firstValue > secondValue) { // sv pv tv
                firstPosition = secondValue;
                secondPosition = firstValue;
                thirdPosition = thirdValue;

            } else if (secondValue > firstValue) { // pv sv tv
                firstPosition = firstValue;
                secondPosition = secondValue;
                thirdPosition = thirdValue;
            }
        }

        System.out.println("\nPosição dos valores recebidos");
        System.out.printf("1ª Posição: %d%n", firstValue);
        System.out.printf("2ª Posição: %d%n", secondValue);
        System.out.printf("3ª Posição: %d%n", thirdValue);

        System.out.println("\nValores ordenados de forma crescente");
        System.out.printf("1ª Posição: %d%n", firstPosition);
        System.out.printf("2ª Posição: %d%n", secondPosition);
        System.out.printf("3ª Posição: %d%n", thirdPosition);

        readerScanner.close();
    }
}
