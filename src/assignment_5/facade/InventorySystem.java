package assignment_5.facade;

import java.util.HashMap;
import java.util.Map;

public class InventorySystem {
    private final Map<String, Double> vehicleRates = new HashMap<>();

    public InventorySystem() {
        vehicleRates.put("car", 50.0);
        vehicleRates.put("bike", 20.0);
        vehicleRates.put("van", 80.0);
    }

    public boolean isAvailable(String type) {
        return vehicleRates.containsKey(type);
    }

    public double getDailyRate(String type) {
        return vehicleRates.getOrDefault(type, 0.0);
    }
}
