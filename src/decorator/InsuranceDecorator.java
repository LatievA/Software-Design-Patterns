package decorator;

import vehicle.Vehicle;

public class InsuranceDecorator extends VehicleDecorator {
    public InsuranceDecorator(Vehicle v) { super(v); }

    @Override
    public String getDescription() {
        return decoratedVehicle.getDescription() + " + Insurance";
    }

    @Override
    public boolean hasGPS() {
        return false;
    }

    @Override
    public boolean hasInsurance() {
        return true;
    }

    @Override
    public boolean hasChildSeat() {
        return false;
    }


}
