import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        int counter = 1;
        double value = 1.0;
        double squareValue;
        double valueCube;
        double rootSquareValue;

        System.out.println("\nEntre com os dados solicitados abaixo");

        while (value > 0.0) {
            System.out.printf("Digite o %dº value: ", counter);
            value = readerScanner.nextDouble();

            squareValue = value * 2;
            valueCube = Math.pow(value, 3);
            rootSquareValue = Math.sqrt(value);

            if (value > 0.0) {
                System.out.println("\nExibindo dados");
                System.out.printf("Valor informado: %.2f%n", value);
                System.out.printf("squareValue: %.2f%n", squareValue);
                System.out.printf("Cubo: %.2f%n", valueCube);
                System.out.printf("Raiz Quadrada: %.2f%n%n", rootSquareValue);
            }
            else {
                 System.out.println("\nEntrada de dados finalizada");
            }

            counter++;
        }

        readerScanner.close();
    }
}
