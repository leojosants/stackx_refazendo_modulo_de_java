import java.util.InputMismatchException;
import java.util.Scanner;

import classes.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            int totalDeFuncionarios = 10;

            Employee employee_vector[] = new Employee[totalDeFuncionarios];

            int contador = 0;

            System.out.println("\nEntre com os dados abaixo");

            do {
                System.out.printf("\nCadastrando %dº funcionário %n", (contador + 1));

                int codigo = solicitarCodigo(scanner);
                int numeroDeHorasTrabalhadasNoMes = solicitarNumeroDeHorasTravalhadasNoMes(scanner);
                char turno = solicitarTurno(scanner);
                char categoria = solicitarCategoria(scanner);

                employee_vector[contador] = new Employee(codigo, numeroDeHorasTrabalhadasNoMes, turno, categoria);

                System.out.println("-> Funcionário cadastrado com sucesso");
                System.out.println("\n=====**=====**=====Funcionário cadastrado com sucesso=====**=====**=====");

                contador++;
            } while (contador < totalDeFuncionarios);

            for (int i = 0; i < employee_vector.length; i++) {
                employee_vector[i].exibirDados();
            }

        } catch (InputMismatchException e) {
            System.out.println("--> erro: entrada inválida de dados");

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            scanner.close();
            System.out.println("\n-> Fim do programa");
        }
    }

    /* SUB-ROUTINES */
    public static int solicitarCodigo(Scanner scanner) {
        int codigo = 0;

        do {
            System.out.print("Digite um valor positivo e inteiro para 'Código': ");
            codigo = scanner.nextInt();

            while (codigo < 0) {
                System.out.print("-> Informe [somente] valore(s) positivo(s) e inteiro(s) para 'Código': ");
                codigo = scanner.nextInt();
            }
        } while (codigo < 0);

        return codigo;
    }

    public static int solicitarNumeroDeHorasTravalhadasNoMes(Scanner scanner) {
        int numeroDeHorasTrabalhadasNoMes = 0;

        do {
            System.out
                    .print("\nDigite um valor positivo e inteiro para 'Números de horas trabalhadas no mês': ");
            numeroDeHorasTrabalhadasNoMes = scanner.nextInt();

            while (numeroDeHorasTrabalhadasNoMes < 0) {
                System.out.print(
                        "-> Informe [somente] valore(s) positivo(s) e inteiro(s) para 'Números de horas trabalhadas no mês': ");
                numeroDeHorasTrabalhadasNoMes = scanner.nextInt();
            }
        } while (numeroDeHorasTrabalhadasNoMes < 0);

        return numeroDeHorasTrabalhadasNoMes;
    }

    public static char solicitarTurno(Scanner scanner) {
        char turno;

        do {
            System.out.println("\nEscolha uma opção abaixo para 'Turno de trabalho'");
            System.out.println("[ M - Matutino ], [ V - Vespertino ] ou [ N - Noturno ]");

            System.out.print("Digite sua opção: ");
            turno = scanner.next().toUpperCase().charAt(0);

            while ((turno != 'M') &&
                    (turno != 'V') &&
                    (turno != 'N')) {
                System.out.println(
                        "\n-> Informe somente [ M  -  Matutino ], [ V - Vespertino ] ou [ N - Noturno ] para 'Turno de trabalho'");

                System.out.print("Digite sua opção: ");
                turno = scanner.next().toUpperCase().charAt(0);
            }
        } while ((turno != 'M') &&
                (turno != 'V') &&
                (turno != 'N'));

        return turno;
    }

    public static char solicitarCategoria(Scanner scanner) {
        char categoria;

        do {
            System.out.println("\nEscolha uma opção abaixo para 'Categoria'");
            System.out.println("[ O - Operário ] ou [ G - Gerente ]");

            System.out.print("Digite sua opção: ");
            categoria = scanner.next().toUpperCase().charAt(0);

            while ((categoria != 'O') && (categoria != 'G')) {
                System.out.println("\n-> Informe somente [ O - Operário ] ou [ G - Gerente] para 'Categoria'");

                System.out.print("Digite sua opção: ");
                categoria = scanner.next().toUpperCase().charAt(0);
            }
        } while ((categoria != 'O') && (categoria != 'G'));

        return categoria;
    }
}
