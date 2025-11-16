package factory;

import vehicle.*;
import vehicle.fuel.*;

public class VehicleFactory {

    public static Vehicle createVehicle(VehicleType type) {
        return switch (type) {
            case CAR -> new Car();
            case BIKE -> new Bike();
            case TRUCK -> new Truck();
        };
    }

    public static Vehicle createVehicle(VehicleType type, FuelType fuelType) {
        return switch (type) {
            case CAR -> new Car(fuelType);
            case BIKE -> new Bike(fuelType);
            case TRUCK -> new Truck(fuelType);
        };
    }

    public static Vehicle createTruck(FuelType fuelType, int capacityKg) {
        return new Truck(fuelType, capacityKg);
    }

    public static Vehicle createVehicleForRequirements(VehicleRequirements requirements) {
        Vehicle vehicle = switch (requirements.getType()) {
            case CAR -> new Car(requirements.getFuelType());
            case BIKE -> new Bike(requirements.getFuelType());
            case TRUCK ->
                requirements.getCapacity() > 0 ? new Truck(requirements.getFuelType(), requirements.getCapacity())
                        : new Truck(requirements.getFuelType());
        };
        return vehicle;
    }

    public static FuelType getDefaultFuelType(VehicleType type) {
        return switch (type) {
            case CAR -> new Petrol();
            case BIKE -> new Petrol();
            case TRUCK -> new Petrol();
        };
    }

    public static Vehicle createVehicleWithDefaultFuel(VehicleType type) {
        FuelType defaultFuel = getDefaultFuelType(type);
        return createVehicle(type, defaultFuel);
    }
}
