package com.csbd.creational.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Notification emailNotification = NotificationFactory.createNotification("EMAIL");
        emailNotification.sendMessage("Hello! this is an Email.");

        Notification pushNotification = NotificationFactory.createNotification("PUSH");
        pushNotification.sendMessage("Hello! this is a Push Notification.");

        Notification smsNotification = NotificationFactory.createNotification("SMS");
        smsNotification.sendMessage("Hello! this is a SMS.");
    }
}
