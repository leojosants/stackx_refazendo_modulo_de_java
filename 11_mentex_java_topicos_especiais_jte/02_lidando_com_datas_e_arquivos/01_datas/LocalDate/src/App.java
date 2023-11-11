import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * LocalDate
         */
        LocalDate current_date = LocalDate.now();
        System.out.printf("\nData atual: %s%n", current_date);
        System.out.printf("Dia do mês [ordinal]: %s%n", current_date.getDayOfMonth());
        System.out.printf("Adiciona mais um dia: %s%n", current_date.plusDays(1));
        System.out.printf("Adiciona mais um mês: %s%n", current_date.plusMonths(1));
        System.out.println();
    }
}
