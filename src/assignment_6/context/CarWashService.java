package assignment_6.context;

import assignment_6.strategy.ICarWashStrategy;

public class CarWashService {
    private ICarWashStrategy carWashStrategy;

    public void setStrategy(ICarWashStrategy carWashStrategy) {
        this.carWashStrategy = carWashStrategy;
    }

    public void washCar() {
        if (carWashStrategy == null) {
            throw new IllegalStateException("No wash strategy selected!");
        }
        System.out.println(carWashStrategy.washCar());
    }
}
