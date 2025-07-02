package com.autobots.java.mobileBanking;

import java.time.LocalDateTime;

public class Transaction {
    private OperationType operationType;
    private double operationSum;
    private LocalDateTime timestamp;

    public Transaction(OperationType operationType, double operationSum) {
        this.operationType = operationType;
        this.operationSum = operationSum;
        this.timestamp = LocalDateTime.now();
    }
}
