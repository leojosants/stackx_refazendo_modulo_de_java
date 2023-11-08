public class App {
    public static void main(String[] args) throws Exception {

        long initial_instant = System.currentTimeMillis();
        // System.out.println(initial_instant);

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long final_intant = System.currentTimeMillis();
        long duration_in_milliseconds = final_intant - initial_instant;

        System.out.printf("Duração em segundos: %d%n", (duration_in_milliseconds / 1000) % 60);
    }
}
