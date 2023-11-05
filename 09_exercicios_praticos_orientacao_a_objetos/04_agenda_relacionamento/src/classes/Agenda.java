package classes;

public class Agenda {
    /*
     * attributes
     */
    private Person personsVector[];

    /*
     * constructor
     */
    public Agenda(int quantity) {
        personsVector = new Person[quantity];
    }

    public void storePerson(String name, int age, float height) {
        boolean registrationCarriedOut = false;

        for (int i = 0; i < personsVector.length; i++) {
            if (personsVector[i] == null) {
                Person person = new Person(name, age, height);
                personsVector[i] = person;
                registrationCarriedOut = true;
                break;
            }
        }

        if (registrationCarriedOut) {
            System.out.println("\n-> cadastro realizado com sucesso");

        } else {
            System.out.println("\n-> não foi possível cadastrar, Agenda cheia");
        }
    }

    public void removePerson(String name) {
        boolean personRemoved = false;

        for (int i = 0; i < personsVector.length; i++) {
            if (personsVector[i] != null) {
                if (personsVector[i].getName().equals(name)) {
                    personsVector[i] = null;
                    personRemoved = true;
                    break;
                }
            }
        }

        if (personRemoved) {
            System.out.println("\n-> pessoa removida com sucesso");

        } else {
            System.out.println("\n-> não foi possível remover. Pessoa não encontrada");
        }
    }

    public int buscarPessoa(String name) {
        int positionFound = -1;

        for (int i = 0; i < personsVector.length; i++) {
            if (personsVector[i] != null) {
                if (personsVector[i].getName().equals(name)) {
                    positionFound = i;
                    break;
                }
            }
        }

        return positionFound;
    }

    // 4
    public void printAgenda() {
        boolean thereIsContact = false;

        for (int i = 0; i < personsVector.length; i++) {
            if (personsVector[i] != null) {

                Person person = personsVector[i];

                System.out.printf("Nome: %s%n", person.getName());
                System.out.printf("Idade: %d%n", person.getAge());
                System.out.printf("Altura: %.2f%n%n", person.getHeight());

                thereIsContact = true;
            }
        }
        if (thereIsContact == false) {
            System.out.println("-> A agenda não existe contatos");
        }

    }

    public void printPerson(int index) {
        if ((index < 0) || (index > (personsVector.length - 1))) {
            System.out.println("-> indice inválido");

        } else {
            Person person = personsVector[index];

            if (person == null) {
                System.out.println("-> não existe pessoa nesse indice ainda");

            } else {
                System.out.printf("Nome: %s%n", person.getName());
                System.out.printf("Idade: %d%n", person.getAge());
                System.out.printf("Altura: %.2f%n", person.getHeight());
            }
        }
    }
}
