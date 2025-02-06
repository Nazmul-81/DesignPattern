package com.csbd.behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");

        stockMarket.addObserver(investor1);
        stockMarket.addObserver(investor2);

        stockMarket.setStockPrice("Apple", 890.0);
        stockMarket.setStockPrice("Tesla", 1000.0);

        stockMarket.removeObserver(investor1);

        stockMarket.setStockPrice("Tesla", 900.0);
    }
}
