package ec.edu.utpl.poo.semana10.clases.tema2.model;

public class PracticaExperimentacion extends Proyecto {
    private String lenguajePro;
    private String urlGit;

    public PracticaExperimentacion(String nombre, double nota, String lenguajePro, String urlGit) {
        super(nombre, nota);
        this.lenguajePro = lenguajePro;
        this.urlGit = urlGit;
    }

    public String getLenguajePro() {
        return lenguajePro;
    }

    public void setLenguajePro(String lenguajePro) {
        this.lenguajePro = lenguajePro;
    }

    public String getUrlGit() {
        return urlGit;
    }

    public void setUrlGit(String urlGit) {
        this.urlGit = urlGit;
    }

    @Override
    public String toString() {
        var format = """
                
                        PracticaExperimentacion {
                            "nombre": "%s",
                            "lenguaje": "%s",
                            "puntaje": %f,
                            "git": %s,
                            "fecha asigna.": "%s",
                            "fecha entrega": "%s"
                        }
                """;
        return String.format(format,
                getNombre(),
                getLenguajePro(),
                getNota(),
                getUrlGit(),
                getFechaAsignacion().toString(),
                getFechaEntrega().toString());
    }
}
