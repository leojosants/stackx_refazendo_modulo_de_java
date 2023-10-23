import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            DisplaysInitialMessage();

            int age = ReturnsAge(scanner);
            String category = ReturnsCategory(age);

            DisplaysData(age, category);

        } catch (InputMismatchException e) {
            System.out.println("Erro, entrada de dados inválida");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("\nFim do programa");
        }
    }

    /* SUB-ROUTINES */
    public static void DisplaysInitialMessage() {
        System.out.println("\nInforme os dados solicitados abaixo");
    }

    public static int ReturnsAge(Scanner scanner) {
        int age = 0;

        do {
            System.out.print("Digite a idade em anos [valor positivo]: ");
            age = scanner.nextInt();
        } while (age < 0);

        return age;
    }

    public static String ReturnsCategory(int age) {
        String category = "";

        if (age <= 10) {
            category = "Infantil";

        } else if (age <= 17) {
            category = "Juvenil";

        } else {
            category = "Sênior";
        }

        return category;
    }

    public static void DisplaysData(int age, String category) {
        System.out.println("\nExibindo dados");
        System.out.printf("Idade: \t   %d anos%n", age);
        System.out.printf("Categoria: %s%n", category);
    }
}