package factory;

import vehicle.*;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType type) {
        return switch (type) {
            case CAR -> new Car();
            case BIKE -> new Bike();
            case TRUCK -> new Truck();
        };
    }
}
