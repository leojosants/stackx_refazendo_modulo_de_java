import java.time.Duration;
import java.time.Instant;

public class App {
    public static void main(String[] args) throws Exception {

        Instant initial_instant = Instant.now();
        // System.out.println(initial_instant);

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant final_instant = Instant.now();
        Duration duraration = Duration.between(initial_instant, final_instant);

        System.out.println("Duração em nanos segundos: " + duraration.toNanos());
        System.out.println("Duração em minutos: " + duraration.toMinutes());
        System.out.println("Duração em horas: " + duraration.toHours());
        System.out.println("Duração em milisegundos: " + duraration.toMillis());
        System.out.println("Duração em dias: " + duraration.toDays());
    }
}
