package creationalPatterns.Builder;

public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;
    public Engine (double volume,double mileage)
    {
        this.volume=volume;
        this.mileage=mileage;
    }
    public void on()
    {
        started=true;
    }
    public void off()
    {
        started=false;
    }
    public boolean isStarted()
    {
        return started;
    }
    public void go(double milage)
    {
        if(started==true)
            this.mileage+=milage;
        else
            System.out.println("CANT GO,START THE ENGINE FIRST");
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}
