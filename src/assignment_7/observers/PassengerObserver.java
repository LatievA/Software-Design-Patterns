package assignment_7.observers;

import assignment_7.core.model.TaxiEventData;
import assignment_7.core.model.TaxiStatus;
import assignment_7.core.observer.Observer;

public class PassengerObserver implements Observer {
    private final String name;

    public PassengerObserver(String name) {
        this.name = name;
    }

    @Override
    public void onTaxiUpdate(TaxiEventData eventData) {
        System.out.println("[Passenger " + name + "] Notification → " + eventData);
        if (eventData.getStatus() == TaxiStatus.ARRIVED) {
            System.out.println(name + " is boarding taxi " + eventData.getTaxiId() + ".");
        }
    }
}
