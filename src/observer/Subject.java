package observer;

import java.util.*;

public interface Subject {
    void              notify_observers(String msg);
    List<Observer>    add(Observer o);
    List<Observer>    remove(Observer o);
}
