package com.autobots.java.mobileBanking;

public class DepositAccount  extends BankAccount{

    public DepositAccount(Currency1 currency1, Client client, Transaction transaction) {
        super(currency1, client, transaction);
    }

    @Override
    void deposit(double amount) {
       if(amount <= 0) {
            throw  new IllegalArgumentException("Insufficient funds for deposit");
       } else {
           balance += amount;
       }
    }

    @Override
    boolean withdraw(double amount) {
        if(balance <= amount) {
            throw new IllegalArgumentException("Insufficient funds for withdraw");
        }
        return true;
    }

    @Override
    void addTransaction(String type, double amount) {
        super.addTransaction(type, amount);
    }
}
