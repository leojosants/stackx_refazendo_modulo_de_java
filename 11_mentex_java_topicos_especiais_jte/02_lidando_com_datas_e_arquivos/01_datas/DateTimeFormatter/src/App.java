import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * LocalDateTime
         */
        LocalDateTime current_date_and_time = LocalDateTime.now();

        /*
         * DateTimeFormatter
         */
        DateTimeFormatter standard_format = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        String formatted_current_date_and_time = current_date_and_time.format(standard_format);
        System.out.printf("Data e hora formatada: %s%n", formatted_current_date_and_time);
    }
}
