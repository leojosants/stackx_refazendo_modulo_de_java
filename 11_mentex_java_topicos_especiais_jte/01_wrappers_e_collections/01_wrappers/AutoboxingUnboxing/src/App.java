import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * autoboxing - conversao automatica de tipos primitivos em seu respectivo
         * wrapper
         */
        // autoboxingExample01();
        // autoboxingExample02();
        autoboxingExample03();

        /*
         * unboxing - conversao de um objeto para um tipo primitivo
         */
        // unboxingExample01();
        // unboxingExample02();
    }

    /*
     * methods
     */
    private static boolean isEven(int n) {
        return (n % 2) == 0;
    }

    private static void autoboxingExample01() {
        /*
         * autoboxing - conversao automatica de tipos primitivos em seu respectivo
         * wrapper
         */
        Boolean b = false;
        Integer n = 42;
        Double pi = 3.14;
        System.out.println(pi.intValue());
    }

    private static void autoboxingExample02() {
        List<Double> double_list = new ArrayList<Double>();
        // autoboxing
        double_list.add(3.14);
        double_list.add(40.14);
    }

    private static void autoboxingExample03() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um double: ");
        String value_read = scanner.nextLine();

        try {
            double read_value_converted_to_double = Double.parseDouble(value_read);
            System.out.printf("%s: é um double válido%n", value_read);

        } catch (NumberFormatException e) {
            System.out.printf("%s: não é um double válido%n", value_read);

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("-> fim do programa");
        }
    }

    private static void unboxingExample01() {
        /*
         * autoboxing - conversao automatica de tipos primitivos em seu respectivo
         * wrapper
         */
        Boolean b = false;
        Integer n = 42;
        Double pi = 3.14;
        System.out.println(pi.intValue());

        /*
         * unboxing - conversao de um objeto para um tipo primitivo
         */
        boolean a = b;
        int y = n;
        double pi_2 = pi;
        // System.out.println(pi_2.intValue()); // não possui metodos especiais

        System.out.printf("É par? %b%n", isEven(n));
    }

    private static void unboxingExample02() {
        List<Double> double_list = new ArrayList<Double>();
        // autoboxing
        double_list.add(3.14);
        double_list.add(40.14);

        // unboxing
        double PI_value = double_list.get(0);
        System.out.println("PI: " + PI_value);
    }
}
