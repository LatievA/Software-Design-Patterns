package vehicle;


import vehicle.fuel.FuelType;

public class Truck extends Vehicle {
    private final int capacityKg; // optional extra info

    public Truck() {
        super(null);
        this.capacityKg = 0;
    }

    public Truck(FuelType fuelType) {
        super(fuelType);
        this.capacityKg = 0;
    }

    public Truck(FuelType fuelType, int capacityKg) {
        super(fuelType);
        this.capacityKg = capacityKg;
    }

    @Override
    public String getDescription() {
        String base = "Truck running on " + (fuelType != null ? fuelType.getFuelType() : "unknown fuel");
        return capacityKg > 0 ? base + " (capacity " + capacityKg + "kg)" : base;
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
