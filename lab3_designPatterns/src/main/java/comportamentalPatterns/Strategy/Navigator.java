package comportamentalPatterns.Strategy;

public class Navigator {
    private RouteStrategy strategy;
    public void setStrategy(RouteStrategy strategy)
    {
        this.strategy=strategy;
    }
    public void buildRoute(String a,String b)
    {
        this.strategy.buildRoute(a,b);
    }

}
