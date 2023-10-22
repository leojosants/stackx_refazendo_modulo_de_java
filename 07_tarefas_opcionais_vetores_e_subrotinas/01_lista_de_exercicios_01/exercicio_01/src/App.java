import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner readerScanner = new Scanner(System.in);
        System.out.println("\nEntre com os dados solicitados abaixo");

        String firstPersonName = SolicitaDados(readerScanner);
        String secondPersonName = SolicitaDados(readerScanner);
        String thirdPersonName = SolicitaDados(readerScanner);

        System.out.printf("\nExibindo dados\n");
        ExibeDados(firstPersonName, secondPersonName, thirdPersonName);

        readerScanner.close();
    }

    // subrotinas
    public static String SolicitaDados(Scanner readerScanner) {

        String personsName = "";

        System.out.printf("Digite o nome da pessoa: ");
        personsName = readerScanner.nextLine().toUpperCase();

        while (personsName.equals("")) {
            System.out.print("O campo 'nome' não pode ser vazio, tente novamente: ");
            personsName = readerScanner.nextLine();
        }

        return personsName;
    }

    public static void ExibeDados(String firstPersonName, String secondPersonName, String thirdPersonName) {
        System.out.printf("Nome da primeira pessoa: %s%n", firstPersonName);
        System.out.printf("Nome da segunda  pessoa: %s%n", secondPersonName);
        System.out.printf("Nome da terceira pessoa: %s%n", thirdPersonName);
    }
}
