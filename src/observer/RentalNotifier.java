package observer;

import observer.interfaces.Observer;
import observer.interfaces.Subject;

import java.util.*;

public class RentalNotifier implements Subject {
    private final List<observer.interfaces.Observer> observers = new ArrayList<>();

    public void attach(observer.interfaces.Observer o) { observers.add(o); }
    public void detach(observer.interfaces.Observer o) { observers.remove(o); }

    public void notifyObservers(String message) {
        for (Observer o : observers)
            o.update(message);
    }
}