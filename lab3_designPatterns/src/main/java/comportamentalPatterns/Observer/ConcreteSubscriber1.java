package comportamentalPatterns.Observer;

public class ConcreteSubscriber1 implements Subscriber{
    @Override
    public void update(String context) {
        System.out.println("subscriber1 a primit"+context);
    }
}
