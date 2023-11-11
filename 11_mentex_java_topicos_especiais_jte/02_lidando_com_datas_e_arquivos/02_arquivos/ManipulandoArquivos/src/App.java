import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class App {

    public final static String FILE_PATH = "C:\\temp\\test_file.txt";

    public static void main(String[] args) throws Exception {

        try {
            createAndWriteToFile("Olá, Mundo!");
            readFile();
            addText("\nadicionado esta linha");
            readFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * methods
     */
    private static void createAndWriteToFile(String text) throws IOException {
        // cria arquivo caso nao exista e escreve dentro
        Files.write(Path.of(FILE_PATH), text.getBytes());
    }

    private static void readFile() throws IOException {
        // buscar arquivo pelo caminho
        Path path = searchFile();

        // acessar arquivo e imprimir cada linha existente
        Files.lines(path).forEach(line -> {
            System.out.println(line);
        });
    }

    private static void addText(String text) throws IOException {
        // buscar arquivo pelo caminho
        Path path = searchFile();

        // acessar arquivo e adicionar texto ao final
        Files.write(path, text.getBytes(), StandardOpenOption.APPEND);
    }

    private static Path searchFile() {
        // buscar arquivo pelo caminho
        Path path = Paths.get(FILE_PATH);
        return path;
    }
}
