import classes.Fighter;

public class Main {
    public static void main(String[] args) throws Exception {

        Fighter[] fighters_vector = new Fighter[6];

        fighters_vector[0] = new Fighter("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);

        fighters_vector[1] = new Fighter("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);

        fighters_vector[2] = new Fighter("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);

        fighters_vector[3] = new Fighter("Dead Code", "Austrália", 28, 1.93, 81.6, 12, 2, 1);

        fighters_vector[4] = new Fighter("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);

        fighters_vector[5] = new Fighter("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);
    }
}
