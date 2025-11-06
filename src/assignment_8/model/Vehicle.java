package assignment_8.model;

import assignment_8.visitor.VehicleVisitor;

public interface Vehicle {
    void accept(VehicleVisitor visitor);
}
