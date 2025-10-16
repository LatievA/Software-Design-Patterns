package assignment_5.facade;

public class PaymentSystem {
    public void processPayment(String customer, double amount) {
        System.out.printf("Processing payment of $%.2f for customer %s%n", amount, customer);
    }
}
