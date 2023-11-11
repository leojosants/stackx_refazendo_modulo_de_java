package classes;

import java.time.LocalDate;
import java.time.Period;

public class Person16 {
    /*
     * attribute
     */
    private String name;
    private LocalDate date_of_birth;
    private LocalDate created_at;
    private LocalDate modified_at;

    /*
     * constructor
     */
    public Person16(String name) {
        this.setName(name);
        this.setCreatedAt(this.getCreatedAt());
    }

    /*
     * getters and setters
     */
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return this.date_of_birth;
    }

    public void setDateOfBirth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public LocalDate getCreatedAt() {
        return this.created_at.now();
    }

    private void setCreatedAt(LocalDate created_at) {
        this.created_at = created_at;
    }

    /*
     * methods
     */
    public int getAge() {
        LocalDate today = LocalDate.now();
        int age = Period.between(this.getDateOfBirth(), today).getYears();
        return age;
    }

    public void displayData() {
        System.out.printf("\nNome:             %s%n", this.getName());
        System.out.printf("Data de nascimento: %s%n", this.getDateOfBirth());
        System.out.printf("Idade:              %d%n", this.getAge());
        System.out.printf("Criado em:          %s%n", this.getCreatedAt());
    }
}
