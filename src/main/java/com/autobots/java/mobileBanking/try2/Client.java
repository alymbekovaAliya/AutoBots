package com.autobots.java.mobileBanking.try2;

import java.util.List;
import java.util.UUID;

public class Client {

    private String fullName;
    private UUID uuid;
    private String pin;
    private List<BankAccount> listOfBanksAccount;

    public Client(String fullName, String pin) {
        this.fullName = fullName;
        this.uuid = UUID.randomUUID();
        this.pin = pin;
    }


    boolean authenticate(String pin1) {
    return pin1.equalsIgnoreCase(pin);
    }

    void addAccount(BankAccount account){
        listOfBanksAccount.add(account);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public List<BankAccount> getListOfBanksAccount() {
        return listOfBanksAccount;
    }

    public void setListOfBanksAccount(List<BankAccount> listOfBanksAccount) {
        this.listOfBanksAccount = listOfBanksAccount;
    }
}
