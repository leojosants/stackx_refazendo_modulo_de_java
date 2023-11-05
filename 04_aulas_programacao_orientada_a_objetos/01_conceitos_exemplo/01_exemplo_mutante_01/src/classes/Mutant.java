package classes;


public class Mutant {
	
	// Atributos
	public String first_name;
	public String last_name;
	public String name_mutant;
	public int age;
	public int level;
	
	
	// M�todos
	@Override
	public String toString() {
		return "Mutante: " + name_mutant
				+ "\nNome real: " + first_name + " " + last_name
				+ "\nIdade: " + age;
	}
	
	public String getLevelName() {
		String level_name = "";
		switch (level) {
			case 0:
				level_name = "Episolon";
				break;
			case 1:
				level_name = "Delta";
				break;
			case 2:
				level_name = "Gamma";
				break;
			case 3:
				level_name = "Beta";
				break;
			case 4:
				level_name = "Alpha";
				break;
			case 5:
				level_name = "Omega";
				break;
	
			default:
				break;
		}
		return level_name;
	}
}
