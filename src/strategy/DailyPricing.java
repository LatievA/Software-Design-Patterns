package strategy;

public class DailyPricing implements PricingStrategy {
    public float calculatePrice(int duration) { return duration * 60; }
}