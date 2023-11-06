public class App {
    public static void main(String[] args) throws Exception {

        String num_int = "9822";

        // Representação em String do tipo que está sendo criado
        Float fNum1 = new Float("500.50");
        Integer iNum1 = new Integer(num_int);
        Double dNum1 = new Double("512.22");

        // o argumento somente aceita do tipo char, por isso que é usado aspas simples
        Character cNum = new Character('a');

        // Criação do tipo primitivo natural
        Float fNum2 = new Float(500.50);
        Integer iNum2 = new Integer(2800);
        Double dNum2 = new Double(512.22);

        System.out.println("Float representado por string: " + fNum1);
        System.out.println("Float natural: " + fNum2);
        System.out.println("Integer representado por string: " + iNum1);
        System.out.println("Integer natural: " + iNum2);
        System.out.println("Double representado por string: " + dNum1);
        System.out.println("Double natural: " + dNum2);
        System.out.println("Char: " + cNum);
    }
}
