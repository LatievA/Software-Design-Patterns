package app;

import facade.RentalFacade;
import observer.*;

public class Main {
    static void main() {
        RentalFacade rentalFacade = new RentalFacade();
        rentalFacade.registerObserver(new Customer("Alice"));
        rentalFacade.registerObserver(new Admin());

        rentalFacade.rentVehicle();
    }
}
