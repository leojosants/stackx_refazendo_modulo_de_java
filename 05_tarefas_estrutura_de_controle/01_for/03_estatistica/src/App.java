import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int code;
        int numberVehicles;
        int numberAccidents;
        int biggestIndexAccident = 0;
        int minorIndexAccident = 100000000;
        int codeMajorCityIndexAccident = 0;
        int CodeCityMenorIndexAccident = 0;
        int totalVehicles = 0;
        int totalAccidentsCitiesLess2000Vehicles = 0;
        int counterCitiesLess2000Vehicles = 0;
        double mediaAllVehicles = 0.0;
        double mediaAccidentsCitiesLess2000Vehicles = 0.0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("\nDADOS DA %dª CIDADE%n", i);
            System.out.print("Código da cidade: ");
            code = leitor.nextInt();

            System.out.print("Número de veículos de passeio: ");
            numberVehicles = leitor.nextInt();

            System.out.print("Número de acidentes de trânsito com vítimas: ");
            numberAccidents = leitor.nextInt();

            totalVehicles += numberVehicles;

            if (numberAccidents > biggestIndexAccident) {
                biggestIndexAccident = numberAccidents;
                codeMajorCityIndexAccident = code;
            }

            if (numberAccidents < minorIndexAccident) {
                minorIndexAccident = numberAccidents;
                CodeCityMenorIndexAccident = code;
            }

            if (numberAccidents < 2_000) {
                totalAccidentsCitiesLess2000Vehicles += numberAccidents;
                counterCitiesLess2000Vehicles++;
                mediaAccidentsCitiesLess2000Vehicles = totalAccidentsCitiesLess2000Vehicles
                        / counterCitiesLess2000Vehicles;
            }
        }

        mediaAllVehicles = totalVehicles / 5;

        System.out.printf("\nMaior índice de acidentes de trânsito é %d e pertence a cidade código %d%n",
                biggestIndexAccident, codeMajorCityIndexAccident);

        System.out.printf("Menor índice de acidentes de trânsito é %d e pertence a cidade código %d%n",
                minorIndexAccident, CodeCityMenorIndexAccident);

        System.out.printf("Média de veículos nas cinco cidades juntas é: %.2f%n", mediaAllVehicles);
        System.out.printf("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é: %.2f%n",
                mediaAccidentsCitiesLess2000Vehicles);

        leitor.close();
    }
}
