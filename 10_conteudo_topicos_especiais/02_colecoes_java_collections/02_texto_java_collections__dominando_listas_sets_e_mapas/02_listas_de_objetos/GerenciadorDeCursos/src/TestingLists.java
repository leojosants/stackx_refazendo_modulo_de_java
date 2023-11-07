
import java.util.ArrayList;
import java.util.Collections;

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
        System.out.println();

        for (String class_string : classes_list) {
            System.out.printf("Aula: %s%n", class_string);
        }
        System.out.println();

        String first_class = classes_list.get(0);
        System.out.printf("A primeira aula é: %s%n", first_class);
        System.out.println();

        for (int i = 0; i < classes_list.size(); i++) {
            System.out.printf("Aula: %s%n", classes_list.get(i));
        }
        System.out.println();

        classes_list.forEach((class_string) -> {
            System.out.println("Percorrendo: ");
            System.out.printf("Aula: %s%n", class_string);
        });
        System.out.println();
        
        classes_list.add("Aumentando nosso conhecimento");
        System.out.println(classes_list);
        System.out.println();
        
        Collections.sort(classes_list);
        System.out.printf("Depois de ordenado: %s%n",classes_list);
    }
}
