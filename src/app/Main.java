package app;

import facade.RentalFacade;
import observer.*;

public class Main {
    public static void main(String[]args) {
        RentalFacade rentalFacade = new RentalFacade();
        rentalFacade.registerObserver(new Customer("Alex"));
        rentalFacade.registerObserver(new Admin());

        rentalFacade.rentVehicle();
        rentalFacade.unregisterObserver(new Customer(""));
    }
}
