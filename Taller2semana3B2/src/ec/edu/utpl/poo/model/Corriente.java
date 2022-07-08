package ec.edu.utpl.poo.model;


public class Corriente extends Cuenta {

    private boolean permiteSobregiro;

    public Corriente(String numero, double saldo, boolean permiteSobregiro) {
        super(numero, saldo);
        this.permiteSobregiro = permiteSobregiro;
    }



    @Override
    public void depositar(double monto) {
        if (esMontoValido(monto)) {
            if (monto < 500) {

                setSaldo(getSaldo() + monto);
            } else if (monto > 500 && monto < 1000) {

                setSaldo((getSaldo() + monto) - (monto * 0.2));

            } else {
                if (monto > 1000 && monto < 5000) {
                    setSaldo((getSaldo() + monto) - (monto * 0.3));
                } else {
                    if (monto > 500) {
                        setSaldo((getSaldo() + monto) - (monto * 0.4));
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("El monto no es válido");
        }
    }



    public void pagarCheque(double monto){

        if(esMontoValido(monto)&& monto<getSaldo()){
            setSaldo(getSaldo()-monto);
        }else{
            throw new IllegalArgumentException();
        }
    }
}
