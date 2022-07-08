package ec.edu.utpl.poo.semana10.model;

public class Checking extends Account {
    private double overDraft;


    public Checking(double balance, String number, double overDraft) {
        super(balance, number);
        if(overDraft < 1.5 * balance) {
            this.overDraft = overDraft;
        } else {
            throw new IllegalArgumentException("Overdraft cannot be greater than 1.5 times the balance");
        }
    }

    public void payOver(double amount, String reference) {
        validateAmount(amount);
        if(isTransactionPosible(amount)) {
            setBalance( getBalance() - amount );
            registerTransaction(TType.PCH, amount, reference);
        } else {
            throw new IllegalArgumentException("Insufficient balance");
        }
    }
}