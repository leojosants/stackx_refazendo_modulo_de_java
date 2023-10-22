import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        int medicationInQuestionHas500mgml = 500;
        int eachMlCorrespondsTo20Drops = 20;
        int eachDropContains25mg = medicationInQuestionHas500mgml / eachMlCorrespondsTo20Drops;
        int indicatedDosageInMG = 0;
        int age = 0;
        double numberOfDropsIndicated = 0.0;
        double weight = 0.0;

        System.out.println("\nEntre com os dados abaixo solicitados");

        do {
            System.out.print("Digite a idade: ");
            age = readerScanner.nextInt();

            while (age < 0) {
                System.out.print("Digite um valor positivo para a idade: ");
                age = readerScanner.nextInt();
            }
        } while (age < 0);

        do {
            System.out.print("Digite o peso acima 4 [kg]: ");
            weight = readerScanner.nextDouble();

            while ((weight < 0) || (weight < 5)) {
                System.out.print("Digite um valor positivo para um peso acima de 4 [kg]: ");
                weight = readerScanner.nextDouble();
            }
        } while (weight < 0);

        if (age < 12) {
            if (weight <= 9) {
                indicatedDosageInMG = 125;
                numberOfDropsIndicated = indicatedDosageInMG / eachDropContains25mg;

            } else if (weight <= 16) {
                indicatedDosageInMG = 250;
                numberOfDropsIndicated = indicatedDosageInMG / eachDropContains25mg;

            } else if (weight <= 24) {
                indicatedDosageInMG = 375;
                numberOfDropsIndicated = indicatedDosageInMG / eachDropContains25mg;

            } else if (weight <= 30) {
                indicatedDosageInMG = 500;
                numberOfDropsIndicated = indicatedDosageInMG / eachDropContains25mg;

            } else {
                indicatedDosageInMG = 750;
                numberOfDropsIndicated = indicatedDosageInMG / eachDropContains25mg;
            }

        } else {
            if (weight < 60) {
                indicatedDosageInMG = 850;
                numberOfDropsIndicated = indicatedDosageInMG / eachDropContains25mg;

            } else {
                indicatedDosageInMG = 1000;
                numberOfDropsIndicated = indicatedDosageInMG / eachDropContains25mg;
                System.out.println(numberOfDropsIndicated);
            }
        }

        System.out.println("\nExibindo dados");
        System.out.printf("Quantidade de gota(s) indicada(s): %.0f gotas %n", numberOfDropsIndicated);
        System.out.printf("Quantidade de mg indicado: %d mg %n", indicatedDosageInMG);

        readerScanner.close();
    }
}