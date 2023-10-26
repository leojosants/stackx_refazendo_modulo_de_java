import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o nome: ");
        String name = scanner.nextLine();

        System.out.print("Insira a idade: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // limpa buffer (consome [return] extra)

        System.out.print("Insira o endereço: ");
        String address = scanner.nextLine();

        System.out.println("\nExibindo dados");
        System.out.printf("Nome: %s%n", name);
        System.out.printf("Idade: %d%n", age);
        System.out.printf("Endereço: %s%n", address);

        scanner.close();
    }
}
