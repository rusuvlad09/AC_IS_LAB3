package comportamentalPatterns.Command;

public class ConcreteCommand1 implements Command{
    Receiver receiver;
    private final int a;
    private final int b;
    private final int c;
    public ConcreteCommand1(int a,int b,int c,Receiver receiver)
    {
        this.a=a;
        this.b= b;
        this.c=c;
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        this.receiver.operation(this.a,this.b,this.c);
    }
}
