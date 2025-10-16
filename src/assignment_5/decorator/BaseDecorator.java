package assignment_5.decorator;

public abstract class BaseDecorator implements RentalCost {
    protected final RentalCost rentalCost;

    public BaseDecorator(RentalCost rentalCost) {
        this.rentalCost = rentalCost;
    }

    @Override
    public double getCost() {
        return rentalCost.getCost();
    }

    @Override
    public String getDescription() {
        return rentalCost.getDescription();
    }
}