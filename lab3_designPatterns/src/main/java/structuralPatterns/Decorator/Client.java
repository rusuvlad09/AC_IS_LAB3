package structuralPatterns.Decorator;

public class Client {
    public static void main (String[] args)
    {
        Component a=new ConcreteComponent();
        Component b=new ConcreteDecorator1(a);
        Component c=new ConcreteDecorator2(b);
        c.execute();
    }
}
