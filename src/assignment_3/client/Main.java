package assignment_3.client;

import assignment_3.library.LibraryService;
import assignment_3.library.LibrarySystemAdapter;

import assignment_3.payment.PaymentService;
import assignment_3.payment.BankPaymentGateway;
import assignment_3.payment.BankPaymentAdapter;

public class Main {
    static void main() {
        LibraryService libraryService = new LibrarySystemAdapter();
        libraryService.borrowBook("STUDENT123", "ISBN-456");

        BankPaymentGateway bankPaymentGateway = new BankPaymentGateway();
        PaymentService paymentService = new BankPaymentAdapter(bankPaymentGateway);
        paymentService.processPayment("STUDENT123", 1200.50);
    }
}
