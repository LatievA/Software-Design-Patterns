package strategy;

public class HourlyPricing implements PricingStrategy {
    public float calculatePrice(PricingContext ctx) {
        return ctx.getDuration() * 10;
    }
}
