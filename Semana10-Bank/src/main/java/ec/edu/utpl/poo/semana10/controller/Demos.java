package ec.edu.utpl.poo.semana10.controller;

import ec.edu.utpl.poo.semana10.model.*;


public class Demos {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b);

        Transaction t = new Transaction(TType.INT,123,"abc");
        System.out.println(t);

        Account cuenta = new Saving(100,"001",5 );
        Account cuenta2 = new Checking(100,"002",3);


    }
}
