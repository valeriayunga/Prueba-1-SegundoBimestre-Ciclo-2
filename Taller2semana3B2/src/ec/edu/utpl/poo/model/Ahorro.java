package ec.edu.utpl.poo.model;

public class Ahorro extends Cuenta {


    public Ahorro(String numero, double saldo) {
        super(numero, saldo);
    }

    public void retirar (double monto){
        if(esMontoValido(monto)&& monto<getSaldo()){
            setSaldo(getSaldo()-monto);
        }else{
            throw new IllegalArgumentException("Monto no valido");
        }

    }
    @Override
    public void depositar(double monto) {
        if (esMontoValido(monto)) {
            if (monto < 500) {

                setSaldo(getSaldo() + monto);
            } else if (monto > 500 && monto < 1000) {

                setSaldo((getSaldo() + monto) - (monto * 0.1));

            } else {
                if (monto > 1000 && monto < 5000) {
                    setSaldo((getSaldo() + monto) - (monto * 0.2));
                } else {
                    if (monto > 500) {
                        setSaldo((getSaldo() + monto) - (monto * 0.3));
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("El monto no es válido");
        }

    }


}
