package creationalPatterns.FactoryMethod;

public class CreatorShip extends CreatorTransport{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
