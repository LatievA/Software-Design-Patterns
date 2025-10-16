package assignment_5.decorator;

public class BaseRentalCost implements RentalCost {
    private final double dailyRate;
    private final int days;

    public BaseRentalCost(double dailyRate, int days) {
        this.dailyRate = dailyRate;
        this.days = days;
    }

    @Override
    public double getCost() {
        return dailyRate * days;
    }

    @Override
    public String getDescription() {
        return String.format("Base rental for %d days", days);
    }
}
