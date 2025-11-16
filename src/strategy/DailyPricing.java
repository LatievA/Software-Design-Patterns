package strategy;

import strategy.interfaces.PricingStrategy;

public class DailyPricing implements PricingStrategy {
    public float calculatePrice(PricingContext ctx) {
        return ctx.getDuration() * 60;
    }
}