package assignment_4.abstraction;

import assignment_4.implementor.NotificationSender;

public abstract class Notification {
    protected NotificationSender sender;

    protected Notification(NotificationSender sender) {
        this.sender = sender;
    }

    public abstract void notifyUser(String recipient);
}
