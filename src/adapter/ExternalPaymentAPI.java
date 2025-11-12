package adapter;

public class ExternalPaymentAPI {
    public void makePayment(double amount) {
        System.out.println("Processed payment of $" + amount + " via external API");
    }
}