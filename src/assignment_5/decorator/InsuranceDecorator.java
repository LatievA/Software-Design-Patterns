package assignment_5.decorator;

public class InsuranceDecorator extends BaseDecorator {
    private static final double INSURANCE_COST = 25.0;

    public InsuranceDecorator(RentalCost rentalCost) {
        super(rentalCost);
    }

    @Override
    public double getCost() {
        return super.getCost() + INSURANCE_COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Insurance";
    }
}
