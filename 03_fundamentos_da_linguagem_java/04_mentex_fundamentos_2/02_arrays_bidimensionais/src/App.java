public class App {
    public static void main(String[] args) throws Exception {

        // tipos de declaracao
        /*
         * int[][] array1 = new int[3][2];
         * 
         * int array2[][] = new int[3][2];
         * 
         * int[] array3[] = new int[3][2];
         */

        // inserindo valores
        /*
         * int array2[][] = new int[3][3];
         * 
         * array2[0][0] = 1;
         * array2[0][1] = 2;
         * array2[0][2] = 3;
         * 
         * array2[1][0] = 4;
         * array2[1][1] = 5;
         * array2[1][2] = 6;
         * 
         * array2[2][0] = 7;
         * array2[2][1] = 8;
         * array2[2][2] = 9;
         */

        // inserindo valores
        int array4[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int line = 0; line < array4.length; line++) {
            for (int column = 0; column < array4[0].length; column++) {
                System.out.printf("%d \t", array4[line][column]);
            }
            System.out.println("");
        }
    }
}
