import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * LocalDateTime
         */
        LocalDateTime current_date_and_time = LocalDateTime.now();
        System.out.printf("Data a hora atual: %s%n", current_date_and_time);
        System.out.println();
    }
}
