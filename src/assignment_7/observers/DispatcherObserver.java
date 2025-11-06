package assignment_7.observers;

import assignment_7.core.model.TaxiEventData;
import assignment_7.core.observer.Observer;

public class DispatcherObserver implements Observer {
    private final String dispatcherName;

    public DispatcherObserver(String dispatcherName) {
        this.dispatcherName = dispatcherName;
    }

    @Override
    public void onTaxiUpdate(TaxiEventData eventData) {
        System.out.println("[Dispatcher " + dispatcherName + "] received update: " + eventData);
    }
}
