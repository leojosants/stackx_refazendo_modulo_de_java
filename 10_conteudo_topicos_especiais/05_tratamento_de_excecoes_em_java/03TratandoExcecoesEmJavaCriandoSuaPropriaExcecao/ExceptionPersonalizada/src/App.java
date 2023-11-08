import classes.InvalidAgeException;

public class App {
    public static void main(String[] args) throws Exception {
        testEmployee(28);
        testEmployee(16);
        testEmployee(-2);
    }

    /*
     * methods
     */
    public static boolean checkEmployeeAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("entradada inválida! A idade não pode ser menor que zero", age);
        }

        if (age < 18) {
            return false;

        } else {
            return true;
        }
    }

    public static void testEmployee(int age) {
        try {
            if (checkEmployeeAge(age)) {
                System.out.printf("-> a idade do funcionário está OK! Funcionário tem %d anos %n", age);

            } else {
                System.out.printf("-> o funcionário é menor de idade! Funcionário tem %d anos %n", age);
            }

        } catch (InvalidAgeException e) {
            System.out.printf("-> ocorreu uma exceção! erro: %s%n", e.getMessage());
            System.out.printf("-> valor da idade: %d%n", e.getAge());
        }
    }
}
