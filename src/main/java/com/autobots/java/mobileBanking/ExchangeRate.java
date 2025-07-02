package com.autobots.java.mobileBanking;

public class ExchangeRate {

    final static double USD = 1.0;
    final static double EUR = 1.1;
    final static double KGS = 0.011;

    static double convert(double amount, Currency1 from, Currency1 to ) {

        double from1 = 0.0;
        double to1 = 0.0;

       if(amount < 0) {
           throw  new IllegalArgumentException("Incorrect amount");
       }

       if(from.equals(Currency1.EUR) && to.equals(Currency1.USD)) {
           from1 = EUR;
           to1 = USD;
       } else if (from.equals(Currency1.USD) && to.equals(Currency1.EUR)) {
           from1 = USD;
           to1 = EUR;
       } else if(from.equals(Currency1.KGS) && to.equals(Currency1.EUR)) {
           from1 = KGS;
           to1 = EUR;
       } else if (from.equals(Currency1.USD) && to.equals(Currency1.KGS)) {
           from1 = USD;
           to1 = KGS;
       } else if (from.equals(Currency1.EUR) && to.equals(Currency1.KGS)) {
           from1 = EUR;
           to1 = KGS;
       } else if (from.equals(Currency1.KGS) && to.equals(Currency1.USD)) {
           from1 = KGS;
           to1 = USD;
       }
        return amount * (from1 / to1);
    }
}
