package com.autobots.java.bankApp2;
import com.autobots.java.mobileBanking.try2.Currency;

public class DepositAccountApp extends BankAccountApp{

    public DepositAccountApp(ClientApp owner, Currency currency) {
        super(owner, currency);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        addTransaction("DEPOSIT", amount);
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            addTransaction("WITHDRAW", amount);
            return true;
        }
        return false;
    }
}
