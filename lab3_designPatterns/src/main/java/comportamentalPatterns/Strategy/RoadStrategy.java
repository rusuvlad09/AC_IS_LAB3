package comportamentalPatterns.Strategy;

public class RoadStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String a, String b) {
        System.out.println("Start from"+a+" Drive 200 m then turn left"+b+"is on the right");
    }
}
