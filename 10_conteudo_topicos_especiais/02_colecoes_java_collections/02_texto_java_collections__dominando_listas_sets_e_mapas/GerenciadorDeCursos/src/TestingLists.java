
import java.util.ArrayList;

public class TestingLists {
    public static void main(String[] args) throws Exception {

        String class_1 = "Conhecendo mais de listas";
        String class_2 = "Modelando a classe Aula";
        String class_3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> classes_list = new ArrayList<String>();
        classes_list.add(class_1);
        classes_list.add(class_2);
        classes_list.add(class_3);

        System.out.println(classes_list);
        
        classes_list.remove(0);
        
        System.out.println(classes_list);
    }
}
