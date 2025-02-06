package com.csbd.creational.factory;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        switch (type) {
            case "EMAIL":
                return new EmailNotification();
            case "PUSH": {
                return new PushNotification();
            }
            case "SMS":
                return new SMSNotification();
            default:
                return null;
        }
    }
}
