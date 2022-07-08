package ejercicio2;

public class Triangulo implements FiguraGeometrica {

    private double ladoUno;
    private double ladoDos;
    private double ladoTres;

    public Triangulo(double ladoUno, double ladoDos, double ladoTres) {
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
        this.ladoTres = ladoTres;
    }

    @Override
    public double calcularArea() {
        double s = (ladoUno+ladoDos+ladoTres)/2;
        return Math.sqrt(s*(s-ladoUno)*(s-ladoDos)*(s-ladoTres));
    }
}
