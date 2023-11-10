import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {

        stringCollections();
    }

    /*
     * methods
     */
    private static void stringCollections() {
        // criar ArrayList
        ArrayList<String> teachers_list = new ArrayList<String>();

        // adicionar objetos
        teachers_list.add("Leonardo");
        teachers_list.add("Santos");
        teachers_list.add("João");
        teachers_list.add("Maria");
        teachers_list.add("Joana");
        teachers_list.add("João");
        teachers_list.add("Lucas");

        // obter item da lista
        System.out.println("\nObtendo cada item da lista");
        System.out.printf("Professor na posição 0: %s%n", teachers_list.get(0));
        System.out.printf("Professor na posição 1: %s%n", teachers_list.get(1));
        System.out.printf("Professor na posição 2: %s%n", teachers_list.get(2));
        System.out.printf("Professor na posição 3: %s%n", teachers_list.get(3));
        System.out.printf("Professor na posição 4: %s%n", teachers_list.get(4));
        System.out.printf("Professor na posição 5: %s%n", teachers_list.get(5));
        System.out.printf("Professor na posição 6: %s%n", teachers_list.get(6));

        // imprimir lista sem iteração
        System.out.println("\nImprimindo lista sem percorrer");
        System.out.println(teachers_list);

        // percorrer list com FOR
        System.out.println("\nImprimindo lista com FOR");
        for (int i = 0; i < teachers_list.size(); i++) {
            System.out.printf("Professor na posição %d: %s%n", i, teachers_list.get(i));
        }

        // percorrer lista com FOREACH
        System.out.println("\nImprimindo lista com FOREACH");
        for (String teacher : teachers_list) {
            System.out.printf("Professor: %s%n", teacher);
        }

        // remover item especifico
        String item_to_be_removed = "João";
        Boolean item_exists_in_the_list = false;

        System.out.println("\nRemovendo item especifico");

        for (int i = 0; i < teachers_list.size(); i++) {
            if (teachers_list.get(i).equals(item_to_be_removed)) {
                item_exists_in_the_list = true;
                teachers_list.remove(teachers_list.get(i));
                break;
            }
        }

        if (item_exists_in_the_list) {
            System.out.printf("O item '%s' existia na lista e foi removido", item_to_be_removed);

        } else {
            System.out.printf("O item '%s' não existe na lista", item_to_be_removed);
        }

        // percorrer lista com FOREACH
        System.out.println("\nImprimindo lista com FOREACH");
        for (String teacher : teachers_list) {
            System.out.printf("Professor: %s%n", teacher);
        }

        // percorrendo lista com metodo FOREACH com lambda
        System.out.println("\nImprimindo lista com o método FOREACH");
        teachers_list.forEach(teacher -> {
            System.out.printf("Professor: %s%n", teacher);
        });

        // transformando um vetor em arrayList
        String[] color_vector = { "roxo", "marron", "azul", "cinza", "amarelo", "verde" };
        ArrayList<String> color_list = new ArrayList<String>(Arrays.asList(color_vector));

        // percorrendo lista com metodo FOREACH com lambda
        System.out.println("\nImprimindo lista com o método FOREACH");
        color_list.forEach(color -> {
            System.out.printf("Cor: %s%n", color);
        });

        // ordenando items
        Collections.sort(color_list);

        // percorrendo lista com metodo FOREACH com lambda
        System.out.println("\nImprimindo lista com o método FOREACH");
        color_list.forEach(color -> {
            System.out.printf("Cor: %s%n", color);
        });
    }
}
