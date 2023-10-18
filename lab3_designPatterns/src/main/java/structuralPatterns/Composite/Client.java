package structuralPatterns.Composite;

import java.util.ArrayList;

public class Client {
    ArrayList<Component> componente;
    public Client(ArrayList<Component> componente)
    {
        this.componente=componente;
    }
    public void execute()
    {
        this.componente.add(new Leaf());
        this.componente.add(new Leaf());
        this.componente.add(new Composite(new ArrayList<>()));
        Composite container=new Composite(this.componente);
        container.execute();
    }
}
