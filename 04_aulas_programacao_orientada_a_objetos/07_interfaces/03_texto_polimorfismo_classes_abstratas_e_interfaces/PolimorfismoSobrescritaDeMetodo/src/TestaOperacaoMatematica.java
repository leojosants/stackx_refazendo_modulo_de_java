import classes.Multiplication;
import classes.MathematicalOperation;
import classes.Add;

public class TestaOperacaoMatematica {

    // EXECUTA A OPERACAO - COM POLIMORFISMO
    public static void calculateOperation(MathematicalOperation o, double x, double y) {
        System.out.println(o.calculate(x, y));
    }

    public static void main(String[] args) {
        calculateOperation(new Add(), 2500, 200);
        calculateOperation(new Multiplication(), 10, 10);
    }
}
