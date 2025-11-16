package decorator;

import vehicle.Vehicle;

public class ChildSeatDecorator extends VehicleDecorator {

    public ChildSeatDecorator(Vehicle v) {
        super(v);
    }

    @Override
    public String getDescription() {
        return decoratedVehicle.getDescription() + " + Child Seat";
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
        return true;
    }
}
