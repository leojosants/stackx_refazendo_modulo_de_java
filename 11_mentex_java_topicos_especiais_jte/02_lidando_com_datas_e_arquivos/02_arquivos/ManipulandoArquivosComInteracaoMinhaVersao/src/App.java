import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            String file_name = "";
            String initial_text = "";
            String add_line_option;
            Path file_path;

            System.out.println("\nInsira os dados referente ao aquivo");

            do {
                System.out.print("Digite o nome do arquivo: ");
                file_name = scanner.nextLine().replace(" ", "_").toLowerCase().trim();

                while (file_name.equals("")) {
                    System.out.print(
                            "-> campo 'nome do arquivo' não pode ser vazio, digite o nome do arquivo novamente: ");
                    file_name = scanner.nextLine().replace(" ", "_").toLowerCase().trim();
                }
            } while (file_name.equals(""));

            file_path = getFilePath(file_name);

            do {
                System.out.print("\nDigite o conteúdo inicial do arquivo: ");
                initial_text = scanner.nextLine().trim() + "\n";

                while (initial_text.equals("")) {
                    System.out.print(
                            "-> campo 'conteúdo inicial do arquivo' não pode ser vazio, digite o conteúdo inicial do arquivo: ");
                    initial_text = scanner.nextLine().trim();
                }
            } while (initial_text.equals(""));

            createAndWriteToFile(file_name, initial_text);

            System.out.printf("-> arquivo criado com sucesso e salvo no caminho: %s%n", getFilePath(file_name));

            do {
                System.out.print("\nDeseja adicionar mais uma linha ao arquivo [S]-sim ou [N]-não: ");
                add_line_option = scanner.nextLine();

                if (add_line_option.equalsIgnoreCase("s")) {
                    System.out.print("Insira o conteúdo a ser adicionado ao arquivo: ");
                    String new_text = scanner.nextLine() + "\n";

                    addText(file_path, new_text);

                    System.out.println("-> alteração salva");
                }
            } while (add_line_option.equalsIgnoreCase("s"));

            readFile(file_path);

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("\n-> fim do programa");
        }
    }

    /*
     * methods
     */
    private static Path getFilePath(String file_name) {
        String file_path = "C:\\temp\\" + file_name + ".txt";

        Path path = Paths.get(file_path);
        return path;
    }

    private static void createAndWriteToFile(String file_name, String text) throws IOException {
        String file_path = "C:\\temp\\" + file_name + ".txt";
        Files.write(Path.of(file_path), text.getBytes());
    }

    private static void addText(Path file_path, String new_text) throws IOException {

        Files.write(file_path, new_text.getBytes(), StandardOpenOption.APPEND);
    }

    private static void readFile(Path file_path) throws IOException {
        System.out.println("\nExibindo dados do arquivo");

        Files.lines(file_path).forEach(line -> {
            System.out.println(line);
        });
    }
}
