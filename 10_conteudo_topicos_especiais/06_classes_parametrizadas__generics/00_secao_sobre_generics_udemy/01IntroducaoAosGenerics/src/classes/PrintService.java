package classes;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    /*
     * attribute
     */
    private List<T> integer_list = new ArrayList<>();

    /*
     * method
     */
    public void addValue(T value) {
        integer_list.add(value);
    }

    public T first() {
        if (integer_list.isEmpty()) {
            throw new IllegalStateException();
        }

        return integer_list.get(0);
    }

    public void print() {
        System.out.print("[");

        if (!integer_list.isEmpty()) {
            System.out.print(integer_list.get(0));
        }

        for (int i = 1; i < integer_list.size(); i++) {
            System.out.print(", "+ integer_list.get(i));
        }

        System.out.println("]");
    }
}
