package classes;

import java.util.List;

public class CalculationService {
    /*
     * methods
     */
    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("-> lista não pode ser vazia");
        }

        T max = list.get(0);

        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return max;
    }
}
