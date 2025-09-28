package assignment_3.payment;

public class BankPaymentAdapter implements PaymentService {
    private final BankPaymentGateway bankPaymentGateway;

    public BankPaymentAdapter(BankPaymentGateway bankPaymentGateway) {
        this.bankPaymentGateway = bankPaymentGateway;
    }

    @Override
    public void processPayment(String studentIdentifier, double amount) {
        // Adapt call: map student ID to account number
        String accountNumber = "ACC-" + studentIdentifier;
        bankPaymentGateway.transferFunds(accountNumber, amount);
    }
}
