package structuralPatterns.Composite;

import java.util.ArrayList;

public class Composite implements Component{
    private ArrayList<Component> children;
    public Composite(ArrayList<Component> children)
    {
        this.children=children;
    }
    @Override
    public void execute() {
        System.out.println("composite->my elemnts->");
        for(int i=0;i<this.children.size();i++)
            this.children.get(i).execute();
    }
    public void addChildren(Component child)
    {
        this.children.add(child);
    }
    public void removeChildren(Component child)
    {
        this.children.remove(child);
    }
    public ArrayList<Component> getChildren()
    {
        return this.children;
    }

}
