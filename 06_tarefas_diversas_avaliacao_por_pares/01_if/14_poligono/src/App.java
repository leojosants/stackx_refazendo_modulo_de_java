import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        String typeOfPolygon = "";
        double calculationArea = 0.0;
        double measurementSides;
        int totalSides;

        System.out.println("\nEntre com os dados solicitados abaixo de um poligono retangulo");

        // do {
        System.out.print("Digite o numero de lados (número positivo): ");
        totalSides = readerScanner.nextInt();
        // } while (totalSides < 3);

        do {
            System.out.print("Medida do lado [cm]: ");
            measurementSides = readerScanner.nextDouble();
        } while (measurementSides <= 0);

        if (totalSides < 3) {
            typeOfPolygon = "Não é um polígono";

        } else if (totalSides == 3) {
            typeOfPolygon = "Triangulo";
            calculationArea = (measurementSides * measurementSides) / 2;

        } else if (totalSides == 4) {
            typeOfPolygon = "Quadrado";
            calculationArea = Math.pow(measurementSides, 2);

        } else if (totalSides == 5) {
            typeOfPolygon = "Pentágono";
            calculationArea = (5 * (Math.pow(measurementSides, 2)) / (4 * (Math.tan(Math.toRadians(36)))));

        } else if (totalSides > 5) {
            typeOfPolygon = "Polígono não identificado";
        }

        System.out.println("\nExibindo dados");
        System.out.printf("Total de lados: %d%n", totalSides);
        System.out.printf("Polígono do tipo: %s%n", typeOfPolygon);

        if ((totalSides > 3) && (totalSides < 5)) {
            System.out.printf("Valor da área: %.2fcm²", calculationArea);
        }

        readerScanner.close();
    }
}