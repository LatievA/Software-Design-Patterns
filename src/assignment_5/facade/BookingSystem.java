package assignment_5.facade;

import java.util.UUID;

public class BookingSystem {
    public String createBooking(String vehicleType) {
        String bookingId = UUID.randomUUID().toString();
        System.out.printf("Booking created for %s. Booking ID: %s%n", vehicleType, bookingId);
        return bookingId;
    }

    public void closeBooking(String bookingId) {
        System.out.printf("Booking %s closed.%n", bookingId);
    }
}
