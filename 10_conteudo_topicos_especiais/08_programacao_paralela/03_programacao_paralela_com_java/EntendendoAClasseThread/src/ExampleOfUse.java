import classes.Task;

public class ExampleOfUse {
    public static void main(String[] args) throws Exception {
        // cria 3 tarefas
        Task task_1 = new Task(0, 1000);
        Task task_2 = new Task(1001, 2000);
        Task task_3 = new Task(2001, 3000);

        // seta os nomes
        task_1.setName("Tarefa1");
        task_2.setName("Tarefa2");
        task_3.setName("Tarefa3");

        // inicia a execução paralela das 3 tarefas, iniciando 3 novas threads no
        // programa
        task_1.start();
        task_2.start();
        task_3.start();

        // aguarda a finalização das tarefas
        try {
            task_1.join();
            task_2.join();
            task_3.join();

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        // Exibimos o somatório dos totalizadores de cada Thread
        System.out.println("Total: " + (task_1.getTotal() + task_2.getTotal() + task_3.getTotal()));
    }
}
