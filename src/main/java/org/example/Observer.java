package org.example;

interface Observer {
    void stockPriceIncreased(int newPrice);
    void stockPriceDecreased(int newPrice);

}