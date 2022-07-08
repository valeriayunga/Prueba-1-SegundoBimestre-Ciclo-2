package ec.edu.utpl.poo.model;
import ec.edu.utpl.poo.jfacturacion.controller.JFacturacionMain;
import ec.edu.utpl.poo.jfacturacion.model.CalculoNormal;
import ec.edu.utpl.poo.jfacturacion.model.Factura;
import ec.edu.utpl.poo.jfacturacion.model.ICalculaTotalFactura;

public class RunFacturaConDescuento {
    public static void main(String[] args) {
        FacturaConDescuento F1= new FacturaConDescuento();
        var totalFactura = JFacturacionMain.calcularTotal(F1);
        System.out.println(totalFactura);


    }
}
