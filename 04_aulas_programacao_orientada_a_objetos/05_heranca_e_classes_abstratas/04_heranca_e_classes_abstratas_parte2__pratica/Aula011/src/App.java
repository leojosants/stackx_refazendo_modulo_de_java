import classes.ScholarshipHolder;
import classes.Student12;
import classes.Teacher12;
import classes.Technician;
import classes.Visitor;

public class App {
    public static void main(String[] args) throws Exception {

        // Person12 person_1 = new Person12(); // Cannot instantiate the type Person12 -
        // classe abstrata

        System.out.println("\nVisitante");
        Visitor visitor_1 = new Visitor();
        visitor_1.setName("Mara");
        visitor_1.setAge(28);
        visitor_1.setGender('F');
        visitor_1.printPerson();
        visitor_1.haveABirthday();

        System.out.println("\nEstudante");
        Student12 student_1 = new Student12();
        student_1.setName("Manoela");
        student_1.setAge(45);
        student_1.setGender('F');
        student_1.setRegistration("1234E");
        student_1.setCourse("Matemática");
        student_1.printPerson();
        student_1.printStudent();
        student_1.haveABirthday();
        student_1.payMonthlyFee();
        
        System.out.println("\nProfessor");
        Teacher12 teacher_1 = new Teacher12();
        teacher_1.setName("Guilherme");
        teacher_1.setAge(34);
        teacher_1.setGender('M');
        teacher_1.setSpecialty("Back-end");
        teacher_1.setSalary(3_000);
        teacher_1.printPerson();
        teacher_1.printTeacher();
        teacher_1.receiveARaise();

        System.out.println("\nBolsista");
        ScholarshipHolder scholarshipHolder_1 = new ScholarshipHolder();
        scholarshipHolder_1.setName("Marcos");
        scholarshipHolder_1.setAge(53);
        scholarshipHolder_1.setGender('M');
        scholarshipHolder_1.setRegistration("1343B");
        scholarshipHolder_1.setScholarship(12.5f);
        scholarshipHolder_1.setCourse("Front-end");
        scholarshipHolder_1.printPerson();
        scholarshipHolder_1.printScholarship();
        scholarshipHolder_1.renewScholarship();
        scholarshipHolder_1.payMonthlyFee();

        System.out.println("\nTécnico");
        Technician tecnico_1 = new Technician();
        tecnico_1.setName("Cleiton");
        tecnico_1.setAge(20);
        tecnico_1.setGender('M');
        tecnico_1.setRegistration("4567");
        tecnico_1.setProfessionalRecord("345T");
        tecnico_1.setCourse("Arquitetura");
        tecnico_1.printPerson();
        tecnico_1.imprimirTecnico();
        tecnico_1.haveABirthday();
        tecnico_1.payMonthlyFee();
        tecnico_1.toPractice();
    }
}
