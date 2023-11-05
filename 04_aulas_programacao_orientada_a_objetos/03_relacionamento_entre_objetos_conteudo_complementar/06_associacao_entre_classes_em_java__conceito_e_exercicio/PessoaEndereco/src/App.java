import java.util.InputMismatchException;
import java.util.Scanner;

import classes.Address;
import classes.Person7;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner_string = new Scanner(System.in);

        try {

            Person7 person_1 = new Person7();
            Address address_person_1 = new Address();

            String name = getName(scanner_string);
            int age = getAge(scanner);
            char gender = getGender(scanner_string);
            String public_place = getPublicPlace(scanner_string);
            int number = getNumber(scanner);
            char answer_if_there_is_a_complement = getAResponseIfthereIsAComplement(scanner_string);
            String complement = getComplement(scanner_string, answer_if_there_is_a_complement);
            String cep = getCEP(scanner_string);

            person_1.setName(name);
            person_1.setAge(age);
            person_1.setGender(gender);
           
            address_person_1.setPublicPlace(public_place);
            address_person_1.setNumber(number);
            address_person_1.setComplement(complement);
            address_person_1.setCep(cep);

            person_1.setAddress(address_person_1); // association
            person_1.printData();

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("-> erro, campo não pode ser vazio");

        } catch (InputMismatchException e) {
            System.out.println("-> erro, entrada inválida");

        } catch (NullPointerException e) {
            System.out.println("-> erro, valor(es) nulos");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("-> programa finalizado");
        }
    }

    /*
     * SUB-ROUTINES
     */
    private static String getName(Scanner scanner_string) {
        String name = "";

        do {
            System.out.print("Digite o nome: ");
            name = scanner_string.nextLine().trim();

            while (name.equals("")) {
                System.out.print("-> campo não pode ser vazio, digite o nome: ");
                name = scanner_string.nextLine().trim();
            }
        } while (name.equals(""));

        return name;
    }

    private static int getAge(Scanner scanner) {
        int age = 0;

        do {
            System.out.print("Digite a idade: ");
            age = scanner.nextInt();

            while (age < 0) {
                System.out.print("-> informe somente valor maior que zero, digite a idade: ");
                age = scanner.nextInt();
            }
        } while (age < 0);

        return age;
    }

    private static char getGender(Scanner scanner_string) {
        char gender;

        do {
            System.out.print("Digite o gender [M/F]: ");
            gender = scanner_string.nextLine().trim().toUpperCase().charAt(0);

            while ((gender != 'M') && (gender != 'F')) {
                System.out.print("-> informe somente [M] ou [F], digite o gender: ");
                gender = scanner_string.nextLine().trim().toUpperCase().charAt(0);
            }
        } while ((gender != 'M') && (gender != 'F'));

        return gender;
    }

    private static String getPublicPlace(Scanner scanner_string) {
        String public_place = "";

        do {
            System.out.print("Digite o endereço: ");
            public_place = scanner_string.nextLine().trim();

            while (public_place.equals("")) {
                System.out.print("-> campo não pode ser vazio, digite o endereço: ");
                public_place = scanner_string.nextLine().trim();
            }
        } while (public_place.equals(""));

        return public_place;
    }

    private static int getNumber(Scanner scanner) {
        int number = 0;

        do {
            System.out.print("Digite o número: ");
            number = scanner.nextInt();

            while (number < 0) {
                System.out.print("-> informe somente valor maior que zero, digite o número: ");
                number = scanner.nextInt();
            }
        } while (number < 0);

        return number;
    }

    private static char getAResponseIfthereIsAComplement(Scanner scanner_string) {
        char answer_if_there_is_a_complement;

        do {
            System.out.print("Tem complement [S/N]? ");
            answer_if_there_is_a_complement = scanner_string.nextLine().trim().toUpperCase().charAt(0);

            while ((answer_if_there_is_a_complement != 'S') && (answer_if_there_is_a_complement != 'N')) {
                System.out.print("-> informe somente [S] ou [N], tem complement? ");
                answer_if_there_is_a_complement = scanner_string.nextLine().trim().toUpperCase().charAt(0);
            }
        } while ((answer_if_there_is_a_complement != 'S') && (answer_if_there_is_a_complement != 'N'));

        return answer_if_there_is_a_complement;
    }

    private static String getComplement(Scanner scanner_string, char answer_if_there_is_a_complement) {
        String complement = "";

        if (answer_if_there_is_a_complement == 'S') {
            do {
                System.out.print("Digite o complement: ");
                complement = scanner_string.nextLine().trim();

                while (complement.equals("")) {
                    System.out.print("-> campo não pode ser vazio, digite o complement: ");
                    complement = scanner_string.nextLine().trim();
                }
            } while (complement.equals(""));
        }

        return complement;
    }

    private static String getCEP(Scanner scanner_string) {
        String cep = "";

        do {
            System.out.print("Digite o CEP [00.000-000]: ");
            cep = scanner_string.nextLine().trim();

            while (cep.equals("")) {
                System.out.print("-> campo não pode ser vazio, digite o CEP [00.000-000]: ");
                cep = scanner_string.nextLine().trim();
            }

            while (cep.length() < 8) {
                System.out.print("-> campo não pode ter menos e nem mais que 8 caracteres, digite o CEP [00.000-000]: ");
                cep = scanner_string.nextLine().trim();
            }
        } while (cep.length() < 8);

        return cep;
    }
}
