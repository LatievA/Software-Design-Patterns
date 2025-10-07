package assignment_4.implementor;

public class EmailSender implements NotificationSender {
    @Override
    public void sendNotification(String subject, String message, String recipient) {
        System.out.println("[Email] To: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
        System.out.println();
    }
}