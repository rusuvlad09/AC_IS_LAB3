package creationalPatterns.AbstractFactory;

public class ModernChair implements Chair{

    @Override
    public void sitOn() {
        System.out.println("sit on Modern Chair");
    }

    @Override
    public void hasLegs() {
        System.out.println("has 4 modern legs");
    }
}
