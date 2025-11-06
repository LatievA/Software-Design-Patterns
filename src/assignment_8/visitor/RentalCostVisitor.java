package assignment_8.visitor;

import assignment_8.model.Car;
import assignment_8.model.Truck;

public class RentalCostVisitor implements VehicleVisitor {

    @Override
    public void visit(Car car) {
        double cost = car.getBaseRatePerDay() * car.getRentalDays();
        System.out.println("Car rental cost: $" + cost);
    }

    @Override
    public void visit(Truck truck) {
        double cost = truck.getBaseRatePerDay() * truck.getRentalDays()
                + truck.getCargoWeight() * 10;
        System.out.println("Truck rental cost (with cargo): $" + cost);
    }
}
