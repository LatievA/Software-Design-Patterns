package assignment_8.visitor;

import assignment_8.model.Car;
import assignment_8.model.Truck;

public interface VehicleVisitor {
    void visit(Car car);
    void visit(Truck truck);
}
