public class ArrayCopy {
    public static void main(String[] args) {
        char[] array_1 = { 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'a', 'c', 'a', 'o' };
        char[] array_2 = new char[array_1.length];

        System.arraycopy(array_1, 0, array_2, 0, array_1.length);

        for (int i = 0; i < array_2.length; i++) {
            System.out.println(array_2[i]);
        }
    }
}
