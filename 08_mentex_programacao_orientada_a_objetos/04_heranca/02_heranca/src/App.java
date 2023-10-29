import classes.Coordinator;
import classes.Person;
import classes.Teacher;

public class App {
    public static void main(String[] args) throws Exception {

        Person leonardoPessoa = new Person("Leonardo", generateRandomNumber());
        displayPersonObjectOfTypePerson(leonardoPessoa);

        Teacher joaoProfessor = new Teacher("João", "Informática", generateRandomNumber());
        displayTeacherObjectOfTypeTeacher(joaoProfessor);

        Coordinator joseCoordenador = new Coordinator("José", generateRandomNumber(), "Programação");
        displayCoordinatorObjectOfTypeCoordinator(joseCoordenador);

        Person mariaProfessor = new Teacher("Maria", "Matemática", generateRandomNumber());
        displayPersonObjectOfTypeTeacher(mariaProfessor);

        Person joanaCoordenador = new Coordinator("Joana", generateRandomNumber(), "UML");
        displayPersonObjectOfTypeCoordinator(joanaCoordenador);
    }

    /*
     * sub-routines
     */
    private static int generateRandomNumber() {
        int randomNumber = (int) (Math.random() * 1000);
        return randomNumber;
    }

    private static void displayPersonObjectOfTypePerson(Person person) {
        System.out.println("\nDados da Pessoa");
        System.out.printf("Nome: %s%n", person.getName());
        System.out.printf("Registro: %d%n%n", person.getRegistration());
    }

    private static void displayTeacherObjectOfTypeTeacher(Teacher teacher) {
        System.out.println("Dados do Professor");
        System.out.printf("Nome: %s%n", teacher.getName());
        System.out.printf("Registro: %d%n", teacher.getRegistration());
        System.out.printf("Departamento: %s%n%n", teacher.getDepartment());
    }

    private static void displayCoordinatorObjectOfTypeCoordinator(Coordinator coordinator) {
        System.out.println("Dados do Coordenador");
        System.out.printf("Nome: %s%n", coordinator.getName());
        System.out.printf("Registro: %d%n", coordinator.getRegistration());
        System.out.printf("Curso coordenado: %s%n%n", coordinator.getCoordinatingCourse());
    }

    private static void displayPersonObjectOfTypeTeacher(Person person) {
        System.out.println("Dados do Professor");
        System.out.printf("Nome: %s%n", person.getName());
        System.out.printf("Registro: %d%n", person.getRegistration());
        System.out.printf("Departamento: %s%n%n", ((Teacher) person).getDepartment());
        // System.out.printf("Departamento: %s%n%n", (mariaProfessor).getDepartment());
    }

    private static void displayPersonObjectOfTypeCoordinator(Person person) {
        System.out.println("Dados do Coordenador");
        System.out.printf("Nome: %s%n", person.getName());
        System.out.printf("Registro: %d%n", person.getRegistration());
        System.out.printf("Curso coordenado: %s%n%n", ((Coordinator) person).getCoordinatingCourse());
        // System.out.printf("Curso coordenado: %s%n%n",
        // joanaCoordenador.getCoordinatingCourse());
    }
}
