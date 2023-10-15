public class Randon {
    public static void main(String[] args) {
        int mega_seine_number;

        for (int i = 1; i <= 6; i++) {
            mega_seine_number = (int) (Math.random() * 60);
            System.out.println(mega_seine_number);
        }
    }
}
