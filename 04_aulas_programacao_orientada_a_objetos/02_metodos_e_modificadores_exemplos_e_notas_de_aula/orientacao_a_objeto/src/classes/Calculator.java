package classes;

public class Calculator {
 
    // M�todos
	
	// Estrutura de um m�todo: declara��o e corpo
	// [qualificador] tipoDoRetorno nomeDoMetodo(listaDeParametros...) { 
	// 	... 
	// }
	public int performSum(int a, int b) {
		int sum = a + b;
		
		return sum;
	}
	
	public void printSum(int a, int b) {
		System.out.println(a + b);
	}
    
}
