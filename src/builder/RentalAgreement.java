package builder;

import strategy.PricingContext;
import vehicle.Vehicle;
import strategy.PricingStrategy;

public class RentalAgreement {
    private final String customerName;
    private final PricingStrategy pricingStrategy;
    private final PricingContext pricingContext;

    public RentalAgreement(PricingContext pricingContext, String customerName, PricingStrategy strategy) {
        this.customerName = customerName;
        this.pricingStrategy = strategy;
        this.pricingContext =  pricingContext;
    }


    public float calculatePrice() {
        return pricingStrategy.calculatePrice(pricingContext);
    }

    @Override
    public String toString() {
        return customerName + " rented " + pricingContext.getVehicle().getDescription() +
                " for " + pricingContext.getDuration() + " units. Total: $" + calculatePrice();
    }
}
