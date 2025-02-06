package com.csbd.creational.factory;

import org.junit.Test;

public class NotificationFactoryTest {
    @Test
    public void test(){
        Notification emailNotification = NotificationFactory.createNotification("EMAIL");
        emailNotification.sendMessage("Hello! this is an Email.");

        Notification pushNotification = NotificationFactory.createNotification("PUSH");
        pushNotification.sendMessage("Hello! this is a Push Notification.");

        Notification smsNotification = NotificationFactory.createNotification("SMS");
        smsNotification.sendMessage("Hello! this is a SMS.");
    }
}