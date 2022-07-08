package ec.edu.utpl.poo.semana10.controller;

import ec.edu.utpl.poo.semana10.model.*;

import java.util.List;

public class BankController {
    public static void main(String[] args) {
        Bank bank = new Bank("POO Bank");
        Client client001 = new Client("110012325", "Iza", "Guillermo");
        List<Account> accounts;


        Saving saving = new Saving(100, "001", 5);
        saving.deposit(234, "001-123-0001");
        saving.withdraw(34, "100-123-0001");

        Checking checking = new Checking(450, "101", 100);
        checking.payOver(200, "100-123-0002");

        accounts = List.of(saving, checking);

        client001.setAccounts(accounts);

        bank.addClient(client001);
        var balanceTotal = 0.0;

        System.out.println();
        System.out.println(bank.getName());

        for(var client : bank.getClients()) {
            for(var account : client.getAccounts()) {
                System.out.printf("Number: %s - Balance: %.2f\n", account.getNumber(), account.getBalance());
                account.printTransactions();
                balanceTotal += account.getBalance();
            }
        }

        System.out.printf("\nBalance total: %.2f", balanceTotal);

    }
}
