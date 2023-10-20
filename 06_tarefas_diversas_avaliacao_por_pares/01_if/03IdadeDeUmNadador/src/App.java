import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitorScanner = new Scanner(System.in);

        int idade;
        String categoria = "";

        System.out.println("\nEntre com os dados solicitados");

        System.out.print("Informe a idade: ");
        idade = leitorScanner.nextInt();

        if (idade < 0) {
            categoria = "IDADE INVALIDA";
        } else if (idade < 5) {
            categoria = "INDEFINIDA";
        } else if (idade <= 7) {
            categoria = "INFANTIL";
        } else if (idade <= 10) {
            categoria = "JUVENIL";

        } else if (idade <= 15) {
            categoria = "ADOLESCENTE";

        } else if (idade <= 30) {
            categoria = "ADULTO";

        } else if (idade > 30) {
            categoria = "SÊNIOR";
        }

        System.out.println("\nExibição de dados");
        System.out.printf("Para a idade de %d anos a categoria é: %s", idade, categoria);
        leitorScanner.close();
    }
}
