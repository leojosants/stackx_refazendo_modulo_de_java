public class Example01 {
    public static void main(String[] args) {
        int z = 0;

        for (int i = 0; i < 10; i++) {
            z = i;

            if (i > 4) {
                break;
            }
        }

        System.out.println("Último valor de i: " + z);
    }
}
