import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] number = { 190, 23, 0, 1, 43, 9, 25 };

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

        Arrays.sort(number);
        System.out.println();

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
