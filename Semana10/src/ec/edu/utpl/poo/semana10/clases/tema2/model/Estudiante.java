package ec.edu.utpl.poo.semana10.clases.tema2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Estudiante implements Serializable {
    private String nombre;
    private List<Proyecto> proyectos;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        proyectos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public String toString() {
        return String.format("""
                Estudiante {
                    "nombre": "%s",
                    "proyectos": %s
                }
                """, getNombre(), getProyectos());
    }
}
