package adapter;

import adapter.interfaces.PaymentProcessor;

public class PaymentAdapter implements PaymentProcessor {
    private final ExternalPaymentAPI externalAPI;
    private final String processorType = "ExternalAPIAdapter";

    public PaymentAdapter() {
        this.externalAPI = new ExternalPaymentAPI();
    }

    public PaymentAdapter(ExternalPaymentAPI externalAPI) {
        this.externalAPI = externalAPI;
    }

    @Override
    public boolean pay(float amount) {
        try {
            if (!validateAmount(amount)) {
                System.out.println("Payment validation failed for amount: $" + String.format("%.2f", amount));
                return false;
            }

            String status = externalAPI.getPaymentStatus(amount);
            if (!"APPROVED".equals(status)) {
                System.out.println("Payment rejected by external API: " + status);
                return false;
            }

            externalAPI.makePayment(amount);
            System.out.println("✓ Payment successful via " + getProcessorType());
            return true;

        } catch (Exception e) {
            System.out.println("✗ Payment failed: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean validateAmount(float amount) {
        if (amount < 0) {
            return false;
        }
        if (amount > 5000) {
            return false;
        }

        return externalAPI.validatePayment(amount);
    }

    @Override
    public String getProcessorType() {
        return processorType;
    }
}
