package ec.edu.utpl.poo.semana10.clases.tema2.controller;

import ec.edu.utpl.poo.semana10.clases.tema2.model.Consulta;
import ec.edu.utpl.poo.semana10.clases.tema2.model.Estudiante;
import ec.edu.utpl.poo.semana10.clases.tema2.model.PracticaExperimentacion;
import ec.edu.utpl.poo.semana10.clases.tema2.model.Proyecto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DemoSerializar {
    private static String USER_HOME = System.getProperty("user.home");

    public static void main(String[] args) {
        //Crear proyectos de consulta
        Consulta con1 = new Consulta("Mini-proyecto", 3, "JavaDc",1500);
        Consulta con2 = new Consulta("Trabajo autónomo", 2, "Functional programming", 3500);

        //Crear proyectos de práctica y experimentación
        PracticaExperimentacion pe1 = new PracticaExperimentacion("Serialización", 10, "Java", "http://github...");
        PracticaExperimentacion pe2 = new PracticaExperimentacion("Herencia", 10, "Python", "http://github...");

        //Crear estudiante
        Estudiante est1 = new Estudiante("Jorge");
        Estudiante est2 = new Estudiante("Gaudí");

        //Lista de proyectos para el estudiante 1
        List<Proyecto> proEst1 = new ArrayList<>();
        proEst1.add(con2);
        proEst1.add(pe2);
        est1.setProyectos(proEst1);

        //Proyectos para el estudiante 2
        est2.getProyectos().add(pe1);
        est2.getProyectos().add(pe2);
        est2.getProyectos().add(con1);
        est2.getProyectos().add(con2);

        System.out.println(est1);

        try {
            serializeStudent(est1, "stdnt1.ser");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println(est2);

        try{
            serializeStudent(est2, "stdnt2.ser");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static void serializeStudent(Estudiante student, String fileName) throws IOException {

        try(FileOutputStream fos = new FileOutputStream(USER_HOME.concat(File.separator).concat(fileName));
            ObjectOutputStream objOut = new ObjectOutputStream(fos) ) {

            objOut.writeObject(student);

        }
    }
}
