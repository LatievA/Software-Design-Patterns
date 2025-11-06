package assignment_8.model;

import assignment_8.visitor.VehicleVisitor;

public class Car implements Vehicle {
    private final double baseRatePerDay;
    private final int rentalDays;

    public Car(double baseRatePerDay, int rentalDays) {
        this.baseRatePerDay = baseRatePerDay;
        this.rentalDays = rentalDays;
    }

    public double getBaseRatePerDay() {
        return baseRatePerDay;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    @Override
    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }
}
