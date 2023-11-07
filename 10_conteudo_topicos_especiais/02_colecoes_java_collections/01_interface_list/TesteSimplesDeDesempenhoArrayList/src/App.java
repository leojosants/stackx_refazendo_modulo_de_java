import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        final int MAX = 2_000;
        long start_time = System.currentTimeMillis();

        List<Integer> list_integers = new ArrayList<Integer>();

        for (int i = 0; i < MAX; i++) {
            list_integers.add(i);
        }

        for (int i = 0; i < MAX; i++) {
            list_integers.contains(i);
        }

        long end_time = System.currentTimeMillis();
        long total_time = (end_time - start_time);
        System.out.printf("Início:      %d%n", start_time);
        System.out.printf("Fim:         %d%n", end_time);
        System.out.printf("Tempo total: %d%n", total_time);
    }
}
