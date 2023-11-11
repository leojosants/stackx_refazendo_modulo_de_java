import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
       
        // não permite objetos iguais e organiza de forma lexicográfico.
        Set<String> school_subjects = new HashSet<String>();
        school_subjects.add("Matemática");
        school_subjects.add("Química");
        school_subjects.add("Matemática");
        school_subjects.add("Zoologia");
        school_subjects.add("Química");
        school_subjects.add("Física");
        school_subjects.add("Física");

        school_subjects.forEach(item -> {
            System.out.println(item);
        });
    }
}
