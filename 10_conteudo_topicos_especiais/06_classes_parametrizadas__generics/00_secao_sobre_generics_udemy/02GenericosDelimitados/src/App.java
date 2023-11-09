import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import classes.CalculationService;
import classes.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        List<Product> integers_list = new ArrayList<>();

        String path = "C:\\temp\\in.txt";

        try (BufferedReader buffered_reader = new BufferedReader(new FileReader(path))) {
            String line = buffered_reader.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                integers_list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = buffered_reader.readLine();
            }

            Product x = CalculationService.max(integers_list);
            System.out.printf("Valor máximo entre os produtos: %s%n", x);

        } catch (IOException e) {
            System.out.println("-> erro: " + e.getMessage());

        } finally {
            System.out.println("-> fim do programa");
        }
    }
}
