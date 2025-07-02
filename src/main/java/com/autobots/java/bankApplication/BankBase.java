package com.autobots.java.bankApplication;

import java.util.*;

public abstract class BankBase implements Bank{

    private String bankName;
    private long accountNumber;
    private long routingNumber;

    public static Map<String, Integer> countBanks = new HashMap<>();

    public BankBase(String bankName, long accountNumber, long routingNumber) {

        if(Long.toString(accountNumber).length() != 12) {
            throw new IllegalArgumentException("Account number must be 12 digits");
        } else if (Long.toString(routingNumber).length() != 9) {
            throw new IllegalArgumentException("Routing number must be 9 digits");
        } else {
            this.bankName = bankName;
            this.accountNumber = accountNumber;
            this.routingNumber = routingNumber;
        }

    }

    public static BankBase checkDuplicates(BankBase bank, Set<BankBase> bankBases) throws Exception {
        for(BankBase bankBase: bankBases)  {
            if(bankBase.getAccountNumber() == bank.getAccountNumber() && bankBase.getBankName().equalsIgnoreCase(bank.getBankName())) {
                throw new Exception(bank.getAccountNumber() + ": account number already exist");
            }
            if(bankBase.getRoutingNumber() == bank.getRoutingNumber() && bankBase.getBankName().equalsIgnoreCase(bank.getBankName())) {
                throw new Exception(bank.getRoutingNumber() + ": routing number already exist");
            }
        }
        return bank;
    }


    public static void addAllBanks(BankBase bank) {
        countBanks.put(bank.getBankName(), countBanks.getOrDefault(bank.getBankName(),0) + 1);
    }

    public static Map<String, Integer> getCountBanks() {
        return countBanks;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(long routingNumber) {
        this.routingNumber = routingNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BankBase bankBase = (BankBase) o;
        return accountNumber == bankBase.accountNumber && routingNumber == bankBase.routingNumber && bankName.equalsIgnoreCase(bankBase.bankName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankName, accountNumber, routingNumber);
    }

    @Override
    public String toString() {
        return "BankBase{" +
                "accountNumber=" + accountNumber +
                ", routingNumber=" + routingNumber +
                '}';
    }
}
