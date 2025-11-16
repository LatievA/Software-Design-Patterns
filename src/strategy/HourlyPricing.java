package strategy;

public class HourlyPricing implements PricingStrategy {
    public float calculatePrice(int duration) { return duration * 10; }
}
