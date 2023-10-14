import java.util.Scanner;

public class Test {
    public static void main(String arg[]) {
        Scanner reader = new Scanner(System.in);

        String name;
        int age;
        double wage;

        System.out.print("Digite o nome: ");
        name = reader.nextLine();

        System.out.print("Digite a idade: ");
        age = reader.nextInt();

        System.out.print("Digite o salário: ");
        wage = reader.nextDouble();

        System.out.println("Nome: " + name);
        System.out.println("Nome: " + age);
        System.out.println("Nome: " + wage);
    }
}
