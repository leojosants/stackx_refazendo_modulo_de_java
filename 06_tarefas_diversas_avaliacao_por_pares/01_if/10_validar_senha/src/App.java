import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitorScanner = new Scanner(System.in);
        int passwordValid = 1234;
        int passwordReceived;
        String message = "";

        System.out.println("\nEntre com os dados solicitados abaixo");
        System.out.print("Digite um senha com somente numeros inteiros: ");
        passwordReceived = leitorScanner.nextInt();

        if (passwordReceived == passwordValid) {
            message = "ACESSO PERMITIDO";
        } else {
            message = "ACESSO NEGADO";
        }

        System.out.println("\nExibiçãode dados");
        System.out.printf("Validação de senha: %s", message);

        leitorScanner.close();
    }
}
