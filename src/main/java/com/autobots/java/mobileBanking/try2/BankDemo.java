package com.autobots.java.mobileBanking.try2;

public class BankDemo {
    public static void main(String[] args) {

        Client aliia = new Client("alymbekova","2525");
        System.out.println(aliia.getUuid());
        Client ilizar = new Client("alymbekov", "3131");

        DepositAccount debitAliia = new DepositAccount(1000, Currency.KGS, aliia);
        CreditAccount creditAliia = new CreditAccount(2000, Currency.KGS, aliia);
        BankService.transfer(debitAliia,creditAliia,100);
        System.out.println(debitAliia.balance);
        System.out.println(creditAliia.balance);

//        System.out.println(CreditAccount.transactionsInfo);
//        System.out.println(DepositAccount.transactionsInfo);
    }
}
