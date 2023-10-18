package comportamentalPatterns.Observer;

import java.util.ArrayList;

public class Client {
    public static void main (String[] args)
    {
        Publisher publisher=new Publisher(new ArrayList<>());
        Subscriber s=new ConcreteSubscriber1();
        Subscriber s2=new ConcreteSubscriber2();
        publisher.subscribe(s);
        publisher.subscribe(s2);
        publisher.mainBussinesLogic();
    }

}
