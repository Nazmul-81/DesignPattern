package com.csbd.creational.factory;

public class PushNotification implements Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("Send Push Notification: "+ message);
    }
}
