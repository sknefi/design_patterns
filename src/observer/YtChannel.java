package observer;

import java.util.*;

// Youtube channel as a Subject can send notifications to all its Observers (Subscribers)
// to notify them about some changes
public class YtChannel implements Subject {
    private List<Observer>  obs = new ArrayList<>();
    
    public List<Observer>   add(Observer sub)
    {
        this.obs.add(sub);
        return (obs);
    }

    public List<Observer>   remove(Observer sub)
    {
        this.obs.remove(sub);
        return (obs);
    }

    public void             notify_observers(String msg)
    {
        for (Observer ob : obs)
        {
            ob.update(msg);
        }
    }
}
