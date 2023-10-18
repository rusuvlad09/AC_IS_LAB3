package structuralPatterns.Decorator;

public class ConcreteComponent implements Component{
    @Override
    public void execute() {
        System.out.println("normal component");
    }
}
