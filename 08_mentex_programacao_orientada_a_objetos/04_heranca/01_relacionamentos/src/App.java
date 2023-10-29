import java.util.ArrayList;
import java.util.List;

import aggregation_relationships.Bicycle;
import aggregation_relationships.Wheel;
import association_relationships.example_01.Department;
import association_relationships.example_01.Teacher;
import composition_relationships.example_01.Book;
import composition_relationships.example_01.Library;
import composition_relationships.example_02.Person;

public class App {
    public static void main(String[] args) throws Exception {

        // associationExample();
        // aggregationExample();
        // compositionExample01();
        compositionExample02();

    }

    /* SUB-ROUTINES */
    public static void associationExample() {
        Teacher leonardoProfessor = new Teacher("Leonardo Santos");
        Teacher joao = new Teacher("João Silva");

        Teacher[] teachers_vector = { leonardoProfessor, joao };

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

    public static void compositionExample01() {
        Book book_1 = new Book("Livro 1", "Autor 1");
        Book book_2 = new Book("Livro 2", "Autor 2");
        Book book_3 = new Book("Livro 3", "Autor 3");

        List<Book> booksList = new ArrayList<Book>();
        booksList.add(book_1);
        booksList.add(book_2);
        booksList.add(book_3);

        Library library = new Library("Biblioteca A", booksList);
        System.out.println(library.getBooksList());
    }

    public static void compositionExample02() {
        Person person = new Person();
        double salary = person.getSalary();
        System.out.println(salary);
    }
}
