/*
    Escreva um programa que some a população dos 3 principais estados da confederacao, sabendo-se que cada estado tem 5 municipios e imprima suas respectivas populacoes
*/

public class Example02 {
    public static void main(String[] args) {
        int[][] population = new int[3][5];
        int total = 0;

        population[0][0] = 1012;
        population[0][1] = 2120;
        population[0][2] = 1451;
        population[0][3] = 1241;
        population[0][4] = 1541;

        population[1][0] = 958;
        population[1][1] = 451;
        population[1][2] = 847;
        population[1][3] = 542;
        population[1][4] = 439;

        population[2][0] = 2897;
        population[2][1] = 4125;
        population[2][2] = 3562;
        population[2][3] = 4145;
        population[2][4] = 1785;

        for (int state = 0; state < 3; state++) {
            for (int county = 0; county < population.length; county++) {
                total = total + population[state][county];
            }

            System.out.println("Estado " + (state + 1) + " População = " + total);
            total = 0;
        }
    }
}
