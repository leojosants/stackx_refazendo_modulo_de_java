import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDateTime current_date_and_time = LocalDateTime.now();
        System.out.printf("Data e hora atual: %s%n", current_date_and_time);

        DateTimeFormatter formatted_current_date_and_time = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatted_current_date_and_time);

        String formatte_date_and_time = current_date_and_time.format(formatted_current_date_and_time);
        System.out.printf("Data e hora atual formatada: %s%n",formatte_date_and_time);
    }
}
