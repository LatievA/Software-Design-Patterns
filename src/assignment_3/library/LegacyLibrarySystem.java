package assignment_3.library;

public class LegacyLibrarySystem {
    public void checkoutBook(String isbn, String userIdentifier) {
        System.out.println("[Legacy SOAP] Borrowing book " + isbn + " for user " + userIdentifier);
    }
}
