package creationalPatterns.Builder;

public class Demo {
    public static void main(String[] args)
    {
        Director director=new Director();
        CarBuilder builder=new CarBuilder();

        director.constructSUV(builder);
        Car car=builder.getCar();
        System.out.println(car.getCarType());

        CarBuilder builder2=new CarBuilder();
        builder2.setCarType(CarType.CITY_CAR);
        builder2.setEngine(new Engine(1.2,0));
        builder2.setSeats(2);
        Car car2=builder2.getCar();
        System.out.println(car2.getCarType());

    }
}
