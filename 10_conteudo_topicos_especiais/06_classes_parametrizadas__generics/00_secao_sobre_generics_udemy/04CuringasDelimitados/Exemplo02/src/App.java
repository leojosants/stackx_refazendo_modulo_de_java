import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        covarianceExample();
        counterCovarianceExample();

        List<Integer> my_integers = Arrays.asList(1, 2, 3, 4);
        List<Double> my_doubles = Arrays.asList(3.14, 6.28);
        List<Object> my_objects = new ArrayList<Object>();

        copy(my_integers, my_objects);
        printList(my_objects);
      
        copy(my_doubles, my_objects);
        printList(my_objects);
    }

    /*
     * methods
     */
    private static void covarianceExample() {
        /*
         * exemplo covariancia:
         * get é permitido
         * put não é permitido
         */
        List<Integer> integers_list = new ArrayList<>();
        integers_list.add(10);
        integers_list.add(5);

        List<? extends Number> list = integers_list; // get - permitido

        Number x = list.get(0);
        // list.add(20); // put - não permitido
    }

    private static void counterCovarianceExample() {
        /*
         * exemplo contravariancia:
         * get não é permitido
         * put é permitido
         */
        List<Object> my_object = new ArrayList<>();
        my_object.add("João");
        my_object.add("Ana");
        my_object.add("Marcos");

        List<? super Number> my_numbers = my_object;
        my_numbers.add(10);
        my_numbers.add(3.4); // put eh permitido

        // Number x = my_numbers.get(0); // get nao eh permiido
    }

    private static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object object : list) {
            System.out.print(object + " ");
        }
        System.out.println();
    }
}
