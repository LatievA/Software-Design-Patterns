package assignment_7.client;

import assignment_7.core.model.TaxiEventData;
import assignment_7.core.model.TaxiStatus;
import assignment_7.core.service.TaxiService;
import assignment_7.observers.DispatcherObserver;
import assignment_7.observers.PassengerObserver;

class Main {
    static void main() {
        TaxiService service = new TaxiService();

        PassengerObserver alice = new PassengerObserver("Alice");
        PassengerObserver bob = new PassengerObserver("Bob");
        DispatcherObserver central = new DispatcherObserver("Central Dispatch");

        service.addObserver(alice);
        service.addObserver(bob);
        service.addObserver(central);

        service.updateTaxiStatus(new TaxiEventData("TX-500", TaxiStatus.AVAILABLE, "Downtown"));
        service.updateTaxiStatus(new TaxiEventData("TX-500", TaxiStatus.ASSIGNED, "Airport Road"));
        service.updateTaxiStatus(new TaxiEventData("TX-500", TaxiStatus.ARRIVED, "Hotel Plaza"));

        service.removeObserver(bob);
        service.updateTaxiStatus(new TaxiEventData("TX-500", TaxiStatus.COMPLETED, "Destination"));
    }
}
