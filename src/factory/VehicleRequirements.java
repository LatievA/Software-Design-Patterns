package factory;

import vehicle.fuel.FuelType;


public class VehicleRequirements {
    private final VehicleType type;
    private final FuelType fuelType;
    private final int capacity;

    public VehicleRequirements(VehicleType type, FuelType fuelType) {
        this(type, fuelType, 0);
    }

    public VehicleRequirements(VehicleType type, FuelType fuelType, int capacity) {
        this.type = type;
        this.fuelType = fuelType;
        this.capacity = capacity;
    }

    public VehicleType getType() {
        return type;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getCapacity() {
        return capacity;
    }
}
