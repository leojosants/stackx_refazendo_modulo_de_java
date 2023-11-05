package classes;

public class Employee11 extends Person11 {
    /*
     * attributes
     */
    private String sector;
    private boolean is_working;

    /*
     * constructor
     */
    public Employee11() {
    }

    /*
     * getters and setters
     */
    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public boolean getIsWorking() {
        return this.is_working;
    }

    public void setIsWorking(boolean is_working) {
        this.is_working = is_working;
    }

    /*
     * methods
     */
    public void changeJob() {
        this.setIsWorking(!this.getIsWorking());
    }
}
