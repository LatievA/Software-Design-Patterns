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


}
