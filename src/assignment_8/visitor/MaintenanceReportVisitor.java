package assignment_8.visitor;

import assignment_8.model.Car;
import assignment_8.model.Truck;

public class MaintenanceReportVisitor implements VehicleVisitor {

    @Override
    public void visit(Car car) {
        System.out.println("Car maintenance: oil check every 3000 km, tire check every 6 months.");
    }

    @Override
    public void visit(Truck truck) {
        System.out.println("Truck maintenance: oil + cargo suspension check every 2000 km.");
    }
}
