public class App {
    public static void main(String[] args) throws Exception {
        /*
         * valueOf(String s) – Método do tipo wrapper usado para converter um objeto
         * String para um objeto wrapper, sendo que retorna um objeto wrapper recém
         * criado do tipo que chamou o método.
         */

        Integer age = new Integer(39);
        String age_string = String.valueOf(age);
        String speed = new String("568.55");
        Double speed_double = Double.valueOf(speed);

        System.out.println("Idade string: " + age_string);
        System.out.println("Velocidade double: " + speed_double);
    }
}
