package com.autobots.java.bankApplication;

import java.util.HashSet;
import java.util.Set;

public class MBank extends BankBase{

    private double balance = 200;
    public static final Set<BankBase> mBankRecords = new HashSet<>();

    public MBank(String bankName, long accountNumber, long routingNumber) throws Exception {
        super(bankName, accountNumber, routingNumber);
        mBankRecords.add(checkDuplicates(this,mBankRecords));
        addAllBanks(this);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if(amount < 0 || amount > 200000) {
            throw new IllegalArgumentException("Invalid amount can not be deposit");
        }
        balance += amount;
    }

    @Override
    public void withDraw(double amount) {
        if(amount < 0 || amount > 150000) {
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
