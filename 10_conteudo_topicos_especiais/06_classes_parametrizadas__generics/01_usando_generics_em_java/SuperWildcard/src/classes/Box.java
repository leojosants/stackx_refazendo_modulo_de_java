package classes;

public class Box<T> {
    /*
     * attributes
     */
    private T t;

    /*
     * getter
     */
    public T getT() {
        return this.t;
    }

    /*
     * meyhod
     */
    public void add(T t) {
        this.t = t;
    }
}
