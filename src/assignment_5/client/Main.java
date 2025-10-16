package assignment_5.client;

import assignment_5.facade.VehicleRentalFacade;

public class Main {
    static void main(String[] args) {
        VehicleRentalFacade rentalService = new VehicleRentalFacade();

        String aliceBooking = rentalService.rentVehicle("Alice", "car", 3, true, false);
        String bobBooking = rentalService.rentVehicle("Bob", "bike", 1, false, false);
        String charlieBooking = rentalService.rentVehicle("Charlie", "van", 5, false, true);

        rentalService.returnVehicle(aliceBooking);
        rentalService.returnVehicle(bobBooking);
        rentalService.returnVehicle(charlieBooking);
    }
}