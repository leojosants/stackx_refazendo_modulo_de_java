package classes;

public class Circle2 implements GeometricFigure2 {
    /*
     * attribute
     */
    private int ray;

    /*
     * constructor
     */
    public Circle2() {
    }

    public Circle2(int ray) {
        this.setRay(ray);
    }

    /*
     * getter and setter
     */
    public int getRay() {
        return ray;
    }

    public void setRay(int ray) {
        this.ray = ray;
    }

    /*
     * method
     */
    @Override
    public double calculateArea() {
        double area_calculation = 0.0;
        double PI = Math.PI;
        area_calculation = PI * (Math.pow(this.getRay(), 2));
        return area_calculation;
    }
}