package assignment_6.client;

import assignment_6.context.CarWashService;
import assignment_6.strategy.BasicWashStrategy;
import assignment_6.strategy.DeluxeWashStrategy;
import assignment_6.strategy.PremiumWashStrategy;

class Main {
    static void main() {
        CarWashService service = new CarWashService();

        service.setStrategy(new BasicWashStrategy());
        service.washCar();

        service.setStrategy(new DeluxeWashStrategy());
        service.washCar();

        service.setStrategy(new PremiumWashStrategy());
        service.washCar();
    }
}
