# Exercício 06 - Caminhão Monstro (Herança)

- Suponha que você possui as duas classes a seguir, já declaradas:

    - public class Carro {
        - public void m1() {
            - System.out.println("carro 1");
        - }

        - public void m2() {
            - System.out.println("carro 2");
        - }
    
        - public String toString() {
            - return "vruum";
        - }
    - }

    - public class Caminhao extends Carro {
        - public void m1() {
            - System.out.println("caminhao 1");
        - }
        
        - public void m2() {
            - super.m1();
        - }
        
        - public String toString() {
            - return super.toString() + super.toString();
        - }
    - } 
  
- Crie uma classe CaminhaoMonstro cujos métodos tenham o comportamento descrito na tabela a seguir.
    
- Não apenas imprima/retorne a saída; sempre que possível, use herança para reutilizar o comportamento da superclasse.

<table>
    <tr>
        <td>Método</td>
        <td colspan="2">Saída / Retorno</td>
    </tr>
    <tr>
        <td>m1</td>
        <td colspan="2">monstro 1</td>
    </tr>
    <tr>
        <td>m2</td>
        <td>caminhao 1</td>
        <td>carro 1</td>
    </tr>
    <tr>
        <td>toString</td>
        <td colspan="2">"monstro vruumvruum"</td>
    </tr>
</table>
