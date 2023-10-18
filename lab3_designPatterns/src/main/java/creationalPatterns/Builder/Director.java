package creationalPatterns.Builder;

public class Director {
    public void constructSportsCar(Builder builder)
    {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(4.0,0));
    }
    public void constructCityCar(Builder builder)
    {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(5);
        builder.setEngine(new Engine(1.2,0));
    }
    public void constructSUV(Builder builder)
    {
        builder.setCarType(CarType.SUV);
        builder.setSeats(5);
        builder.setEngine(new Engine(6.0,0));
    }

}
