package ejercicio2;

public class Circunferencia implements FiguraGeometrica {
 private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {

        return Math.PI * Math.pow(radio, 2);
    }
}
