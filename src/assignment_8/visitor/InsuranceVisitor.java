package assignment_8.visitor;

import assignment_8.model.Car;
import assignment_8.model.Truck;

public class InsuranceVisitor implements VehicleVisitor {

    @Override
    public void visit(Car car) {
        double insurance = car.getBaseRatePerDay() * 0.1 * car.getRentalDays();
        System.out.println("Car insurance: $" + insurance);
    }

    @Override
    public void visit(Truck truck) {
        double insurance = (truck.getBaseRatePerDay() * 0.2 + truck.getCargoWeight() * 2)
                * truck.getRentalDays();
        System.out.println("Truck insurance: $" + insurance);
    }
}
