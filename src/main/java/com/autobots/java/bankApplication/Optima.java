package com.autobots.java.bankApplication;

import java.util.HashSet;
import java.util.Set;

public class Optima extends BankBase{
    private double balance = 0;
    public static final Set<BankBase> optimaBankRecords = new HashSet<>();

    public Optima(String bankName, long accountNumber, long routingNumber) throws Exception {
        super(bankName, accountNumber, routingNumber);
        optimaBankRecords.add(checkDuplicates(this,optimaBankRecords));
        addAllBanks(this);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if(amount < 0 || amount >= 300000) {
            throw new IllegalArgumentException("Invalid amount can not be deposit");
        }
        balance += amount;
    }

    @Override
    public void withDraw(double amount) {
        if(amount < 0 || amount >= 250000) {
            throw  new IllegalArgumentException("Invalid amount can not be withDraw");
        } else {
            if(amount > balance) {
                throw new IllegalArgumentException("Insufficient funds");
            } else {
                balance -= amount;
            }
        }
    }
}
