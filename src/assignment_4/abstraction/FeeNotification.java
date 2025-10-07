package assignment_4.abstraction;

import assignment_4.implementor.NotificationSender;

public class FeeNotification extends Notification {
    private final String subject = "Fee Payment Reminder";
    private final String message = "Please pay your semester fee by October 15th.";

    public FeeNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String recipient) {
        sender.sendNotification(subject, message, recipient);
    }
}
