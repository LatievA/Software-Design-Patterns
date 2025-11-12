package decorator;

import vehicle.Vehicle;

public abstract class VehicleDecorator extends Vehicle {
    protected Vehicle decoratedVehicle;

    public VehicleDecorator(Vehicle vehicle) {
        super(vehicle.fuelType);
        this.decoratedVehicle = vehicle;
    }
}
