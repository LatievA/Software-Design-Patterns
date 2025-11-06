package assignment_7.core.service;

import assignment_7.core.model.TaxiEventData;
import assignment_7.core.observer.Observer;
import assignment_7.core.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class TaxiService implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(TaxiEventData eventData) {
        for (Observer observer : observers) {
            observer.onTaxiUpdate(eventData);
        }
    }

    public void updateTaxiStatus(TaxiEventData eventData) {
        System.out.println("TaxiService: Updating taxi " + eventData.getTaxiId() + " → " + eventData.getStatus());
        notifyObservers(eventData);
    }
}
