package classes;

public class EmployeeV2 {

    /* attribute */
    private int code;
    private char employeeJobCategory;
    private char demployeeWorkShift;

    /* contructor */
    public EmployeeV2(int code, char demployeeWorkShift, char employeeJobCategory) {
        this.code = code;
        this.demployeeWorkShift = demployeeWorkShift;
        this.employeeJobCategory = employeeJobCategory;
    }

    /* getters and setters */
    public int getCode() {
        return this.code += (int) (Math.random() * 1000);
    }

    public char getEmployeeWorkShift() {
        return this.demployeeWorkShift;
    }

    public char getEmployeeJobCategory() {
        return this.employeeJobCategory;
    }
}
