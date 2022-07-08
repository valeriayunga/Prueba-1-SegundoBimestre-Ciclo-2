package ec.edu.utpl.poo.semana10.model;

public class Saving extends Account {
    private double annualInterest;

    public Saving(double balance, String number, double annualInterest) {
        super(balance, number);
        this.annualInterest = annualInterest;
    }

    public void withdraw(double amount, String reference) {
        validateAmount(amount);
        if(isTransactionPosible(amount)) {
            setBalance(getBalance() - amount);
            registerTransaction(TType.RET, amount, reference);
        } else {
            throw new IllegalArgumentException("Balance lower than amount");
        }
    }

    public void payInterest() {
        var interestToPay = getBalance() * annualInterest / 100;
        setBalance( getBalance() * interestToPay );
        registerTransaction(TType.INT, interestToPay, "S/R");
    }
}