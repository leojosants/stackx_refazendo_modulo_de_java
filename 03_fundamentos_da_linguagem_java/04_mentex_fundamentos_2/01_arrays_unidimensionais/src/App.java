import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        // tipos de declaracao
        /*
         * int array1[] = new int[3];
         * array1[0] = 1;
         * array1[1] = 2;
         * array1[2] = 3;
         * 
         * System.out.println(array1[0]);
         * System.out.println(array1[1]);
         * System.out.println(array1[2]);
         */

        /*
         * int[] array2 = new int[3];
         * array2[0] = 1;
         * array2[1] = 2;
         * array2[2] = 3;
         * 
         * System.out.println(array2[0]);
         * System.out.println(array2[1]);
         * System.out.println(array2[2]);
         */

        /*
         * int array3[];
         * array3 = new int[3];
         */

        // inicializacao
        /**
         * 
         * double grades[] = { 8.5, 4.0, 6.5 };
         * 
         * System.out.println(grades[0]);
         * System.out.println(grades[1]);
         * System.out.println(grades[2]);
         */

        // imprimindo array com FOR
        /*
         * int numbers[] = { 2, 5, 6, 3, 4, 9, 2, 5 };
         * 
         * for (int i = 0; i < numbers.length; i++) {
         * System.out.printf("numbers[%d]: %d%n", i, numbers[i]);
         * }
         */

        // metodos uteis - arraycopy
        /*
         * char[] charArray = { 'j', 'a', 'v', 'a' };
         * char[] charArrayCopied = new char[4];
         * 
         * System.arraycopy(charArray, 0, charArrayCopied, 0, 4);
         * 
         * for (int i = 0; i < charArrayCopied.length; i++) {
         * System.out.printf("charArrayCopied[%d]: %c%n", i, charArrayCopied[i]);
         * }
         */

        // metodos uteis - sort
        int[] numbers = { 3, 0, 10, 4, 39, 5, 32, 958, 43 };
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        
        Arrays.sort(numbers);
        System.out.println("");
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
    }
}
