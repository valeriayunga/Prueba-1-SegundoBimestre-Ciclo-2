package ec.edu.utpl.poo.model;

public abstract class Cuenta {
    private String numero;
    private double saldo;

    public Cuenta(String numero, double saldo) {
        this.setNumero(numero);
        this.setSaldo(saldo);
    }

    public abstract void depositar(double monto);


    public boolean esMontoValido(double monto){

        return monto>0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
