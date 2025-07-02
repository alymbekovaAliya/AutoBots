package com.autobots.java.mobileBanking.try2;

public class BankService {

    static boolean transfer(BankAccount from, BankAccount to, double amount) {
        if (!from.withdraw(amount)) {
            System.out.println("Insufficient funds.");
            return false;
        }

        double convertedAmount = ExchangeRate.convert(amount,from.getCurrency(), to.getCurrency());

        to.deposit(convertedAmount);
        from.addTransaction("withdraw", amount);
        to.addTransaction("deposit", convertedAmount);

        return true;
    }

}
