package com.csbd.behavioral.observer;

public class Investor implements Observer {
    private String investorName;

    public Investor(String investorName) {
        this.investorName = investorName;
    }


    @Override
    public void update(String stockName, double price) {
        System.out.println("Investor: " + investorName + " received notification. Stock Name: " + stockName + " price: " + price);
    }
}
