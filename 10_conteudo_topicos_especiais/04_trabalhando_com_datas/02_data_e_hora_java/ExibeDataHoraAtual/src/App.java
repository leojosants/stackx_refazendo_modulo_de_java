import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDateTime current_date_and_time = LocalDateTime.now();
        System.out.printf("Data e hora atual: %s%n",  current_date_and_time);
    }
}
