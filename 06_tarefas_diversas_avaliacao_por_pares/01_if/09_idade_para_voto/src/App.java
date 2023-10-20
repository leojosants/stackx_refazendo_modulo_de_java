import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitorScanner = new Scanner(System.in);

        int currentyear = 2023;
        int yearReference = 1953;
        int yearBirth;
        int age;

        String message = "";

        System.out.println("\nEntre com os dados solicitados abaixo");

        do {
            System.out.print("Informe o ano de nascimento: ");
            yearBirth = leitorScanner.nextInt();
        } while ((yearBirth < yearReference) || (yearBirth > currentyear));

        age = currentyear - yearBirth;

        if (age < 0) {
            message = "Idade inválida";
        } else if (age < 16) {
            message = "Voto não obrigatório";
        } else if (age <= 17) {
            message = "Voto facultativo";
        } else if (age <= 70) {
            message = "Voto obrigatório";
        } else {
            message = "Voto não obrigatório";
        }

        System.out.println("\nExibindo dados");
        System.out.printf("Para a age de %d ano(s): %s", age, message);

        leitorScanner.close();
    }
}
