package com.autobots.java.bankApp2;

import com.autobots.java.mobileBanking.ExchangeRate;
import com.autobots.java.mobileBanking.Transaction;

public class BankServiceApp {

    public static boolean transfer(BankAccountApp from,BankAccountApp to, double amount) {
        if(from.withdraw(amount)) {
            double convertedSum = ExchangeRateApp.convert(amount, from.getCurrency(), to.getCurrency());
            to.deposit(convertedSum);
            from.addTransaction("TRANSFER OUT", amount);
            to.addTransaction("TRANSFER IN", convertedSum);
            return true;
        }
        return false;
    }
}
