package vehicle;

import vehicle.fuel.FuelType;

public abstract class Vehicle {
    public FuelType fuelType;
    public Vehicle(FuelType fuelType) { this.fuelType = fuelType; }
    public abstract String getDescription();
    public abstract boolean hasGPS();
    public abstract boolean hasInsurance();
    public abstract boolean hasChildSeat();
}
