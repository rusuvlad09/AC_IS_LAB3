package structuralPatterns.Composite;

public class Leaf implements Component{
    @Override
    public void execute() {
        System.out.println("I am a leaf");
    }
}
