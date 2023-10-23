import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);

        try {
            int currentYear = 2023;
            int age = ReturnsAge(reader);
            int yearOfBirth = ReturnsYearOfBirth(currentYear, age);
            DisplayData(age, yearOfBirth);

        } catch (InputMismatchException e) {
            System.out.println("Erro, entrada inválida");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            reader.close();
            System.out.println("\nFim do programa");
        }
    }

    /* SUB-ROUTINES */
    public static int ReturnsAge(Scanner reader) {
        int age = 0;

        do {
            System.out.print("Digite a idade [anos, número inteiro]: ");
            age = reader.nextInt();
        } while (age < 0);

        return age;
    }

    public static int ReturnsYearOfBirth(int currentYear, int idade) {
        int yearOfBirth = currentYear - idade;
        return yearOfBirth;
    }

    public static void DisplayData(int age, int yearOfBirth) {
        System.out.println("\nExibindo dados");
        System.out.printf("Idade: %d anos%n", age);
        System.out.printf("Ano de nascimento: %d%n", yearOfBirth);
    }
}
