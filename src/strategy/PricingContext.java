package strategy;

import vehicle.Vehicle;

public class PricingContext {
    private final Vehicle vehicle;
    private final int duration;
    private final boolean loyalCustomer;

    public PricingContext(Vehicle vehicle, int duration, boolean loyalCustomer) {
        this.vehicle = vehicle;
        this.duration = duration;
        this.loyalCustomer = loyalCustomer;
    }

    public Vehicle getVehicle() { return vehicle; }
    public int getDuration() { return duration; }
    public boolean isLoyalCustomer() { return loyalCustomer; }
}
