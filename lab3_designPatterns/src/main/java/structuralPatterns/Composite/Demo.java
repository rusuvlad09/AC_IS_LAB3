package structuralPatterns.Composite;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args)
    {
        ArrayList<Component> componente=new ArrayList<>();
        Client client=new Client(componente);
        client.execute();
    }

}
