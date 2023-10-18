package structuralPatterns.Adapter;

public class RoundHole {
    private double radius;
    public RoundHole(double radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public boolean fits(RoundPeg peg)
    {
        boolean result;
        result=(this.radius>=peg.getRadius());
        return result;
    }
}
