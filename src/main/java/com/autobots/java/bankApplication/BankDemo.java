package com.autobots.java.bankApplication;

public class BankDemo {
    public static void main(String[] args) throws Exception {

        MBank aliiaMBank = new MBank("mbank",123456789111L,444444444);
        MBank abduMBank = new MBank("mbank",123456789112L,444444442);
        MBank ilizarMBank = new MBank("mbank",123456789115L,444444492);


        Optima asss = new Optima("optima", 111111111111L, 111111111);
        Optima asss1 = new Optima("optima", 111111111112L, 111111112);

        Bank.transferFunds(ilizarMBank, asss , 100);
        System.out.println(ilizarMBank.getBalance());
        System.out.println(asss.getBalance());

        Demir zinaidaDemir = new Demir("demir",123456789131L, 666666666);

        System.out.println(BankBase.getCountBanks());


    }
}
