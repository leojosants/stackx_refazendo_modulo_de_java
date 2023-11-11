import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Insira o nome para o arquivo: ");
            String file_name = scanner.nextLine();
            String file_path = file_name + ".txt";

            System.out.print("Insira o conteúdo do arquivo: ");
            String text = scanner.nextLine() + "\n";

            Files.write(Paths.get(file_path), text.getBytes());

            System.out.println("-> arquivo salvo");

            String option = "s";

            while (option.equalsIgnoreCase("s")) {
                System.out.print("Deseja adicionar mais uma linha ao arquivo [S]-sim ou [N]-não: ");
                option = scanner.nextLine();

                if (option.equalsIgnoreCase("s")) {
                    System.out.print("Insira o conteúdo a ser adicionado ao arquivo: ");
                    String new_text = scanner.nextLine() + "\n";

                    Files.write(Paths.get(file_path), new_text.getBytes(), StandardOpenOption.APPEND);

                    System.out.println("-> alteração salva");
                }
            }

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("\n-> fim do programa");
        }
    }
}
