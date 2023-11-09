import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> my_integers = Arrays.asList(5, 2, 10);
        printList(my_integers);

        List<String> my_strings = Arrays.asList("Leo", "João", "Mara");
        printList(my_strings);

        /*
         * allowed
         */
        // List<?> my_objcts = new ArrayList<>();
        // List<Integer> my_integers_1 = new ArrayList<>();
        // my_objcts = my_integers_1; // Type mismatch: cannot convert from
        // to List<Object>

        /*
         * not allowed
         */
        // List<Object> my_objcts = new ArrayList<>();
        // List<Integer> my_integers = new ArrayList<>();
        // my_objcts = my_integers; // Type mismatch: cannot convert from List<Integer>
        // to List<Object>
    }

    /*
     * methods
     */
    private static void printList(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
