package com.autobots.java.bankApp2;

import java.time.LocalDateTime;

public class TransactionApp {
    private final String type;
    private final double amount;
    private final LocalDateTime timestamp = LocalDateTime.now();

    public TransactionApp(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s: %.2f", timestamp, type, amount);
    }
}
