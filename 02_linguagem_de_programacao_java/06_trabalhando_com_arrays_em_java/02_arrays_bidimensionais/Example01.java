/* 
    Escreva um programa que crie uma matriz de tamanho 2x2 de valores do tipo int, usando um array de duas dimensoes. Nesse programa, calcule o determinante da matriz e imprima seu valor
*/

public class Example01 {
    public static void main(String[] args) {
        int x[][] = new int[2][2];

        x[0][0] = 3;
        x[0][1] = 5;
        x[1][0] = 8;
        x[1][1] = 13;

        int determinant = ((x[0][0] * x[1][1]) - (x[0][1] * x[1][0]));

        System.out.println("Determinante = " + determinant);
    }
}
