package creationalPatterns.AbstractFactory;

public class VictorianSofa implements Sofa{
    @Override
    public void isComfy() {
        System.out.println("comfy victorian sofa");
    }

    @Override
    public void canLayOn() {
        System.out.println("lay on a victorian sofa");
    }
}
