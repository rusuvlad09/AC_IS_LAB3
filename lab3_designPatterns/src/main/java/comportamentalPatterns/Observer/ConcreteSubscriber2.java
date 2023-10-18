package comportamentalPatterns.Observer;

public class ConcreteSubscriber2 implements Subscriber{
    @Override
    public void update(String context) {
        System.out.println("subscriber 2 a primit"+context);
    }
}
