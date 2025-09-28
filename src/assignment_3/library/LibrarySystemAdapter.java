package assignment_3.library;

public class LibrarySystemAdapter extends LegacyLibrarySystem implements LibraryService {
    @Override
    public void borrowBook(String studentIdentifier, String bookIsbn) {
        checkoutBook(bookIsbn, studentIdentifier);
    }
}
