package assignment_4.client;

import assignment_4.abstraction.*;
import assignment_4.implementor.*;

class Main {
    static void main(String[] args) {
        // Different combinations of notifications and channels
        Notification examEmail = new ExamNotification(new EmailSender());
        Notification examSMS = new ExamNotification(new SMSSender());
        Notification feePush = new FeeNotification(new PushSender());

        // Send notifications
        examEmail.notifyUser("student1@university.edu");
        examSMS.notifyUser("+1234567890");
        feePush.notifyUser("student2@university.edu");
    }
}
