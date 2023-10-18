package creationalPatterns.FactoryMethod;

public class Ship implements Transport{

    @Override
    public void deliver() {
        System.out.println("deliver by boat on the sea");
    }
}
