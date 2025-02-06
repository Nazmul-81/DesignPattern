package com.csbd.creational.factory;

public class SMSNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("Send SMS: " + message);
    }
}
