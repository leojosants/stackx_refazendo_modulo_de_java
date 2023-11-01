import java.util.InputMismatchException;
import java.util.Scanner;

import classes.Agenda;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            Agenda agenda = new Agenda(10);
            String name = "";
            int age = 0;
            float height = 0.0f;

            System.out.println("\nAGENDA - Armazene seus contatos");

            while (true) {
                System.out.println("\nMENU");
                System.out.println("[ 1 ] - Armazenar Pessoa");
                System.out.println("[ 2 ] - Remover Pessoa");
                System.out.println("[ 3 ] - Buscar Pessoa");
                System.out.println("[ 4 ] - Imprimir Agenda");
                System.out.println("[ 5 ] - Imprimir Pessoa (indice)");
                System.out.println("[ 6 ] - Sair");

                System.out.print("\nSua opção: ");
                int menuOption = Integer.parseInt(scanner.nextLine());

                switch (menuOption) {
                    case 1:
                        System.out.println("\n[ 1 ] - Armazenar Pessoa");

                        System.out.print("Digite o nome: ");
                        name = scanner.nextLine();

                        do {
                            System.out.print("Digite a idade [acima de zero]: ");
                            age = scanner.nextInt();
                        } while (age < 0);

                        do {
                            System.out.print("Digite a altura [acima de zero]: ");
                            height = scanner.nextFloat();
                        } while (height < 0);

                        agenda.storePerson(name, age, height);
                        scanner.nextLine();
                        break;

                    case 2:
                        System.out.println("\n[ 2 ] - Remover Pessoa");

                        System.out.print("Digite o nome da pessoa que deseja remover: ");
                        String nameToRemove = scanner.nextLine();

                        agenda.removePerson(nameToRemove);
                        break;

                    case 3:
                        System.out.println("\n[ 3 ] - Buscar Pessoa");
                        int position = -1;

                        System.out.print("Digite o nome da pessoa que deseja buscar: ");
                        String nameToSearch = scanner.nextLine();

                        position = agenda.buscarPessoa(nameToSearch);

                        if (position == -1) {
                            System.out.printf("-> '%s' não existe na agenda%n", nameToSearch);

                        } else {
                            System.out.printf("-> posição da pessoa '%s': %d%n", nameToSearch, position);
                        }
                        break;

                    case 4:
                        System.out.println("\n[ 4 ] - Imprimir Agenda");
                        agenda.printAgenda();
                        break;

                    case 5:
                        System.out.println("\n[ 5 ] - Imprimir Pessoa (indice)");

                        System.out.print("Digite o index que deseja verificar [0 - 9]: ");
                        int index = scanner.nextInt();

                        agenda.printPerson(index);
                        scanner.nextLine();
                        break;

                    case 6:
                        System.out.println("\n[ 6 ] - Sair");
                        System.out.println("-> programa finalizado");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("\n-> opção inválida\n");
                        break;
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("-> erro, entrada de dados inválida");

        } catch (InputMismatchException e) {
            System.out.println("-> erro, entrada de dados inválida");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("\nPrograma finalizado");
        }
    }
}
