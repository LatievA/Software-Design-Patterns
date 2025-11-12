package builder;

import vehicle.Vehicle;
import strategy.PricingStrategy;

public class RentalAgreementBuilder {
    private Vehicle vehicle;
    private String customerName;
    private int duration;
    private PricingStrategy pricingStrategy;

    public RentalAgreementBuilder withVehicle(Vehicle v) {
        this.vehicle = v;
        return this;
    }

    public RentalAgreementBuilder forCustomer(String name) {
        this.customerName = name;
        return this;
    }

    public RentalAgreementBuilder forDuration(int d) {
        this.duration = d;
        return this;
    }

    public RentalAgreementBuilder withPricing(PricingStrategy strategy) {
        this.pricingStrategy = strategy;
        return this;
    }

    public RentalAgreement build() {
        return new RentalAgreement(vehicle, customerName, duration, pricingStrategy);
    }
}
