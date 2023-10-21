import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        int yearOfBirth = 0;
        int currentYear = 0;
        int age = 0;

        System.out.println("\nEntre com os dados abaixo solicitados");

        System.out.print("Digite a ano de nascimento: ");
        yearOfBirth = readerScanner.nextInt();

        System.out.print("Digite o ano atual: ");
        currentYear = readerScanner.nextInt();

        System.out.println("\nExibindo dados");

        if ((yearOfBirth <= 0) || (currentYear <= 0)) {
            System.out.println("Dados inválidos, informe um valor positivo para ano de nascimento e ano atual");

        } else {
            age = currentYear - yearOfBirth;
            System.out.printf("Para o ano de nascimento de %d a age é: %d anos%n", yearOfBirth, age);
        }

        readerScanner.close();
    }
}