package structuralPatterns.Decorator;

public class BaseDecorator implements Component{
    private Component wrapee;

    public BaseDecorator(Component wrapee)
    {
        this.wrapee=wrapee;
    }
    @Override
    public void execute() {
        wrapee.execute();
    }
}
