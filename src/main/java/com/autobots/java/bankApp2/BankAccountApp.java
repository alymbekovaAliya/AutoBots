package com.autobots.java.bankApp2;

import com.autobots.java.mobileBanking.try2.Currency;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class BankAccountApp {
    protected String accountNumber;
    protected double balance;
    protected final ClientApp owner;
    protected final Currency currency;
    protected final List<TransactionApp> transactions = new ArrayList<>();

    public BankAccountApp(ClientApp owner, Currency currency) {
        this.owner = owner;
        this.currency = currency;
        this.accountNumber = UUID.randomUUID().toString(); //генерирует уникальные значения
    }

    public abstract void deposit(double amount);

    public abstract boolean withdraw(double amount);

     public void addTransaction(String type, double amount) {
         transactions.add(new TransactionApp(type,amount));
     }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public ClientApp getOwner() {
        return owner;
    }

    public Currency getCurrency() {
        return currency;
    }

    public List<TransactionApp> getTransactions() {
        return transactions;
    }
}
