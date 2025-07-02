package com.autobots.java.mobileBanking;

import java.util.UUID;

public abstract class BankAccount {

    protected UUID accountNumber;
    protected double balance;
    Currency1 currency1;
    Client client;
    Transaction transaction;

    public BankAccount(Currency1 currency1, Client client, Transaction transaction) {

        this.currency1 = currency1;
        this.client = client;
        this.transaction = transaction;
    }

    abstract void deposit(double amount);
    abstract boolean withdraw(double amount);

    void addTransaction(String type, double amount) {

    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(UUID accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Currency1 getCurrency() {
        return currency1;
    }

    public void setCurrency(Currency1 currency1) {
        this.currency1 = currency1;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
