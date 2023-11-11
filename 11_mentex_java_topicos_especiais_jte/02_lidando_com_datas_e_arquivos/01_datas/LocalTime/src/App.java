import java.time.LocalTime;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * LocalTime
         */
        LocalTime current_time = LocalTime.now();
        System.out.printf("Hora atual: %s%n", current_time);
        System.out.println();
    }
}
