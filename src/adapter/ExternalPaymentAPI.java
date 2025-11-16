package adapter;

public class ExternalPaymentAPI {

    public void makePayment(float amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Payment amount cannot be negative");
        }

        try {
            Thread.sleep(10); // Simulate API call delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Processed payment of $" + String.format("%.2f", amount) + " via external API");
    }

    public boolean validatePayment(float amount) {
        return amount > 0 && amount <= 10000;
    }

    public String getPaymentStatus(float amount) {
        if (amount <= 0)
            return "INVALID";
        if (amount > 10000)
            return "EXCEEDS_LIMIT";
        return "APPROVED";
    }
}