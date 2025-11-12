package adapter;

public class PaymentAdapter implements PaymentProcessor {
    private final ExternalPaymentAPI externalAPI = new ExternalPaymentAPI();

    @Override
    public void pay(double amount) {
        externalAPI.makePayment(amount);
    }
}
