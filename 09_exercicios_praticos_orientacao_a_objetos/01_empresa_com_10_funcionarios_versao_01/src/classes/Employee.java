package classes;

public class Employee {

    /* attribute */
    public final double MINIMUM_WAGE = 450.0;
    private int numberOfHoursWorkedInTheMonth;
    private int code;
    private char employeeJobCategory;
    private char demployeeWorkShift;
    private double valueOfTheHourWorked;
    private double initialSalary;
    private double finalSalary;
    private double foodAid;

    /* contructor */
    public Employee(int code, int numberOfHoursWorkedInTheMonth, char demployeeWorkShift, char employeeJobCategory) {
        this.code = code;
        this.numberOfHoursWorkedInTheMonth = numberOfHoursWorkedInTheMonth;
        this.demployeeWorkShift = demployeeWorkShift;
        this.employeeJobCategory = employeeJobCategory;
    }

    /* getters and setters */
    public int getCode() {
        return this.code += (int) (Math.random() * 1000);
    }

    public int getNumberOfHoursWorkedInTheMonth() {
        return this.numberOfHoursWorkedInTheMonth;
    }

    public char getEmployeeWorkShift() {
        return this.demployeeWorkShift;
    }

    public char getEmployeeJobCategory() {
        return this.employeeJobCategory;
    }

    public double getValueOfTheHourWorked() {
        return this.valueOfTheHourWorked;
    }

    public void setValueOfTheHourWorked(double value) {
        this.valueOfTheHourWorked = value;
    }

    public double getInitialSalary() {
        return this.initialSalary;
    }

    public void setInitialSalary(double value) {
        this.initialSalary = value;
    }

    public double getFoodAid() {
        return this.foodAid;
    }

    public void setFoodAid(double value) {
        this.foodAid = value;
    }

    public double getMINIMUM_WAGE() {
        return this.MINIMUM_WAGE;
    }

    public double getFinalSalary() {
        return this.finalSalary;
    }

    public void setFinalSalary(double value) {
        this.finalSalary = value;
    }

    /* methods */
    public double calculateValueOfTheHourWorked() {
        double valueOfTheHourWorked = 0.0;

        if (getEmployeeJobCategory() == 'G') {
            if (getEmployeeWorkShift() == 'N') {
                valueOfTheHourWorked = (getMINIMUM_WAGE() * 18) / 100;

            } else if ((getEmployeeWorkShift() == 'M') || (getEmployeeWorkShift() == 'V')) {
                valueOfTheHourWorked = (getMINIMUM_WAGE() * 15) / 100;
            }

        } else if (getEmployeeJobCategory() == 'O') {
            if (getEmployeeWorkShift() == 'N') {
                valueOfTheHourWorked = (getMINIMUM_WAGE() * 13) / 100;

            } else if ((getEmployeeWorkShift() == 'M') || (getEmployeeWorkShift() == 'V')) {
                valueOfTheHourWorked = (getMINIMUM_WAGE() * 10) / 100;
            }
        }

        setValueOfTheHourWorked(valueOfTheHourWorked);
        return getValueOfTheHourWorked();
    }

    public double calculateInitialSalary() {
        double initialSalary = 0.0;
        initialSalary = valueOfTheHourWorked * numberOfHoursWorkedInTheMonth;
        setInitialSalary(initialSalary);
        return getInitialSalary();
    }

    public double calulateFoodAid() {
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

    public double calulateFinalSalary() {
        double finalSalary = 0.0;
        finalSalary = getInitialSalary() + getFoodAid();
        setFinalSalary(finalSalary);
        return getFinalSalary();
    }

    public void displayData() {
        System.out.println("\n--> Exibindo dados do funcionário");
        System.out.printf("Código: %d%n", getCode());
        System.out.printf("Número de horas trabalhadas: %d%n", getNumberOfHoursWorkedInTheMonth());
        System.out.printf("Valor da hora trabalhada: R$ %.2f%n", calculateValueOfTheHourWorked());
        System.out.printf("Salário inicial: R$ %.2f%n", calculateInitialSalary());
        System.out.printf("Auxílio alimentação: R$ %.2f%n", calulateFoodAid());
        System.out.printf("Salário final: R$ %.2f%n", calulateFinalSalary());
    }
}
