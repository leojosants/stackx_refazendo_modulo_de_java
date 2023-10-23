import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);

        try {
            int currentYear = 2023;
            int yearOfBirth = ReturnsTheYearOfBirth(reader);
            int currentAge = ReturnsCurrentAge(yearOfBirth, currentYear);
            int ageIn2050 = RetornsAgeIn2050(currentYear, currentAge);
            DisplaysData(yearOfBirth, currentAge, ageIn2050);

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
    public static int ReturnsTheYearOfBirth(Scanner reader) {
        int yearOfBirth = 0;

        do {
            System.out.print("Digite o ano de nascimento [numero positivo]: ");
            yearOfBirth = reader.nextInt();
        } while (yearOfBirth < 0);

        return yearOfBirth;
    }

    public static int ReturnsCurrentAge(int yearOfBirth, int currentYear) {
        int currentAge = currentYear - yearOfBirth;
        return currentAge;
    }

    public static int RetornsAgeIn2050(int currentYear, int currentAge) {
        int ano2050 = 2050;
        int ageIn2050 = (ano2050 - currentYear + currentAge);
        return ageIn2050;
    }

    public static void DisplaysData(int yearOfBirth, int currentAge, int ageIn2050) {
        System.out.println("\nExibindo dados");
        System.out.printf("Ano de nascimento: %d%n", yearOfBirth);
        System.out.printf("Idade atual: %d anos%n", currentAge);
        System.out.printf("A idade em 2050 será: : %d anos%n", ageIn2050);
    }
}
