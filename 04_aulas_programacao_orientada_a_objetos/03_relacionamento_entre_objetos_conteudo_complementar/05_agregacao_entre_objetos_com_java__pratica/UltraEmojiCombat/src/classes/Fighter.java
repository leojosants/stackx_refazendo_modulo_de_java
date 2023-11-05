package classes;

public class Fighter {
    /*
     * attributes
     */
    private String name;
    private String nationality;
    private int age;
    private double height;
    private double weight;
    private String category;
    private int victories;
    private int defeats;
    private int draws;

    /*
     * constructor
     */
    public Fighter(String name, String nationality, int age, double height, double weight, int victories,
            int defeats, int draws) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.height = height;
        this.setWeight(weight);
        this.victories = victories;
        this.defeats = defeats;
        this.draws = draws;
    }

    /*
     * getters and setters
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return this.category;
    }

    private void setCategory() {
        if (this.weight < 52.2) {
            this.category = "Inválido";

        } else if (this.weight <= 70.3) {
            this.category = "Leve";

        } else if (this.weight <= 83.9) {
            this.category = "Médio";

        } else if (this.weight <= 120.2) {
            this.category = "Pesado";

        } else {
            this.category = "Inválido";
        }
    }

    public int getVictories() {
        return this.victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefeats() {
        return this.defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getDraws() {
        return this.draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    /*
     * methods
     */
    public void introduce() {
        System.out.println("\n- - - - - APRESENTANDO LUTADOR - - - - -");
        System.out.printf("Nome:          %s%n", this.getName());
        System.out.printf("Nacionalidade: %s%n", this.getNationality());
        System.out.printf("Idade:         %d anos %n", this.getAge());
        System.out.printf("Altura:        %.2fm %n", this.getHeight());
        System.out.printf("Peso:          %.2fKg%n", this.getWeight());
        System.out.printf("Vitória(s):    %d%n", this.getVictories());
        System.out.printf("Derrota(s):    %d%n", this.getDefeats());
        System.out.printf("Empate(s):     %d%n", this.getDraws());
    }

    public void status() {
        System.out.println("\n- - - - - STATUS - - - - -");
        System.out.printf("Nome:        %s%n", this.getName());
        System.out.printf("Categoria:   %s%n", this.getCategory());
        System.out.printf("Vitória(s):  %d%n", this.getVictories());
        System.out.printf("Derrota(s):  %d%n", this.getDefeats());
        System.out.printf("Empate(s):   %d%n", this.getDraws());
    }

    public void winFight() {
        this.setVictories(this.getVictories() + 1);
    }

    public void loseFight() {
        this.setDefeats(this.getDefeats() + 1);
    }

    public void drawFight() {
        this.setDraws(this.getDraws() + 1);
    }
}
