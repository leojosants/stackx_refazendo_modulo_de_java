import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDate local_date = LocalDate.now();
        String name_of_the_day_of_the_week = local_date.getDayOfWeek().name();
        int number_of_the_day_of_the_week = local_date.getDayOfWeek().ordinal();
        int number_month = local_date.getMonthValue();
        String name_of_the_month = local_date.getMonth().name();
        int year=local_date.getYear();

        System.out.printf("Data atual: %s%n", local_date);
        System.out.printf("Dia da semana [nome]: %s%n", name_of_the_day_of_the_week);
        System.out.printf("Dia da semana [ordinal]: %d%n", number_of_the_day_of_the_week);
        System.out.printf("Mês [ordinal]: %d%n", number_month);
        System.out.printf("Mês [nome]: %s%n", name_of_the_month);
        System.out.printf("Ano [ordinal]: %d%n", year);

        System.out.println();
    }
}
