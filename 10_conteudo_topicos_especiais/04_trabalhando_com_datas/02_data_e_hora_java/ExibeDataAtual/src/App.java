import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDate current_date = LocalDate.now();
        System.out.printf("Data atual: %s%n",  current_date);
    }
}
