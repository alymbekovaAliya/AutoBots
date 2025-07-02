package com.autobots.java.bankApplication;

import java.util.HashSet;
import java.util.Set;

public class Demir extends BankBase{
    private double balance = 500;
    public static final Set<BankBase> demirBankRecords = new HashSet<>();

    public Demir(String bankName, long accountNumber, long routingNumber) throws Exception {
        super(bankName, accountNumber, routingNumber);
//        addBanks(this); //this — это ссылка на текущий объект, который создаётся в конструкторе.
        demirBankRecords.add(checkDuplicates(this,demirBankRecords));
        addAllBanks(this);

    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if(amount < 0 || amount >= 500000) {
            throw new IllegalArgumentException("Invalid amount can not be deposit");
        }
        balance += amount;
    }

    @Override
    public void withDraw(double amount) {
        if(amount < 0 || amount >= 450000) {
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
