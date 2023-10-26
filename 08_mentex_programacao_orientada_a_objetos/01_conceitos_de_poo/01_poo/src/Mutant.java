public class Mutant {

    public String firstName;
    public String lastName;
    public String warName;
    public int age;
    public int level;

    public String toString() {
        return "Mutante: " + warName
                + "\nNome real: " + firstName
                + "\nSobrenome real: " + lastName
                + "\nIdade: " + age;
    }

    public  String obterNomeNivel() {
        String levelName = "";
         
        switch (level) {
            case 0:
                levelName = "Episolon";
                break;

            case 1:
                levelName = "Delta";
                break;

            case 2:
                levelName = "Gama";
                break;

            case 3:
                levelName = "Beta";
                break;

            case 4:
                levelName = "Alpha";
                break;

            case 5:
                levelName = "Omega";
                break;

            default:
                break;
        }
        
        return levelName;
    }
}
