package creationalPatterns.FactoryMethod;

public abstract class CreatorTransport {
    public void operation()
    {
        Transport t=createTransport();
        t.deliver();
    }
    public abstract Transport createTransport();
}
