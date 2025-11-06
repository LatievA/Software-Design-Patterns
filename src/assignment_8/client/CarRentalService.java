package assignment_8.client;

import assignment_8.model.*;
import assignment_8.visitor.*;

import java.util.List;

public class CarRentalService {

    static void main() {
        List<Vehicle> vehicles = List.of(
                new Car(50, 5),
                new Truck(100, 3, 400)
        );

        VehicleVisitor costVisitor = new RentalCostVisitor();
        VehicleVisitor insuranceVisitor = new InsuranceVisitor();
        VehicleVisitor maintenanceVisitor = new MaintenanceReportVisitor();

        System.out.println("=== Rental Cost Calculation ===");
        vehicles.forEach(v -> v.accept(costVisitor));

        System.out.println("\n=== Insurance Calculation ===");
        vehicles.forEach(v -> v.accept(insuranceVisitor));

        System.out.println("\n=== Maintenance Reports ===");
        vehicles.forEach(v -> v.accept(maintenanceVisitor));
    }
}
