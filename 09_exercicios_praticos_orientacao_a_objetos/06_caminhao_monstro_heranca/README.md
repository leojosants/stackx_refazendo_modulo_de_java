# Exercício 06 - Caminhão Monstro (Herança)

    - Suponha que você possui as duas classes a seguir, já declaradas:

<div>
        public class Carro {
            public void m1() {
                System.out.println("carro 1");
            }

            public void m2() {
                System.out.println("carro 2");
            }
            
            public String toString() {
                return "vruum";
            }
        }

        public class Caminhao extends Carro {
            public void m1() {
                System.out.println("caminhao 1");
            }

            public void m2() {
                super.m1();
            }
      
            public String toString() {
                return super.toString() + super.toString();
            }
        }
</div>  
  
  
    - Crie uma classe CaminhaoMonstro cujos métodos tenham o comportamento descrito na tabela a seguir.
    
    - Não apenas imprima/retorne a saída; sempre que possível, use herança para reutilizar o comportamento da superclasse.

    Método	    Saída / Retorno
    m1	        monstro 1
    m2	        caminhao 1
                carro 1
    
    toString	"monstro vruumvruum"