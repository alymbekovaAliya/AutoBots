package com.autobots.java.bankApp2;
import com.autobots.java.mobileBanking.try2.Currency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankProApp {

    static  Scanner scanner = new Scanner(System.in);
    private static final Map<String, ClientApp> clients = new HashMap<>();

    public static void main(String[] args) {

        ClientApp allazor = new ClientApp("allazor", "1234");

        DepositAccountApp allazorDebit = new DepositAccountApp(allazor, Currency.USD);
        CreditAccountApp allazorCredit = new CreditAccountApp(allazor, Currency.EUR);

        allazorDebit.deposit(100000);
        allazorCredit.deposit(500000);

        allazor.addAccount(allazorDebit);
        allazor.addAccount(allazorCredit);
        System.out.println(allazor.getClientID());
        System.out.println(allazorDebit.getAccountNumber());
        System.out.println(allazorCredit.getAccountNumber());

        clients.put(allazor.getClientID(), allazor);

        System.out.println("======Welcome to MBank======");
        System.out.print("please enter client id");

        String clientId = scanner.nextLine();
        ClientApp client = clients.get(clientId);
        if(client == null) {
            System.out.println("Client was not found");
            return;
        }

        System.out.print("enter pin code");
        String pin = scanner.nextLine();
        if(!client.authenticate(pin)){
            System.out.println("Something wrong");
            return;
        }

        System.out.println("welcome to your account " + client.getFullName());

        while (true) {
            System.out.println("1.посмотреть счета\n2.перевод между счетами\n3.показать чек\n4.выход из системы");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    for(BankAccountApp bankAccount: client.getAccounts()) {
                        System.out.printf("%s | %s | Баланс: %.2f %s\n",
                                bankAccount.getClass().getSimpleName(),
                                bankAccount.getAccountNumber(),
                                bankAccount.getBalance(), bankAccount.getCurrency());
                    }
                  break;
                case "2":
                    System.out.print("Введите номер счета отправителя");
                    String fromId = scanner.nextLine();
                    System.out.println("Введите номер счета получателя");
                    String toId = scanner.nextLine();
                    System.out.println("Введите сумму");
                    double amount = Double.parseDouble(scanner.nextLine());
                    BankAccountApp from = findAccount(fromId);
                    BankAccountApp to = findAccount(toId);
                    if(from != (null) && to != (null)) {
                    boolean result =  BankServiceApp.transfer(from,to,amount);
                        System.out.println(result ? "успешно" : "отклонен");
                    } else {
                        System.out.println("Счета не найдены");
                    }
                    break;
                case "3":
                    for(BankAccountApp bankAccount: client.getAccounts()) {
                        System.out.println("\n == чек по счету: " + bankAccount.getAccountNumber());
                        for(TransactionApp transaction: bankAccount.getTransactions()) {
                            System.out.println(transaction);
                        }
                    }
                    break;
                case "4":
                    System.out.println("Выход...");
                    return;

                default:
                    System.out.println("Не верный выбор");
            }
        }

    }

    private static BankAccountApp findAccount(String accountNumber) {
        for(ClientApp client: clients.values()) {
            for(BankAccountApp bankAccount: client.getAccounts()) {
                if(bankAccount.getAccountNumber().equals(accountNumber)) {
                    return bankAccount;
                }
            }
        }
        return null;
    }

}
