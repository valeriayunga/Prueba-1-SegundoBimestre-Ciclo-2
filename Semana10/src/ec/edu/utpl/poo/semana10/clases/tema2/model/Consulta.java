package ec.edu.utpl.poo.semana10.clases.tema2.model;

public class Consulta extends Proyecto {
    private String tema;
    private int numMinPalabras;

    public Consulta(String nombre, double nota, String tema, int numMinPalabras) {
        super(nombre, nota);
        this.tema = tema;
        this.numMinPalabras = numMinPalabras;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getNumMinPalabras() {
        return numMinPalabras;
    }

    public void setNumMinPalabras(int numMinPalabras) {
        this.numMinPalabras = numMinPalabras;
    }

    @Override
    public String toString() {
        var format = """
                
                        Consulta {
                            "nombre": "%s",
                            "tema": "%s",
                            "puntaje": %f,
                            "Nro. mín. palabras": %d,
                            "fecha asigna.": "%s",
                            "fecha entrega": "%s"
                        }
                """;
        return String.format(format,
                getNombre(),
                getTema(),
                getNota(),
                getNumMinPalabras(),
                getFechaAsignacion().toString(),
                getFechaEntrega().toString());
    }
}
