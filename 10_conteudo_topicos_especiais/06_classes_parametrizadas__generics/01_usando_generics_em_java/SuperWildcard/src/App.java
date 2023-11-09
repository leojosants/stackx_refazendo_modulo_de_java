import classes.Box;

public class App {
    public static void main(String[] args) throws Exception {
        
        Box<Integer> integer_box = new Box<Integer>();
        Box<String> string_box = new Box<String>();

        integer_box.add(new Integer(10));
        string_box.add(new String("Hello World"));

        System.out.printf("Integer value: %d%n",integer_box.getT());
        System.out.printf("String  value: %s%n",string_box.getT());
    }
}
