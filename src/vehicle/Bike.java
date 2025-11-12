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
}
