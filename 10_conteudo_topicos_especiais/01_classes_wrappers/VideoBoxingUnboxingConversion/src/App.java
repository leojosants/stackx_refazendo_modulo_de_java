public class App {
    public static void main(String[] args) throws Exception {
        /*
         * primitive types
         */
        byte primitive_byte = 1;
        short primitive_short = 1;
        int primitive_int = 10;
        long primitive_long = 10;
        float primitive_float = 10;
        double primitive_double = 10;
        char primitive_char = 'A';
        boolean primitive_boolean = true;

        /*
         * wrappers
         */
        Byte wrapper_byte = 1;
        Short wrapper_short = 1;

        Integer wrapper_int = new Integer("10");
        // System.out.println(wrapper_int);

        Long wrapper_long = Long.valueOf("10");
        // System.out.println(wrapper_long);

        Float wrapper_float = new Float("10");
        // System.out.println(wrapper_float);

        Double wrapper_double = 10D;

        Character wrapper_char = 'A';
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isLetter('d'));
        System.out.println(Character.isUpperCase('R'));
        System.out.println(Character.isLowerCase('y'));
        System.out.println(Character.toUpperCase('r'));
        System.out.println(Character.toLowerCase('Y'));

        Boolean wrapper_boolean = new Boolean("true");
        // System.out.println(wrapper_boolean);

        String value = "10";
        Float f = Float.parseFloat(value);
        // System.out.println(f);
    }
}
