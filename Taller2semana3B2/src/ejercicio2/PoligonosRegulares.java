package ejercicio2;

public class PoligonosRegulares implements FiguraGeometrica{
    private double perimetro;
    private double apotrema;

    public PoligonosRegulares(double perimetro, double apotrema) {
        this.perimetro = perimetro;
        this.apotrema = apotrema;
    }

    @Override
    public double calcularArea() {
        return (perimetro*apotrema)/2;

    }
}
