public class Example05 {
    public static void main(String[] args) {
        double weigth = 75.9;
        double heigth = 1.70;
        double body_mass_index = (weigth + (heigth * heigth)) / 2;

        if (body_mass_index < 17) {
            System.out.println("Muito abaixo do peso!");
        } else if (body_mass_index >= 17 && body_mass_index <= 18.49) {
            System.out.println("Abaixo do peso!");
        } else if (body_mass_index >= 18.50 && body_mass_index <= 24.99) {
            System.out.println("Peso normal!");
        } else if (body_mass_index >= 25 && body_mass_index <= 29.99) {
            System.out.println("Acima do peso!");
        } else if (body_mass_index >= 30 && body_mass_index <= 34.99) {
            System.out.println("Obesidade I!");
        } else if (body_mass_index >= 35 && body_mass_index <= 39.99) {
            System.out.println("Obesidade II (severa)!");
        } else if (body_mass_index >= 40) {
            System.out.println("Obesidade III (mórbida)!");
        }
    }
}