package assignment_5.facade;

import assignment_5.decorator.*;

public class VehicleRentalFacade {
    private final InventorySystem inventorySystem = new InventorySystem();
    private final BookingSystem bookingSystem = new BookingSystem();
    private final PaymentSystem paymentSystem = new PaymentSystem();

    public String rentVehicle(String customer, String type, int days, boolean insurance, boolean childSeat) {
        if (!inventorySystem.isAvailable(type)) {
            System.out.println("Vehicle not available for rent.");
            return null;
        }

        double dailyRate = inventorySystem.getDailyRate(type);
        RentalCost rental = new BaseRentalCost(dailyRate, days);

        if (insurance) rental = new InsuranceDecorator(rental);
        if (childSeat) rental = new ChildSeatDecorator(rental);

        double total = rental.getCost();
        String description = rental.getDescription();

        String bookingId = bookingSystem.createBooking(type);
        paymentSystem.processPayment(customer, total);

        System.out.printf("Rental Summary: %s%nTotal cost: $%.2f%n", description, total);
        System.out.printf("Enjoy your %s!%n%n", type);
        return  bookingId;
    }

    public void returnVehicle(String bookingId) {
        bookingSystem.closeBooking(bookingId);
        System.out.println("Thank you for using Vehicle Rental Service!");
    }
}
