import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            int numberOfCharactersThatWillBeTyped = RequestNumberOfCharactersThatWillBeTyped(scanner);
            char stringReceived_vector[] = GenerateSequence(numberOfCharactersThatWillBeTyped, scanner);
            char copyStringReceived_vector[] = GenerateCopyStringReceived_vector(stringReceived_vector);

            PrintReport(copyStringReceived_vector);

        } catch (InputMismatchException e) {
            System.out.println("-->Erro: entrada inválida de dados");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("\nFim do programa");
        }
    }

    /* SUB-ROUTINES */
    public static int RequestNumberOfCharactersThatWillBeTyped(Scanner scanner) {
        int numberOfCharactersThatWillBeTyped = 0;
        
        System.out.println("");
        
        do {
            System.out.print("Infome a quantidade de caracteres que serão digitados [valor positivo e inteiro]: ");
            numberOfCharactersThatWillBeTyped = scanner.nextInt();
        } while (numberOfCharactersThatWillBeTyped < 0);

        return numberOfCharactersThatWillBeTyped;
    }

    public static char[] GenerateSequence(int numberOfCharactersThatWillBeTyped, Scanner scanner) {
        char stringReceived_vector[] = new char[numberOfCharactersThatWillBeTyped];

        System.out.printf("\nInforme abaixo o total de %d caracter(s)%n", numberOfCharactersThatWillBeTyped);

        for (int i = 0; i < stringReceived_vector.length; i++) {
            System.out.printf("Digite a %dª caracter: ", (i + 1));
            stringReceived_vector[i] = scanner.next().toUpperCase().charAt(0);
        }

        return stringReceived_vector;
    }

    public static char[] GenerateCopyStringReceived_vector(char stringReceived_vector[]) {
        char copy_vetor[] = new char[stringReceived_vector.length];
        System.arraycopy(stringReceived_vector, 0, copy_vetor, 0, stringReceived_vector.length);
        return copy_vetor;
    }

    public static void PrintReport(char copyStringReceived_vector[]) {
        int totalCharacter_a = 0;
        int totalCharacter_u = 0;
        int totalCharacter_o = 0;
        int totalCharacter_i = 0;
        int totalCharacter_e = 0;

        System.out.print("\nSequência de caracteres informados: ");

        for (int i = 0; i < copyStringReceived_vector.length; i++) {
            System.out.printf("%c ", copyStringReceived_vector[i]);
        }

        for (int i = 0; i < copyStringReceived_vector.length; i++) {
            switch (copyStringReceived_vector[i]) {
                case 'A':
                    totalCharacter_a += 1;
                    break;

                case 'E':
                    totalCharacter_e += 1;
                    break;

                case 'I':
                    totalCharacter_i += 1;
                    break;

                case 'O':
                    totalCharacter_o += 1;
                    break;

                case 'U':
                    totalCharacter_u += 1;
                    break;

                default:
                    break;
            }
        }
        
        System.out.println("\n\nRelação da quantidade total de cada vogal encontrada");
        System.out.printf("Vogal A: %d%n", totalCharacter_a);
        System.out.printf("Vogal E: %d%n", totalCharacter_e);
        System.out.printf("Vogal I: %d%n", totalCharacter_i);
        System.out.printf("Vogal O: %d%n", totalCharacter_o);
        System.out.printf("Vogal U: %d%n", totalCharacter_u);
    }
}
