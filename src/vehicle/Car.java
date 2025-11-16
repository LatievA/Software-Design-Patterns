package vehicle;

import vehicle.fuel.FuelType;

public class Car extends Vehicle {
    public Car() { super(null); }
    public Car(FuelType fuelType) { super(fuelType); }

    @Override
    public String getDescription() {
        return "Car running on " + (fuelType != null ? fuelType.getFuelType() : "unknown fuel");
    }

    @Override
    public boolean hasGPS() {
        return false;
    }

    @Override
    public boolean hasInsurance() {
        return false;
    }

    @Override
    public boolean hasChildSeat() {
        return false;
    }
}
