package comportamentalPatterns.Strategy;

public class PublicTransportStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String a, String b) {
        System.out.println("take the bus numb 12 for 3 stops, then u arrive at "+b);
    }
}
