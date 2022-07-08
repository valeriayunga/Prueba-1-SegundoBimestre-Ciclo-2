package ec.edu.utpl.poo.semana10.clases.tema2.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Proyecto implements Serializable {
    private String nombre;
    private LocalDate fechaAsignacion;
    private LocalDate fechaEntrega;
    private double nota;

    public Proyecto(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
        fechaAsignacion = LocalDate.now();
        fechaEntrega = LocalDate.now().plusDays(15);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
