import java.util.List;

import classes.Classs;
import classes.Course;

public class TestCourse {
    public static void main(String[] args) throws Exception {

        Course java_collections = new Course("Dominando as coleções em Java", "Paulo Silveira");

        // List<Classs> classs_list = java_collections.getClass_list();
        List<Classs> classs_list = java_collections.getClass_list();
        System.out.println(classs_list);
        System.out.println();

        java_collections.toAdd(new Classs("Trabalhando com ArrayList", 21));
        java_collections.toAdd(new Classs("Criando uma aula", 20));
        java_collections.toAdd(new Classs("Modelando coleções", 24));

        // java_collections.getClass().add(new Classs("Trabalhando com ArrayList", 21));
        System.out.println(java_collections.getClass_list());
    }
}
