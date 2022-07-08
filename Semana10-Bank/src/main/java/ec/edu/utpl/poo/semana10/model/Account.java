package ec.edu.utpl.poo.semana10.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance;
    private String number;
    private LocalDate openedAt;
    private List<Transaction> transactions;

    public Account(double balance, String number) {
        validateAmount(balance);
        this.balance = balance;
        this.number = number;
        this.openedAt = LocalDate.now();
        transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        validateAmount(balance);
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getOpenedAt() {
        return openedAt;
    }

    public void deposit(double amount, String reference) {
        validateAmount(amount);
        balance += amount;
        registerTransaction(TType.DEP, amount, reference);
    }

    public void registerTransaction(TType type, double amount, String reference) {
        transactions.add(new Transaction(type, amount, reference));
    }

    public void validateAmount(double amount) {
        if( amount <= 0 ) {
            throw new IllegalArgumentException("Amount is not valid");
        }
    }

    public boolean isTransactionPosible(double amount) {
        return balance > amount;
    }

    public void printTransactions() {
        for(var transaction : transactions) {
            System.out.println(transaction);
        }
    }
}