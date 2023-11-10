import java.util.ArrayList;
import java.util.Collections;

import classes.Teacher13;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Teacher13> teacher_list = new ArrayList<Teacher13>();
        teacher_list.add(new Teacher13("João", "Informática"));
        teacher_list.add(new Teacher13("Ana", "Copa"));
        teacher_list.add(new Teacher13("Leo", "Enfermagem"));
        teacher_list.add(new Teacher13("Mara", "Administrativo"));
        teacher_list.add(new Teacher13("Bruna", "Pronto Atendimento"));

        System.out.println("\nLista antes de ordenar");
        teacher_list.forEach(teacher -> {
            teacher.displayData();
        });

        // ordenando arrayList
        Collections.sort(teacher_list);

        System.out.println("\nLista apos de ordenar");
        teacher_list.forEach(teacher -> {
            teacher.displayData();
        });
    }

}
