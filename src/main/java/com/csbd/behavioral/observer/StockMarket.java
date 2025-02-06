package com.csbd.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyAllObservers(String stockName, double stockPrice) {
        for (Observer observer : observerList) {
            observer.update(stockName, stockPrice);
        }
    }

    public void setStockPrice(String stockName, double stockPrice) {
        System.out.println("Stock Name: " + stockPrice + " price: " + stockPrice);
        notifyAllObservers(stockName, stockPrice);
    }
}
