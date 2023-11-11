import java.time.LocalDate;

import classes.Person16;

public class App {
    public static void main(String[] args) throws Exception {

        Person16 person_1 = new Person16("Leonardo");
        System.out.println(person_1.getCreatedAt());
        person_1.setDateOfBirth(LocalDate.of(1984, 05, 03));
        person_1.displayData();
    }
}
