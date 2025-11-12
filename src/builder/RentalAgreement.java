package builder;

import vehicle.Vehicle;
import strategy.PricingStrategy;

public class RentalAgreement {
    private final Vehicle vehicle;
    private final String customerName;
    private final int duration;
    private final PricingStrategy pricingStrategy;

    public RentalAgreement(Vehicle vehicle, String customerName, int duration, PricingStrategy strategy) {
        this.vehicle = vehicle;
        this.customerName = customerName;
        this.duration = duration;
        this.pricingStrategy = strategy;
    }

    public double calculatePrice() {
        return pricingStrategy.calculatePrice(duration);
    }

    @Override
    public String toString() {
        return customerName + " rented " + vehicle.getDescription() +
                " for " + duration + " units. Total: $" + calculatePrice();
    }
}
