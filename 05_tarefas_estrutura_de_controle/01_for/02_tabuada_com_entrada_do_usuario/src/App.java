import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);
        int userOption;

        System.out.print("\nInforme a tabuada de qual número gostaria de ver: ");
        userOption = reader.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", userOption, i, (i * userOption));
        }
    }
}
