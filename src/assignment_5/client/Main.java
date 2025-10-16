package assignment_5.client;

import assignment_5.facade.VehicleRentalFacade;

public class Main {
    public static void main(String[] args) {
        VehicleRentalFacade rentalService = new VehicleRentalFacade();

        rentalService.rentVehicle("Alice", "car", 3, true, false);
        rentalService.rentVehicle("Bob", "bike", 1, false, false);
        rentalService.rentVehicle("Charlie", "van", 5, false, true);
    }
}