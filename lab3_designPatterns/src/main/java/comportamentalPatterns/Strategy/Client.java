package comportamentalPatterns.Strategy;

public class Client {
    public static void main(String[] args)
    {
        Navigator navigator=new Navigator();
        RouteStrategy strategy=new WalkingStrategy();
        navigator.setStrategy(strategy);
        navigator.buildRoute("cluj","bucuresti");
    }
}
