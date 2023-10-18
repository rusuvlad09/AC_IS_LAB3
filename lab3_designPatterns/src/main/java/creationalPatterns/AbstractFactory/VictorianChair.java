package creationalPatterns.AbstractFactory;

public class VictorianChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("sit on Victorian Chair");
    }

    @Override
    public void hasLegs() {
        System.out.println("has 4 victorian legs");
    }
}
