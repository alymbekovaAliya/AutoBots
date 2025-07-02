package com.autobots.java.mobileBanking.try2;

public class DepositAccount extends BankAccount{

    public DepositAccount(double balance, Currency currency, Client owner) {
        super(balance, currency, owner);
    }

    @Override
    void deposit(double amount) {
       if(amount <= 0) {
           throw  new IllegalArgumentException("Incorrect amount");
       }
       balance += amount;
    }

    @Override
    boolean withdraw(double amount) {
       if(balance < amount) {
           throw  new IllegalArgumentException("amount must be smaller then balance");
       }
       balance -= amount;
       return true;
    }
}
