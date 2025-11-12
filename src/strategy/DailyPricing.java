package strategy;

public class DailyPricing implements PricingStrategy {
    public double calculatePrice(int duration) { return duration * 60; }
}