public class App {
    public static void main(String[] args) throws Exception {

        int x = 100;

        if (x <= 200) {
            if (x < 100) {
                if (x < 0) {
                    System.out.println("A");

                } else {
                    System.out.println("B");
                }
            } else {
                System.out.println("C");
            }
        } else {
            System.out.println("D");
        }
    }
}
