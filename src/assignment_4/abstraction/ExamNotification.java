package assignment_4.abstraction;

import assignment_4.implementor.NotificationSender;

public class ExamNotification extends Notification {
    private final String subject = "Exam Schedule Update";
    private final String message = "Your next exam is scheduled for October 12th.";

    public ExamNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String recipient) {
        sender.sendNotification(subject, message, recipient);
    }
}
