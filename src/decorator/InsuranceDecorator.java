package decorator;

import vehicle.Vehicle;

public class InsuranceDecorator extends VehicleDecorator {
    public InsuranceDecorator(Vehicle v) { super(v); }

    @Override
    public String getDescription() {
        return decoratedVehicle.getDescription() + " + Insurance";
    }
}
