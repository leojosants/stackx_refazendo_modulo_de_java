import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDateTime hours = LocalDateTime.of(2016, Month.APRIL, 4, 22, 30);
        System.out.println(hours);
        System.out.println();

        ZoneId sao_paulo_time_zone = ZoneId.of("America/Sao_Paulo");
        System.out.println(sao_paulo_time_zone);

        ZonedDateTime sao_paulo_time = ZonedDateTime.of(hours, sao_paulo_time_zone);
        System.out.println(sao_paulo_time);
        System.out.println();

        ZoneId paris_time_zone = ZoneId.of("Europe/Paris");
        System.out.println(paris_time_zone);

        ZonedDateTime paris_time = ZonedDateTime.of(hours, paris_time_zone);
        System.out.println(paris_time);

        Duration difference_in_hours = Duration.between(sao_paulo_time, paris_time);
        System.out.printf("\nDiferença de horas entre %s e %s: %d%n", sao_paulo_time_zone, paris_time_zone,
                difference_in_hours.getSeconds() / 60 / 60);
    }
}
