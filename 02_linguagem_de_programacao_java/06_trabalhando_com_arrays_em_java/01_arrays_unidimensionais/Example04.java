public class Example04 {
    public static void main(String[] args) {
        int value[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i] + " - " + value[9 - i]);
        }
    }
}
