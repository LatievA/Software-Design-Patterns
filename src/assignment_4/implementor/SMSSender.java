package assignment_4.implementor;

public class SMSSender implements NotificationSender {
    @Override
    public void sendNotification(String subject, String message, String recipient) {
        System.out.println("[SMS] To: " + recipient);
        System.out.println("Message: " + subject + " - " + message);
        System.out.println();
    }
}
