package ejercicio2;

public class Rectangulo implements FiguraGeometrica {
    public double base;
    public double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base*altura;
    }
}
