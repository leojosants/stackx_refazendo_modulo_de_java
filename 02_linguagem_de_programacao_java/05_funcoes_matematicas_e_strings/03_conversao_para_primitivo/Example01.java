public class Example01 {
    public static void main(String[] args) {
        double wage, bonus;
        int months;

        wage = Double.parseDouble(args[0]);
        months = Integer.parseInt(args[1]);

        if (months <= 12) {
            bonus = wage * 1.05;
        } else if ((months > 12) && (months <= 48)) {
            bonus = wage * 1.10;
        } else {
            bonus = wage * 1.15;
        }

        System.out.println("Valor do Bônus: R$" + bonus);
    }
}
