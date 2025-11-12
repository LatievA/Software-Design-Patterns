package strategy;

public class HourlyPricing implements PricingStrategy {
    public double calculatePrice(int duration) { return duration * 10; }
}
