package decorator;

import vehicle.Vehicle;

public class GPSDecorator extends VehicleDecorator {
    public GPSDecorator(Vehicle v) { super(v); }

    @Override
    public String getDescription() {
        return decoratedVehicle.getDescription() + " + GPS";
    }

    @Override
    public boolean hasGPS() {
        return true;
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
