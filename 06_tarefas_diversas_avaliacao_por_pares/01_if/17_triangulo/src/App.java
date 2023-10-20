import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        String typeOfTriangle = "";
        double firstSide = 0.0;
        double secondSide = 0.0;
        double thirdSide = 0.0;

        System.out.println("\nInforme a medidas dos lados de um triângulo");

        do {
            System.out.print("Digite o primeiro lado [cm]: ");
            firstSide = readerScanner.nextDouble();
        } while (firstSide <= 0);

        do {
            System.out.print("Digite o segundo  lado [cm]: ");
            secondSide = readerScanner.nextDouble();
        } while (secondSide <= 0);

        do {
            System.out.print("Digite o terceito lado [cm]: ");
            thirdSide = readerScanner.nextDouble();
        } while (thirdSide <= 0);

        if ((firstSide == secondSide) && (firstSide == thirdSide)) {
            typeOfTriangle = "Equilátero";

        } else if (((firstSide == secondSide) && (firstSide != thirdSide))
                || ((firstSide != secondSide) && (firstSide == thirdSide))) {
            typeOfTriangle = "Isóscele";

        } else if ((firstSide != secondSide) && (firstSide != thirdSide)) {
            typeOfTriangle = "Equilátero";
        }

        System.out.println("\nExibindo dados");
        System.out.printf("O triângulo é: %s", typeOfTriangle);

        readerScanner.close();
    }
}
