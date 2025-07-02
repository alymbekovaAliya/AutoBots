package com.autobots.java.bankApp2;
import com.autobots.java.mobileBanking.try2.Currency;

public class CreditAccountApp extends BankAccountApp{

    private final double creditLimit = 1000;

    public CreditAccountApp(ClientApp owner, Currency currency) {
        super(owner, currency);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        addTransaction("DEPOSIT", amount);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= balance + creditLimit) {
            balance -= amount;
            addTransaction("WITHDRAW", amount);
            return true;
        }
        return false;
    }
}

