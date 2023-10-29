import java.util.ArrayList;
import java.util.List;

import aggregation_relationships.Bicycle;
import aggregation_relationships.Wheel;
import association_relationships.example_01.Department;
import association_relationships.example_01.Teacher;

public class App {
    public static void main(String[] args) throws Exception {

        // associationExample();
        aggregationExample();

    }

    /* SUB-ROUTINES */
    public static void associationExample() {
        Teacher leonardo = new Teacher("Leonardo Santos");
        Teacher joao = new Teacher("João Silva");

        Teacher[] teachers_vector = { leonardo, joao };

        Department computing = new Department("Computacao I");
        computing.setTeacher_vector(teachers_vector);
        computing.displayTeachers();
    }

    public static void aggregationExample() {
        Wheel wheel_1 = new Wheel("A");
        Wheel wheel_2 = new Wheel("B");

        List<Wheel> wheels_list = new ArrayList<Wheel>();
        wheels_list.add(wheel_1);
        wheels_list.add(wheel_2);

        Bicycle bicycle = new Bicycle("X");
        bicycle.setWellsList(wheels_list);
        bicycle.displayWellsListModels();
    }
}
