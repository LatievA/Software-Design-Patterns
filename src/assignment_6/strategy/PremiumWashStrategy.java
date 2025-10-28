package assignment_6.strategy;

public class PremiumWashStrategy implements ICarWashStrategy{
    @Override
    public String washCar() {
        return "Wash car, with soap and also clear car from inside";
    }
}
