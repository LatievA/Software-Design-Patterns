package vehicle;

import vehicle.fuel.FuelType;

public class Bike extends Vehicle {
    public Bike() { super(null); }

    public Bike(FuelType fuelType) {
        super(fuelType);
    }

    @Override
    public String getDescription() {
        return "Bike running on " + (fuelType != null ? fuelType.getFuelType() : "unknown fuel");
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
