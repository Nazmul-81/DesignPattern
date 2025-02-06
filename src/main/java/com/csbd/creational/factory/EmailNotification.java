package com.csbd.creational.factory;

public class EmailNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("Send Email: " + message);
    }
}
