import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        String valid_file_path = "new_file.txt";
        String invalid_file_path = "=--";

        File file = new File(invalid_file_path);

        try {

            if (file.createNewFile()) {
                System.out.println("Arquivo criado com sucesso");
                System.out.printf("Nome do arquivo: %s%n", file.getName());

            } else {
                System.out.println("Arquivo já existe");
            }

            System.out.printf("Caminho do arquivo: %s%n", file.getAbsolutePath());
            System.out.printf("Nome do arquivo:    %s%n", file.getPath());
            System.out.printf("Tamanho do arquivo: %d bytes%n", file.length());

        } catch (IOException e) {
            System.out.println("-> erro: " + e.getMessage());
        
        } finally {
            System.out.println("-> fim do programa");
        }
    }
}
