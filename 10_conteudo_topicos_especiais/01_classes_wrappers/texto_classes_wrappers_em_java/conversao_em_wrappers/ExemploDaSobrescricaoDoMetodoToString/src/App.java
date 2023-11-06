import classes.Client;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * toString() – Retorna a representação de um objeto (tipo primitivo
         * encapsulado).
         */

         Client client_1 = new Client();
         client_1.setName("Maria");
         client_1.setAddress("Av. dos Mares, 321");
          
         System.out.println(client_1.toString());
    }
}
