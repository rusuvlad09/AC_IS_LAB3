package creationalPatterns.FactoryMethod;

public class CreatorAirplane extends CreatorTransport{
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
