package creationalPatterns.FactoryMethod;

public class Demo {
    public static void main(String []args)
    {
        CreatorTransport camion=new CreatorTruck();
        camion.operation();
        CreatorTransport barca=new CreatorShip();
        barca.operation();
        CreatorTransport avion=new CreatorAirplane();
        avion.operation();
    }
}
