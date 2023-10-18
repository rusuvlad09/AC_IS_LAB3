package structuralPatterns.Adapter;

public class Demo {
    public static void main(String[] args)
    {
        RoundHole hole=new RoundHole(5);
        RoundPeg rpeg=new RoundPeg(5);

        if(hole.fits(rpeg))
            System.out.println("rpeg r5 fits in hole r5");

        SquarePeg smallSpeg=new SquarePeg(2);
        SquarePeg bigSpeg=new SquarePeg(20);

        SquarePegAdapter smallAdapter=new SquarePegAdapter(smallSpeg);
        SquarePegAdapter bigAdapter=new SquarePegAdapter(bigSpeg);

        if(hole.fits(smallAdapter))
            System.out.println("square peg w2 fits hole r5");

        if(!hole.fits(bigAdapter))
            System.out.println("square peg w20 doesnt fit hole r5");
    }
}
