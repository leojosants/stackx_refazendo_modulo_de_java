import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       
        List<String> string_list = new ArrayList<>();
        string_list.add("Teste 1");
        string_list.add("Teste 3");
        string_list.add("Teste 2");

        for (String string : string_list) {
            System.out.println(string);
        }

        add(string_list, 1L);

        for (String string : string_list) {
            System.out.println(string);
        }
    }

    /*
     * methods
     */
    public static void add(List list, Long l) {
        list.add(l);
    }
}
