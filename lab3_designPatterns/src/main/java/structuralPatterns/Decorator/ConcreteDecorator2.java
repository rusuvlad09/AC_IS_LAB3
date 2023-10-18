package structuralPatterns.Decorator;

public class ConcreteDecorator2 extends BaseDecorator{
    public ConcreteDecorator2(Component wrapee) {
        super(wrapee);
    }

    @Override
    public void execute() {
        super.execute();
        extra();
    }
    public void extra()
    {
        System.out.println("concrete decorator 2");
    }
}
