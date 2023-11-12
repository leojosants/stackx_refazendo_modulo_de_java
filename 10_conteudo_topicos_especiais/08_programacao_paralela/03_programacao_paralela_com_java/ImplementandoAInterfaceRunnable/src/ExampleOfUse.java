import java.util.ArrayList;
import java.util.Collection;

import classes.CalculatePrimes;

public class ExampleOfUse {
    public static void main(String[] args) throws Exception {

        // armazena o tempo inicial
        long initial_time = System.currentTimeMillis();

        // armazena a quantidade de nucleos de processamento disponiveis
        int numbers_threads = Runtime.getRuntime().availableProcessors();

        // intervalo de busca predeterminado
        int initial_value = 1;
        int final_value = 1000000;

        // lista para armazenar os numeros primos encontrados pelas threads
        Collection<Long> primes = new ArrayList<>();

        // lista de threads
        Collection<Thread> threads = new ArrayList<>();

        int work = final_value / initial_value;

        // cria threads conforme a quantidade de nucleos
        for (int i = 1; i <= numbers_threads; i++) {

            // trab é a quantidade de valores que cada thread irá calcular
            int trab = Math.round(work / numbers_threads);

            // calcula o valor inicial e final do intervalo de cada thread
            int end = trab * i;
            int start = (end - trab) + 1;

            // cria a thread passando por parametro um objeto da classe CalculaPrimos2
            // que implementa Runnable
            Thread thread = new Thread(new CalculatePrimes(start, end, primes));

            // define um nome para a thread
            thread.setName("Thread " + i);
            threads.add(thread);
        }

        // percorre as threads criadas iniciando-as
        for (Thread th : threads) {
            th.start();
        }

        // aguarda todas as threads finalizarem o processamento
        for (Thread th : threads) {
            try {
                th.join();
           
            } catch (InterruptedException ex) {
                ex.printStackTrace();
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
