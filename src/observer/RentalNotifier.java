package observer;

import java.util.*;

public class RentalNotifier implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void attach(Observer o) { observers.add(o); }
    public void detach(Observer o) { observers.remove(o); }

    public void notifyObservers(String message) {
        for (Observer o : observers)
            o.update(message);
    }
}