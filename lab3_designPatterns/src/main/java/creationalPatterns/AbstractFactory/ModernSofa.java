package creationalPatterns.AbstractFactory;

public class ModernSofa implements Sofa{
    @Override
    public void isComfy() {
        System.out.println("comfy modern sofa");
    }

    @Override
    public void canLayOn() {
        System.out.println("lay on a modern sofa");
    }
}
