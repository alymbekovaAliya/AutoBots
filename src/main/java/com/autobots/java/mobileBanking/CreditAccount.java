package com.autobots.java.mobileBanking;

public class CreditAccount extends BankAccount {

    protected double creditLimit = 1000;

    public CreditAccount(Currency1 currency1, Client client, Transaction transaction) {
        super(currency1, client, transaction);
    }

    @Override
    void deposit(double amount) {

    }

    @Override
    boolean withdraw(double amount) {
        return false;
    }
}
