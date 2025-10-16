package assignment_5.decorator;

public class ChildSeatDecorator extends BaseDecorator {
    private static final double CHILD_SEAT_COST = 10.0;

    public ChildSeatDecorator(RentalCost rentalCost) {
        super(rentalCost);
    }

    @Override
    public double getCost() {
        return super.getCost() + CHILD_SEAT_COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Child Seat";
    }
}