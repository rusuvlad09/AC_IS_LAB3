package comportamentalPatterns.Strategy;

public class WalkingStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String a, String b) {
        System.out.println("walk 300 m....");
    }
}
