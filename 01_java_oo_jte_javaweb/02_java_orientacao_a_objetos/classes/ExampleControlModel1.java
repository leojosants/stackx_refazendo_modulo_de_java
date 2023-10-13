package classes;

import interfaces.ExpoeAttributesControlModel1;

public class ExampleControlModel1 implements ExpoeAttributesControlModel1 {

    @Override
    public void showChannel() {
        System.out.println("Isso é um teste!");
    }

    @Override
    public void showVolume() {
        System.out.println("Isso é um exemplo!");
    }

}
