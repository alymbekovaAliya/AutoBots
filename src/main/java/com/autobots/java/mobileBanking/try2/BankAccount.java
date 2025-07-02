package com.autobots.java.mobileBanking.try2;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class BankAccount {

    public UUID uuid;
    public double balance;
    public Currency currency;
    public Client owner;
    final static Map<String, Double> transactionsInfo = new HashMap<>();

    public BankAccount(double balance, Currency currency, Client owner) {
        this.uuid = UUID.randomUUID();
        this.balance = balance;
        this.currency = currency;
        this.owner = owner;
    }

    abstract void deposit(double amount);
    abstract boolean withdraw(double amount);

     void addTransaction(String type, double amount) {
     transactionsInfo.put(type,amount);
    }

    public UUID getUuid() {
        return uuid;
    }

    public double getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Client getOwner() {
        return owner;
    }
}
