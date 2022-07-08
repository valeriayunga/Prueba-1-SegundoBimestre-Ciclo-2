package ec.edu.utpl.poo.semana10.clases.tema2.controller;

import ec.edu.utpl.poo.semana10.clases.tema2.model.Estudiante;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeserialize {
    private static String USER_HOME = System.getProperty("user.home");

    private static Estudiante deserialize(String fileName) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(USER_HOME.concat(File.separator).concat(fileName));
             ObjectInputStream objIn = new ObjectInputStream(fis)) {
            return (Estudiante) objIn.readObject();
        }
    }


    public static void main(String[] args) {

        Estudiante newEst1 = null;
        Estudiante newEst2 = null;
        try {
            newEst1 = deserialize("stdnt1.ser");
            newEst2 = deserialize("stdnt2.ser");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println(newEst1);

        System.out.println(newEst2);


    }
}
