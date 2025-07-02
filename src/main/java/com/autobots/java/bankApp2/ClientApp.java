package com.autobots.java.bankApp2;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ClientApp {
    private final String fullName;
    private final String clientID;
    private final String pin;

    private final List<BankAccountApp> accounts = new ArrayList<>();

    public ClientApp(String fullName, String pin) {
        this.fullName = fullName;
        this.clientID = UUID.randomUUID().toString();
        this.pin = pin;
    }

    public boolean authenticate(String inputPin) {
        return this.pin.equals(inputPin);
    }

   public void addAccount(BankAccountApp account) {
        accounts.add(account);
    }

    public String getFullName() {
        return fullName;
    }

    public String getClientID() {
        return clientID;
    }

    public List<BankAccountApp> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "ClientApp{" +
                "fullName='" + fullName + '\'' +
                ", clientID='" + clientID + '\'' +
                ", pin='" + pin + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
