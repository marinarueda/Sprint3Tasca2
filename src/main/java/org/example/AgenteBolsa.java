package org.example;

import java.util.ArrayList;
import java.util.List;

class AgenteBolsa {
    private String agente;
    private List<Observer> observers = new ArrayList<>();
    private int stockPrice;
    private AgenciaDeBorsa agencyName;

    public AgenteBolsa(String agente) {
        this.agente = agente;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(AgenciaDeBorsa agencyName) {
        observers.remove(agencyName);
    }

    public void setStockPrice(int price) {
        if (price > stockPrice) {
            stockPrice = price;
            notifyPriceIncreased();
        } else if (price < stockPrice) {
            stockPrice = price;
            notifyPriceDecreased();
        }
    }

    private void notifyPriceIncreased() {
        for (Observer observer : observers) {
            observer.stockPriceIncreased(stockPrice);
        }
    }

    private void notifyPriceDecreased() {
        for (Observer observer : observers) {
            observer.stockPriceDecreased(stockPrice);
        }
    }

}
