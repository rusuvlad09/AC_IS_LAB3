package comportamentalPatterns.Observer;

import java.util.ArrayList;

public class Publisher {
    private ArrayList<Subscriber> subscribers;
    private String mainState;
    public Publisher(ArrayList<Subscriber> subscribers)
    {
        this.subscribers=subscribers;
        mainState="nimic nou";
    }
    public void subscribe(Subscriber subscriber)
    {
        this.subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber)
    {
        this.subscribers.remove(subscriber);
    }
    public void notifySubscribers()
    {
       for(int i=0;i<this.subscribers.size();i++)
           this.subscribers.get(i).update(this.mainState);
    }
    public void mainBussinesLogic()
    {
        for(int i=0;i<3;i++) {
            mainState = "stare noua"+i;
            notifySubscribers();
        }
    }
}
