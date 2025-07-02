package com.autobots.java.bankApp2;

import com.autobots.java.mobileBanking.try2.Currency;

import java.util.Map;

public class ExchangeRateApp {

    public static double convert(double amount, Currency from, Currency to) {
        if(from == to) return amount;

        Map<Currency, Double> toUSD = Map.of(
                Currency.USD, 1.0,
                Currency.EUR, 1.1,
                Currency.KGS, 0.11
        );

        double usd = amount * toUSD.get(from);

        return usd / toUSD.get(to);
    }

}
