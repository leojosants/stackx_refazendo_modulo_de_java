public class App {
    public static void main(String[] args) throws Exception {
        // comparative: < > <= >= instanceof
        System.out.println("comparative");
        System.out.println(9 < 9);
        System.out.println(9 > 19);
        System.out.println(3 >= 19);
        System.out.println(33 <= 19);

        // equality: == !=
        System.out.println("\nequality");
        System.out.println("10" == "10");
        System.out.println(104 != 10);

        // logicians: && || !
        System.out.println("\nlogicians");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(!false);
        System.out.println(!true);
    }
}
