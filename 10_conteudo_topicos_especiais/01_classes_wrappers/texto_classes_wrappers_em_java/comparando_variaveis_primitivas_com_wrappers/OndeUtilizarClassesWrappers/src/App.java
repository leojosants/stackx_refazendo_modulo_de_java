import javax.swing.JOptionPane;

import classes.Employee12;

public class App {
    public static void main(String[] args) throws Exception {

        Employee12 employee_1 = new Employee12();
        employee_1.setName(JOptionPane.showInputDialog("Digite o nome do funcionário: "));

        /*
         * invocado as classes Wrappers para fazer a conversão, pois o argumento
         * JOptionPane.showInputDialog é um objeto string e para ser inserido nos outros
         * tipos primitivos é necessário fazer a conversão
         */

        employee_1.setAge(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionário: ")));
        employee_1.setSalary(Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do funcionário: ")));

        // exibição em tela dos dados digitados
        JOptionPane.showMessageDialog(null, "Funcionário: " + employee_1.getName() +
                "\n " + "Idade: " + employee_1.getAge() +
                "\n " + "Salário: " + employee_1.getSalary(),
                "Detalhes Funcionário", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
