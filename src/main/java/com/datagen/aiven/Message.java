package com.datagen.aiven;

import java.time.LocalDateTime;

public class Message {
    private String symbol;
    private Double price;
    private LocalDateTime lastUpdate;

    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public Message(String symbol, Double price, LocalDateTime lastUpdate) {
        this.symbol = symbol;
        this.price = price;
        this.lastUpdate = lastUpdate;
    }
    @Override
    public String toString() {
        return "Message [lastUpdate=" + lastUpdate + ", name=" + symbol + ", price=" + price + "]";
    }
    
    
}
