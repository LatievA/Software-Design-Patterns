package strategy.interfaces;

import strategy.PricingContext;

public interface PricingStrategy {
    float calculatePrice(PricingContext context);
}
