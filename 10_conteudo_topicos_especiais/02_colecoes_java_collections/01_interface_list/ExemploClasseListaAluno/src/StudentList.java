import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
    public static void main(String[] args) throws Exception {

        List<String> list_of_strings = new ArrayList<String>();
        list_of_strings.add("João da Silva");
        list_of_strings.add("Antonio Sousa");
        list_of_strings.add("Lúcia Ferreira");
        System.out.println(list_of_strings);
        
        Collections.sort(list_of_strings);
        System.out.println(list_of_strings);
    }
}
