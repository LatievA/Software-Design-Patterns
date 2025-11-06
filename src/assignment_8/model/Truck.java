package assignment_8.model;

import assignment_8.visitor.VehicleVisitor;

public class Truck implements Vehicle {
    private final double baseRatePerDay;
    private final int rentalDays;
    private final double cargoWeight;

    public Truck(double baseRatePerDay, int rentalDays, double cargoWeight) {
        this.baseRatePerDay = baseRatePerDay;
        this.rentalDays = rentalDays;
        this.cargoWeight = cargoWeight;
    }

    public double getBaseRatePerDay() {
        return baseRatePerDay;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }
}
