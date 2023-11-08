import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDate date = LocalDate.now();
        System.out.printf("Data atual: %s%n", date);
        System.out.printf("Ano bissexto:          %b%n", date.isLeapYear());
        System.out.printf("Número de dias do mês: %d%n", date.lengthOfMonth());
        System.out.printf("Número de dias do ano: %d%n", date.lengthOfYear());
        System.out.printf("Menor data:            %s%n", LocalDate.MIN);
        System.out.printf("Maior data:            %s%n", LocalDate.MAX);
    }
}
