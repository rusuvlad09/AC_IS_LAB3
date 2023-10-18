package creationalPatterns.AbstractFactory;

public class Client {
    private AbstractFactory factory;
    public Client (AbstractFactory factory)
    {
        this.factory=factory;
    }
    public void someOperation()
    {
        Chair chair= factory.createChair();
        Sofa sofa= factory.createSofa();
        chair.hasLegs();
        chair.sitOn();
        sofa.canLayOn();
        sofa.isComfy();
    }
}
