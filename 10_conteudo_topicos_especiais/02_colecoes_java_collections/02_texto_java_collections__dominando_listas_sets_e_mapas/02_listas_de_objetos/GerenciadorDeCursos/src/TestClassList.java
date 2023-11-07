import java.util.ArrayList;

import br.com.alura.classes.Classs;

public class TestClassList {
    public static void main(String[] args) {

        Classs class_1 = new Classs("Revisitando as ArrayLists", 21);
        Classs class_2 = new Classs("Listas de objetos", 15);
        Classs class_3 = new Classs("Relacionamento de listas e objetos", 15);

        ArrayList<Classs> classs_list = new ArrayList<Classs>();
        classs_list.add(class_1);
        classs_list.add(class_2);
        classs_list.add(class_3);

        System.out.println(classs_list);
    }
}
