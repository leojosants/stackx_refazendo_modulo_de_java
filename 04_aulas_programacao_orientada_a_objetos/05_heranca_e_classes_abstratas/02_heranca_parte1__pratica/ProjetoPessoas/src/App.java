import classes.Employee11;
import classes.Person11;
import classes.Student;
import classes.Teacher;

public class App {
    public static void main(String[] args) throws Exception {

        Person11 person_1 = new Person11();
        person_1.setName("Leonardo");
        person_1.setAge(39);
        person_1.setGender('M');

        Student student_1 = new Student();
        student_1.setAge(45);
        student_1.setName("Ana");
        student_1.setGender('F');
        student_1.setCourse("Tecnologia");

        Teacher teacher_1 = new Teacher();
        teacher_1.setName("João");
        teacher_1.setAge(29);
        teacher_1.setGender('M');
        teacher_1.setSpecialty("Web");
        teacher_1.setSalary(3_000);

        Employee11 employee_1 = new Employee11();
        employee_1.setName("Mara");        
        employee_1.setAge(18);
        employee_1.setGender('F');
        employee_1.haveABirthday();
        employee_1.setIsWorking(true);
        employee_1.setSector("Vendas");

        System.out.println("\nPessoa");
        person_1.printPerson();

        System.out.println("\nAluno");
        student_1.printPerson();

        System.out.println("\nProfessor");
        teacher_1.printPerson();

        System.out.println("\nEmpregado");
        employee_1.printPerson();

    }
}
