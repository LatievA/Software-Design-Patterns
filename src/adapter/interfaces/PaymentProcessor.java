package adapter.interfaces;

public interface PaymentProcessor {
    boolean pay(float amount);
    boolean validateAmount(float amount);
    String getProcessorType();
}
