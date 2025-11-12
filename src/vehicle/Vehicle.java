package vehicle;

import vehicle.fuel.FuelType;

public abstract class Vehicle {
    public FuelType fuelType;
    public Vehicle(FuelType fuelType) { this.fuelType = fuelType; }
    public abstract String getDescription();
}
