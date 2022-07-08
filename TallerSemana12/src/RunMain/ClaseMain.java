package RunMain;


import ec.edu.utpl.poo.jfacturacion.controller.JFacturacionMain;
import ec.edu.utpl.poo.jfacturacion.model.CalculoNormal;

public class ClaseMain {
    public static void main(String[] args) {
        CalculoNormal normal = new CalculoNormal();
        var totalFactura = JFacturacionMain.calcularTotal(normal);
        System.out.println(totalFactura);

        var name = "";
        name.equalsIgnoreCase("");
    }


}
