import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        int firstAngle = 0;
        int secondAngle = 0;
        int thirdAngle = 0;
        String typeOfTriangle = "";

        System.out.println("\nEntre com os três ângulo de um triângulo");
        System.out.print("Primeiro ângulo [º]: ");
        firstAngle = readerScanner.nextInt();

        System.out.print("Segundo  ângulo [º]: ");
        secondAngle = readerScanner.nextInt();

        System.out.print("Terceito ângulo [º]: ");
        thirdAngle = readerScanner.nextInt();

        if (((firstAngle == 90) && (secondAngle != 90) && (thirdAngle != 90))
                || ((firstAngle != 90) && (secondAngle == 90) && (thirdAngle != 90))
                || ((firstAngle != 90) && (secondAngle != 90) && (thirdAngle == 90))) {
            typeOfTriangle = "Retângulo";

        } else if (((firstAngle > 90) && (secondAngle < 90) && (thirdAngle < 90))
                || ((firstAngle < 90) && (secondAngle > 90) && (thirdAngle < 90))
                || ((firstAngle < 90) && (secondAngle < 90) && (thirdAngle > 90))) {
            typeOfTriangle = "Obtusângulo";

        } else if ((firstAngle < 90) && (secondAngle < 90) && (thirdAngle < 90)) {
            typeOfTriangle = "Acutângulo";
        }

        System.out.println("\nExibindo dados");
        System.out.printf("Tipo do triângulo: %s", typeOfTriangle);

        readerScanner.close();
    }
}
