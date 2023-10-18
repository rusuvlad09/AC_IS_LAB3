package structuralPatterns.Decorator;

public class ConcreteDecorator1 extends BaseDecorator{
    public ConcreteDecorator1(Component wrapee) {
        super(wrapee);
    }
    public void execute()
    {
        extra();
        super.execute();
    }
    public void extra()
    {
        System.out.println("concrete decorator1");
    }
}
