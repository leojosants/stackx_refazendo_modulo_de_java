package classes;

public class PayStub {

    /* attribute */
    public static final double MINIMUM_WAGE = 450.00;
    private EmployeeV2 employee;
    private int numberOfHoursWorkedInTheMonth;
    private double valueOfTheHourWorked;
    private double initialSalary;
    private double finalSalary;
    private double foodAid;

    /* construtcor */
    public PayStub(EmployeeV2 employee) {
        this.employee = employee;
    }

    /* getters and setters */
    public static double getMinimumWage() {
        return MINIMUM_WAGE;
    }

    public EmployeeV2 getEmployee() {
        return this.employee;
    }

    public int getNumberOfHoursWorkedInTheMonth() {
        return this.numberOfHoursWorkedInTheMonth;
    }

    public void setNumberOfHoursWorkedInTheMonth(int numberOfHoursWorkedInTheMonth) {
        this.numberOfHoursWorkedInTheMonth = numberOfHoursWorkedInTheMonth;
    }

    public double getInitialSalary() {
        return this.initialSalary;
    }

    public void setInitialSalary(double initialSalary) {
        this.initialSalary = initialSalary;
    }

    public double getFinalSalary() {
        return this.finalSalary;
    }

    private void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }

    public double getFoodAid() {
        return this.foodAid;
    }

    private void setFoodAid(double foodAid) {
        this.foodAid = foodAid;
    }

    public double getValueOfTheHourWorked() {
        return this.valueOfTheHourWorked;
    }

    private void setValueOfTheHourWorked(double value) {
        this.valueOfTheHourWorked = value;
    }

    public double getMINIMUM_WAGE() {
        return PayStub.MINIMUM_WAGE;
    }

    /* methods */
    private double calculateValueOfTheHourWorked() {
        double valueOfTheHourWorked = 0.0;

        if (getEmployee().getEmployeeJobCategory() == 'G') {
            if (getEmployee().getEmployeeWorkShift() == 'N') {
                valueOfTheHourWorked = (getMINIMUM_WAGE() * 18) / 100;

            } else if ((getEmployee().getEmployeeWorkShift() == 'M')
                    || (getEmployee().getEmployeeWorkShift() == 'V')) {
                valueOfTheHourWorked = (getMINIMUM_WAGE() * 15) / 100;
            }

        } else if (getEmployee().getEmployeeJobCategory() == 'O') {
            if (getEmployee().getEmployeeWorkShift() == 'N') {
                valueOfTheHourWorked = (getMINIMUM_WAGE() * 13) / 100;

            } else if ((getEmployee().getEmployeeWorkShift() == 'M')
                    || (getEmployee().getEmployeeWorkShift() == 'V')) {
                valueOfTheHourWorked = (getMINIMUM_WAGE() * 10) / 100;
            }
        }

        setValueOfTheHourWorked(valueOfTheHourWorked);
        return getValueOfTheHourWorked();
    }

    private double calculateInitialSalary() {
        double initialSalary = 0.0;
        initialSalary = valueOfTheHourWorked * numberOfHoursWorkedInTheMonth;
        setInitialSalary(initialSalary);
        return getInitialSalary();
    }

    private double calulateFoodAid() {
        double foodAid = 0.0;

        if (getInitialSalary() <= 300.00) {
            foodAid = (getInitialSalary() * 20) / 100;

        } else if (getInitialSalary() <= 600.00) {
            foodAid = (getInitialSalary() * 20) / 100;

        } else if (getInitialSalary() > 600.00) {
            foodAid = (getInitialSalary() * 20) / 100;
        }

        setFoodAid(foodAid);
        return getFoodAid();
    }

    private double calulateFinalSalary() {
        double finalSalary = 0.0;
        finalSalary = getInitialSalary() + getFoodAid();
        setFinalSalary(finalSalary);
        return getFinalSalary();
    }

    public void printEmploee() {
        System.out.println("--> Exibindo dados do funcionário");
        System.out.printf("Código: %d%n", getEmployee().getCode());
        System.out.printf("Número de horas trabalhadas: %d%n", getNumberOfHoursWorkedInTheMonth());
        System.out.printf("Valor da hora trabalhada: R$ %.2f%n",
                calculateValueOfTheHourWorked());
        System.out.printf("Salário inicial: R$ %.2f%n", calculateInitialSalary());
        System.out.printf("Auxílio alimentação: R$ %.2f%n", calulateFoodAid());
        System.out.printf("Salário final: R$ %.2f%n%n", calulateFinalSalary());
    }
}
