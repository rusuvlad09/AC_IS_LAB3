package creationalPatterns.FactoryMethod;

public class Airplane implements Transport{
    @Override
    public void deliver() {
        System.out.println("delivered by plane");
    }
}
