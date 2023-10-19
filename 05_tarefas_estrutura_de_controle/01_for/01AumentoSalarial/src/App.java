public class App {
    public static void main(String[] args) throws Exception {

        double salaryInTheYear2000 = 1_000;
        double initialPercentageIncrease = 0.0;
        double percentageIncreaseInTheYear2001 = (salaryInTheYear2000 * 1.5) / 100;
        double salaryInTheYear2001 = salaryInTheYear2000 + percentageIncreaseInTheYear2001;
        double percentageOfFutureIncrease = percentageIncreaseInTheYear2001;
        double salaryBasisForFutureIncreases = salaryInTheYear2001;

        for (int i = 2_000; i <= 2_017; i++) {
            while (i < 2_003) {
                if (i == 2_000) {
                    System.out.printf("\nAno: %d \t\tSalário - R$ %.2f \t\tAumento - R$ %.2f%n", i, salaryInTheYear2000,
                            initialPercentageIncrease);
                }

                if (i == 2_001) {
                    System.out.printf("Ano: %d \t\tSalário - R$ %.2f \t\tAumento - R$ %.2f%n", i, salaryInTheYear2001,
                            percentageOfFutureIncrease);
                }

                i++;
            }

            percentageOfFutureIncrease *= 2;
            System.out.printf("Ano: %d \t\tSalário - R$ %.2f \t\tAumento - R$ %.2f%n", i,
                    (salaryBasisForFutureIncreases + percentageOfFutureIncrease), percentageOfFutureIncrease);
        }
    }
}
