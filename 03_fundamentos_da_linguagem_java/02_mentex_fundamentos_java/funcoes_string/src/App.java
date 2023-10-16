public class App {
    public static void main(String[] args) throws Exception {
        String firstFruit = "Abacaxi";
        String secondFruit = "abacaxi";

        boolean compareEquals = firstFruit.equals(secondFruit);
        System.out.println(compareEquals);
        
        boolean compareEqualsIgnoreCase = firstFruit.equalsIgnoreCase(secondFruit);
        System.out.println(compareEqualsIgnoreCase);

        System.out.println(firstFruit.length());
        System.out.println(secondFruit.substring(3));
        System.out.println(secondFruit.charAt(3));
        System.out.println(secondFruit.indexOf("caxi"));
    }
}
