package strategy;

public class DailyPricing implements PricingStrategy {
    public float calculatePrice(PricingContext ctx) {
        return ctx.getDuration() * 60;
    }
}