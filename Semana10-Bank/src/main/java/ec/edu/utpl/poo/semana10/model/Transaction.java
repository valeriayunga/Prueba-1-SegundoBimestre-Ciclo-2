package ec.edu.utpl.poo.semana10.model;

import java.time.LocalDateTime;

public class Transaction {
    private TType type;
    private double amount;
    private String reference;
    private LocalDateTime dateTime;

    public Transaction(TType type, double amount, String reference) {
        this.type = type;
        this.amount = amount;
        this.reference = reference;
        dateTime = LocalDateTime.now();
    }

    public TType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getReference() {
        return reference;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return String.format("%s\t%f\t%s\t%s",
                type.toString(),
                amount,
                reference,
                dateTime
                );
    }
}
