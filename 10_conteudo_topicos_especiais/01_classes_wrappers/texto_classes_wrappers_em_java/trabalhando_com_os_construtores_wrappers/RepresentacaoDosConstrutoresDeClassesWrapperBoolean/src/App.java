public class App {
    public static void main(String[] args) throws Exception {

        boolean flag_1 = true;
        boolean flag_2 = false;
        String flag_3 = "true";

        Boolean b_1 = new Boolean("truE");
        Boolean b_2 = new Boolean("TRUE");
        Boolean b_3 = new Boolean("TuE");
        Boolean b_4 = new Boolean(flag_3);

        if (b_1) {
            System.out.println("B1 é verdadeiro!"); // B1 é verdadeiro!
        }

        if (flag_1 == b_2) {
            System.out.println("flag1 == b2: Igual"); // flag1 == b2: Igual

        } else {
            System.out.println("flag1 == b2: Diferente");
        }

        System.out.println(flag_1 == b_1 ? "flag_1 == b_1: Igual" : "flag_1 == b_1: Diferente"); // flag_1 == b_1: Igual
        System.out.println(flag_1 == b_3 ? "flag_1 == b_3: Igual" : "flag_1 == b_3: Diferente"); // flag_1 == b_3: Diferente
        System.out.println(flag_1 == b_4 ? "flag_1 == b_4: Igual" : "flag_1 == b_4: Diferente"); // flag_1 == b_4: Igual

        Boolean b_5 = new Boolean("false");
        Boolean b_6 = new Boolean("faLse");
        Boolean b_7 = new Boolean("FALSE");
        Boolean b_8 = new Boolean("flse");

        System.out.println(flag_2 == b_5 ? "flag_2 == b_5: Igual" : "flag_2 == b_5: Diferente"); // flag_2 == b_5: Igual
        System.out.println(flag_2 == b_6 ? "flag_2 == b_6: Igual" : "flag_2 == b_6: Diferente"); // flag_2 == b_6: Igual
        System.out.println(flag_2 == b_7 ? "flag_2 == b_7: Igual" : "flag_2 == b_7: Diferente"); // flag_2 == b_7: Igual
        System.out.println(flag_2 == b_8 ? "flag_2 == b_8: Diferente" : "flag_2 == b_8: Igual"); // flag_2 == b_8: Igual
    }
}
