package classes;

public class Square2 implements GeometricFigure2 {
    /*
     * attributes
     */
    private double side_measurement;

    /*
     * constructor
     */
    public Square2() {
    }
    public Square2(double side_measurement) {
        setSideMeasurement(side_measurement);
    }

    /*
     * getters and setters
     */
    public double getSideMeasurement() {
        return this.side_measurement;
    }

    public void setSideMeasurement(double side_measurement) {
        this.side_measurement = side_measurement;
    }

    /*
     * methods
     */
    @Override
    public double calculateArea() {
        double area_calculation = 0.0;
        area_calculation = Math.pow(this.getSideMeasurement(), 2);
        return area_calculation;
    }
}
