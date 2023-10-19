import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner readerScanner = new Scanner(System.in);
        int age = 0;
        int counter = 1;
        int sumAges = 0;
        double averageAges = 0.0;

        System.out.println("\nInforme várias idades, digite ZERO para finalizar.");

        do {
            System.out.printf("Informa a %dª idade: ", counter);
            age = readerScanner.nextInt();
            sumAges += age;
            counter++;
        } while (age != 0);

        averageAges = sumAges / counter;

        System.out.println("\nEXIBIÇÃO DE DADOS");
        System.out.printf("Total de idade(s) digitada(s): %d%n", counter);
        System.out.printf("Soma da(s) idade(s) digitada(s): %d%n", sumAges);
        System.out.printf("Média da(s) idade(s) digitada(s): %.2f%n%n", averageAges);

        readerScanner.close();
    }
}
