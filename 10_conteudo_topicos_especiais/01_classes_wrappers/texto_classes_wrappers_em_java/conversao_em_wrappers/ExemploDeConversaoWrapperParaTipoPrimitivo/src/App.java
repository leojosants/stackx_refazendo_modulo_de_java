public class App {
    public static void main(String[] args) throws Exception {
        /*
         * xxxValue() – Esse tipo de método não contém argumentos e é utilizado quando
         * precisa realizar uma conversão do valor de um objeto wrapper para um objeto
         * primitivo.
         */

        // cria um objeto wrapper
        Integer speed = new Integer(587);

        // converte a variável speed para tipo primitivo
        double total = speed.doubleValue();
        short total_1 = speed.shortValue();
        byte total_2 = speed.byteValue();

        Float pi = new Float(3.14f);
        int value_Pi = pi.intValue();

        System.out.println("Valor de PI arredondado: " + value_Pi);
        System.out.println("Total: " + total);
    }
}
