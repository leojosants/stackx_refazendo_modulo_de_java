import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws Exception {

        read();
        write();
        readingDynamicallyCreatedFile();
    }

    /*
     * sub-routines
     */
    private static void read() throws IOException {
        String file_path = "C:\\temp\\file_to_read.txt";
        Path path = Paths.get(file_path);
        Files.lines(path).forEach(line -> System.out.println(line));
    }

    private static void write() throws IOException {
        String file_path = "C:\\temp\\file_write.txt";
        Files.write(Path.of(file_path), "Esse é o conteúdo do arquivo criado dinamicamente".getBytes());
    }

    private static void readingDynamicallyCreatedFile()  throws IOException {
        String file_path = "C:\\temp\\file_write.txt";
        Path path = Paths.get(file_path);
        Files.lines(path).forEach(line -> System.out.println(line));
    }
}
