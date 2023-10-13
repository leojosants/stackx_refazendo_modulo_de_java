import classes.ControlCircuit;
import classes.ExampleControlModel1;
import interfaces.ExpoeAttributesControlModel1;

public class Main {
    public static void main(String[] args) {
        // ControlCircuit control_circuit=new ControlCircuit(100, 5, 100, 0)

        ExpoeAttributesControlModel1 controle_2 = new ControlCircuit(100, 0, 100, 0);
        controle_2 = new ExampleControlModel1();
        controle_2.showVolume();
        controle_2.showChannel();
    }
}

/*
 * import classes.Control;
 * 
 * public class Main {
 * public static void main(String[] args) {
 * Control control = new Control(100, 5, 100, 0);
 * 
 * control.informTheChannel(-500);
 * control.showChannel();
 * 
 * // Control control = new Control(100, 5, 100, 0);
 * // for (int i = 0; i < 49; i++) {
 * // control.goUpChannel();
 * // }
 * // control.goUpChannel();
 * // control.goUpChannel();
 * // control.showChannel();
 * }
 * }
 */

/*
 * // import classes.Client;
 * // import classes.Person;
 * 
 * public class Main {
 * public static void main(String[] args) {
 * // Person person_1 = new Person("Leonardo", 39, "000.000.000-02");
 * // Person person_2 = new Person("João", 38, "000.000.000-02");
 * // Person person_3 = new Person("Ana", 45, "000.000.000-02");
 * 
 * // Client client_1 = new Client("José", 34, "000.000.000-02", "001");
 * // client_1.ChangeName("Juca");
 * // client_1.IntroduceYourself();
 * }
 * }
 */