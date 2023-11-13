package demo;

import org.apache.commons.lang3.StringUtils;

public class Test {

	public static void main(String[] args) {

		String full_name = "Leonardo José de Oliveira Santos";
		
		
		
		String abbreviated_name = StringUtils.abbreviate(full_name, 10);

		System.out.printf("\nNome completo: %s%n", full_name);
		System.out.printf("\nNome abreviado: %s%n", abbreviated_name);
	}

}
