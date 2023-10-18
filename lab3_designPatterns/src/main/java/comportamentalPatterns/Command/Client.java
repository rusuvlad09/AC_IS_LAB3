package comportamentalPatterns.Command;

public class Client {
    public static void main (String[] args)
    {
        Receiver receiver=new Receiver();
        Invoker invoker=new Invoker();
        invoker.setCommand(new ConcreteCommand1(3,4,5,receiver));
        invoker.executeCommand();
    }
}
