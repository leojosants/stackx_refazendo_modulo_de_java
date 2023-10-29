import classes.Person;

public class App {
    public static void main(String[] args) throws Exception {
        
        Person person = new Person("Leonardo", 39, 1.70);
        person.displayData();
        person.haveBirthday();
        person.displayData();
    }
}
