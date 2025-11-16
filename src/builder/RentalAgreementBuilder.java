package builder;

import strategy.PricingContext;
import strategy.interfaces.PricingStrategy;

public class RentalAgreementBuilder {
    private PricingContext pricingContext;
    private String customerName;
    private PricingStrategy pricingStrategy;

    public RentalAgreementBuilder withPricingContext(PricingContext pricingContext) {
        this.pricingContext = pricingContext;
        return this;
    }

    public RentalAgreementBuilder forCustomer(String name) {
        this.customerName = name;
        return this;
    }

    public RentalAgreementBuilder withPricing(PricingStrategy strategy) {
        this.pricingStrategy = strategy;
        return this;
    }

    public RentalAgreement build() {
        return new RentalAgreement(pricingContext, customerName, pricingStrategy);
    }
}
