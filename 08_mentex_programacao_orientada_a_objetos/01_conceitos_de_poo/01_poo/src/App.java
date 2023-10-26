public class App {
    public static void main(String[] args) throws Exception {

        Mutant mutant_1 = criarNovoMutant("Charles", "Xavier", "Professor X", 64, 5);
        Mutant mutant_2 = criarNovoMutant("Scott", "Summer", "Ciclope", 32, 4);

        System.out.println(mutant_1.toString());
        System.out.printf("Nome nível: %s%n", mutant_1.obterNomeNivel());

        System.out.println(mutant_2.toString());
        System.out.printf("Nome nível: %s%n", mutant_2.obterNomeNivel());
    }

    /* SUB-ROUTINES */
    public static Mutant criarNovoMutant(String firstName, String lastName, String warName, int age, int level) {
        Mutant mutant = new Mutant();
        mutant.firstName = firstName;
        mutant.lastName = lastName;
        mutant.warName = warName;
        mutant.age = age;
        mutant.level = level;
        return mutant;
    }
}
