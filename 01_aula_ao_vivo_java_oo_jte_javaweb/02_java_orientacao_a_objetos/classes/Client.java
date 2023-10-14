package classes;

public class Client extends Person {
    private String record;

    public Client(String name, int age, String CPF, String record) {
        super(name, age, CPF);
        this.record = record;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public void IntroduceYourself() {
        System.out.println("Eu sou um cliente!");
    }
}
