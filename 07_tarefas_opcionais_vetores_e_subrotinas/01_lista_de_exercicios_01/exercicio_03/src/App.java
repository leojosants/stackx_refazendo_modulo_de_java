import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);

        try {
            String name = ReturnsName(reader);
            int age = RetornsAge(reader);
            double wage = RetornsWage(reader);
            DisplaysData(name, age, wage);

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
    public static String ReturnsName(Scanner reader) {
        String name = "";
        do {
            System.out.print("Digite o nome [somente letras, campo obrigatório]: ");
            name = reader.nextLine().toUpperCase();
        } while (name.equals(""));

        return name;
    }

    public static int RetornsAge(Scanner reader) {
        int age = 0;

        do {
            System.out.print("Digite a idade [valor positivo]: ");
            age = reader.nextInt();
        } while (age < 0);

        return age;
    }

    public static double RetornsWage(Scanner reader) {
        double wage = 0;

        do {
            System.out.print("Digite o salário [valor positivo e vírgula como separador]: R$ ");
            wage = reader.nextDouble();
        } while (wage < 0);

        return wage;
    }

    public static void DisplaysData(String name, int age, double wage) {
        System.out.println("\nExibindo dados");
        System.out.printf("Nome: %s%n", name);
        System.out.printf("Idade: %s%n", age);
        System.out.printf("Salário: R$ %.2f%n", wage);
    }
}
