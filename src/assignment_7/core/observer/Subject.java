package assignment_7.core.observer;

import assignment_7.core.model.TaxiEventData;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(TaxiEventData eventData);
}
