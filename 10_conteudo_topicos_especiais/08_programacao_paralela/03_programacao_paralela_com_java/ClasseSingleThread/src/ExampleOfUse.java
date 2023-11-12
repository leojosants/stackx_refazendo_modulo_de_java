import java.util.ArrayList;
import java.util.Collection;

public class ExampleOfUse {
    public static void main(String[] args) throws Exception {

        // armazena o tempo inicial
        long initial_time = System.currentTimeMillis();

        int initial_value = 1;
        int final_value = 1000000;

        // lista para armazenar os numeros primos encontrados pelas threads
        Collection<Long> primes = new ArrayList<>();

        // percorre o intervalo buscano os numeros primos
        for (long until = initial_value; until <= final_value; until++) {
            int prime = 0;

            for (int i = 2; i < until; i++) {
                if ((until % i) == 0) {
                    prime++;
                    break;
                }
            }

            if (prime == 0) {
                synchronized (primes) {
                    primes.add(until);
                }
            }
        }

        // imprime os numeros primos encontrados por todas as threads
        for (Long prime : primes) {
            System.out.println(prime);
        }
       
        // calcula e imprime o tempo total gasto
        System.out.println("tempo: " + (System.currentTimeMillis() - initial_time));
    }
}
