package creationalPatterns.AbstractFactory;

public class Demo {
    public static void main (String []args)
    {
        AbstractFactory factory=new ModernFactory();
        Client client1=new Client(factory);
        client1.someOperation();
    }
}
