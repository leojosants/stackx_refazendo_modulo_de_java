public class App {
    public static void main(String[] args) throws Exception {

        boolean cond1 = false;
        boolean cond2 = false;
        boolean cond3 = true;

        if (cond1) {
            System.out.println("Comando 1");
            System.out.println("Comando 2");

        } else {
            if (cond2) {
                System.out.println("Comando 3");
            }

            if (cond3) {
                System.out.println("Comando 4");

            } else {
                System.out.println("Comando 5");
            }

            System.out.println("Comando 6");
        }

        System.out.println("Comando 7");
        System.exit(0);
    }
}
