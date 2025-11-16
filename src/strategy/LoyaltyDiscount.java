package strategy;

public class LoyaltyDiscount implements PricingStrategy {

    private final PricingStrategy base;

    public LoyaltyDiscount(PricingStrategy base) {
        this.base = base;
    }

    @Override
    public float calculatePrice(PricingContext ctx) {
        float price = base.calculatePrice(ctx);
        return ctx.isLoyalCustomer() ? (float) (price * 0.90) : price; // -10%
    }
}
