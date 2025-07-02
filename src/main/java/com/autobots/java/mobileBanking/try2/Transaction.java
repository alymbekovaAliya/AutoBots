package com.autobots.java.mobileBanking.try2;

import java.time.LocalDateTime;

public class Transaction {

   private String typeOfOperation;
   private double amount;
   private LocalDateTime timestamp;

    public Transaction(String typeOfOperation, double amount) {
        this.typeOfOperation = typeOfOperation;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    public String getTypeOfOperation() {
        return typeOfOperation;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
