import java.time.LocalDate;
import java.time.Period;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDate old_localDate = LocalDate.of(2010, 3, 7);
        LocalDate new_localDate = LocalDate.of(2015, 3, 5);

        System.out.printf("Data antiga: %s%n", old_localDate);
        System.out.printf("Data nova:   %s%n", new_localDate);
        System.out.printf("\nA data %s é depois da data %s: %b%n", old_localDate, new_localDate,
                old_localDate.isAfter(new_localDate));
        System.out.printf("A data %s é antes da data %s:  %b%n", old_localDate, new_localDate,
                old_localDate.isBefore(new_localDate));
        System.out.printf("A data %s é igual a data %s:   %b%n", old_localDate, new_localDate,
                old_localDate.isEqual(new_localDate));

        Period period = Period.between(old_localDate, new_localDate);

        System.out.printf("\nReferência do período entre %s e %s: %s%n", old_localDate, new_localDate, period);

        System.out.printf("\nDiferença entre %s e %s%n", old_localDate, new_localDate);
        System.out.printf("%d anos, ", period.getYears());
        System.out.printf("%d meses e ", period.getMonths());
        System.out.printf("%d dias %n", period.getDays());
        System.out.printf("%d meses no total %n", period.toTotalMonths());
    }
}
