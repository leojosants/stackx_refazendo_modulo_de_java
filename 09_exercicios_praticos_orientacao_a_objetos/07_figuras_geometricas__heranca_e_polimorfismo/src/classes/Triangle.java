package classes;

public class Triangle extends GeometricFigure {
    /*
     * attribute
     */
    private double base;
    private double height;

    /*
     * constructor
     */
    public Triangle() {
    }

    public Triangle(double base, double height) {
        this.setBase(base);
        this.setHeight(height);
    }

    /*
     * getters and setters
     */
    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /*
     * method
     */
    @Override
    public double calculateArea() {
        double area_calculation = 0.0;
        area_calculation = (this.getBase() * this.getHeight()) / 2;
        return area_calculation;
    }
}
