import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        int initial_size = 3;

        ArrayList<ArrayList<Integer>> matriz = new ArrayList<ArrayList<Integer>>(initial_size);

        ArrayList<Integer> a_1 = new ArrayList<Integer>();
        a_1.add(1);
        a_1.add(2);
        a_1.add(3);
        matriz.add(a_1);

        ArrayList<Integer> a_2 = new ArrayList<Integer>();
        a_2.add(4);
        a_2.add(5);
        a_2.add(6);
        matriz.add(a_2);

        ArrayList<Integer> a_3 = new ArrayList<Integer>();
        a_3.add(7);
        a_3.add(8);
        a_3.add(9);
        matriz.add(a_3);

        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                System.out.print(matriz.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
