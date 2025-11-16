package facade;

import factory.*;
import vehicle.*;
import vehicle.fuel.*;
import builder.*;
import strategy.*;
import decorator.*;
import adapter.*;
import observer.*;

public class RentalFacade {
    private final PaymentProcessor paymentProcessor = new PaymentAdapter();
    private final RentalNotifier notifier = new RentalNotifier();

    public void registerObserver(Observer o) {
        notifier.attach(o);
    }

    public void unregisterObserver(Observer o) {
        notifier.detach(o);
    }

    public void rentVehicle() {
        Vehicle vehicle = VehicleFactory.createVehicle(VehicleType.CAR);
        vehicle = new GPSDecorator(vehicle);
        vehicle = new InsuranceDecorator(vehicle);
        vehicle = new ChildSeatDecorator(vehicle);
        PricingContext pricingContext = new PricingContext(vehicle,30,true);

        RentalAgreement agreementWithLoyalCustomer = new RentalAgreementBuilder()
                .withPricingContext(pricingContext)
                .forCustomer(Customer.name)
                .withPricing(new DailyPricing())
                .build();

        System.out.println(agreementWithLoyalCustomer);
        paymentProcessor.pay(agreementWithLoyalCustomer.calculatePrice());
        notifier.notifyObservers("Vehicle rented: " + vehicle.getDescription());
    }
}
