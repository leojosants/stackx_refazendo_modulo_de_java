import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitorScanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
       
        int idade = leitorScanner.nextInt();
       
        String categoria = obterCategoria(idade);

        if (categoria.equals("")) {
            System.out.print("\nIdade não suportada");

        } else {
            System.out.printf("\nCategoria: %s%n", categoria);
        }

        leitorScanner.close();
    }

    private static String obterCategoria(int idade) {
        String categoria = "";

        if (idade < 5) {
            categoria = "";

        } else if ((idade >= 5) && (idade <= 7)) {
            categoria = "infantil";

        } else if ((idade >= 8) && (idade <= 10)) {
            categoria = "juvenil";

        } else if ((idade >= 11) && (idade <= 15)) {
            categoria = "Adolescente";

        } else if ((idade >= 16) && (idade <= 30)) {
            categoria = "Adulto";

        } else {
            categoria = "Sênior";
        }

        return categoria;
    }
}