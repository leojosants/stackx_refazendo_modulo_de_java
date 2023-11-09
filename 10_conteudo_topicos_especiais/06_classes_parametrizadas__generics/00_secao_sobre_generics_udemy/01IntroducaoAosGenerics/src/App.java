import java.util.Scanner;

import classes.PrintService;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // PrintService<Integer> print_service = new PrintService<>();
        PrintService<String> print_service = new PrintService<>();

        System.out.print("Quantos valores serão digitados? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº valor: ", (i + 1));
            String value = scanner.next();
            print_service.addValue(value);
        }

        print_service.print();

        String x =  print_service.first();

        System.out.printf("Primeiro valor digitado: %s%n", x);

        scanner.close();
    }
}
