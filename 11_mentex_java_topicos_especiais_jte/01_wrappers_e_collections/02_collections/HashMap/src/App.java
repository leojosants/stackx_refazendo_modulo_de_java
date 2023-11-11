import java.util.HashMap;

import classes.Teacher14;

public class App {
    public static void main(String[] args) throws Exception {

        // busca mais rápida através da key
        HashMap<String, Teacher14> teacher_hash_map = new HashMap<String, Teacher14>();

        Teacher14 teacher_1 = new Teacher14("João", "Física");
        Teacher14 teacher_2 = new Teacher14("Ana", "Sociologia");
        Teacher14 teacher_3 = new Teacher14("Mara", "Matemática");

        teacher_hash_map.put("001", teacher_1);
        teacher_hash_map.put("002", teacher_2);
        teacher_hash_map.put("003", teacher_3);

        System.out.println(teacher_hash_map);
    }
}
