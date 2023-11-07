package classes;

public class Classs implements Comparable<Classs> {
    /*
     * Attributes
     */
    private String title;
    private int time;

    /*
     * constructor
     */
    public Classs(String title, int time) {
        this.title = title;
        this.time = time;
    }

    /*
     * getters and setters
     */
    public String getTitle() {
        return title;
    }

    public int getTime() {
        return time;
    }

    /*
     * methods
     */
    @Override
    public String toString() {
        return "[Aula: " + this.getTitle() + ", " + this.getTime() + " minutos]";
    }

    public void printClass() {
        System.out.println(toString());
    }

    @Override
    public int compareTo(Classs other_class) {
        return this.getTitle().compareTo(other_class.getTitle());
    }

}
