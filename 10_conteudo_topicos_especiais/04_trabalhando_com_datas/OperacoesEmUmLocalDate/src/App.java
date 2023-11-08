import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDate date_manipulation = LocalDate.now();
        System.out.printf("Data atual:           %s%n", date_manipulation);
        System.out.printf("Adicionado 5 dias:    %s%n", date_manipulation.plusDays(5));
        System.out.printf("Adicionado 5 semanas: %s%n", date_manipulation.plusWeeks(5));
        System.out.printf("Adicionado 5 anos:    %s%n", date_manipulation.plusYears(5));
        System.out.printf("Adicionado 5 meses:   %s%n", date_manipulation.plusMonths(5));
        System.out.printf("Subtraido  5 anos:    %s%n", date_manipulation.minusYears(5));
        System.out.printf("Subtraido  5 meses:   %s%n", date_manipulation.minusMonths(5));
        System.out.printf("Subtraido  5 dias:    %s%n", date_manipulation.minusDays(5));
        System.out.printf("Subtraido  5 semanas: %s%n", date_manipulation.minusWeeks(5));
    }
}
