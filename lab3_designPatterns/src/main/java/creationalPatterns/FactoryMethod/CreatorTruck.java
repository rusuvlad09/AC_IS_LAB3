package creationalPatterns.FactoryMethod;

public class CreatorTruck extends CreatorTransport{
    @Override
    public Transport createTransport() {
       return new Truck();
    }
}
