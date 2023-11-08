import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        
        LocalDate today = LocalDate.now();
        System.out.printf("Data atual: %s%n", today);
        System.out.println();
        
        DateTimeFormatter slash_formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(slash_formatter);

        DateTimeFormatter dash_formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dash_formatter);

        System.out.printf("\nData com barra /: %s%n",today.format(slash_formatter));
        System.out.printf("Data com traço -: %s%n",today.format(dash_formatter));
    }
}
