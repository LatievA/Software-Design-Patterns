package assignment_4.implementor;

public class PushSender implements NotificationSender {
    @Override
    public void sendNotification(String subject, String message, String recipient) {
        System.out.println("[Push Notification] User: " + recipient);
        System.out.println("Title: " + subject);
        System.out.println("Body: " + message);
        System.out.println();
    }
}
