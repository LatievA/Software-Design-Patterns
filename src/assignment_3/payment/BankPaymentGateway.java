package assignment_3.payment;

public class BankPaymentGateway {
    public void transferFunds(String accountNumber, double amount) {
        System.out.println("[Bank Gateway] Transferring $" + amount + " from account " + accountNumber);
    }
}
