package ec.edu.utpl.poo.model;

import ec.edu.utpl.poo.jfacturacion.model.Factura;
import ec.edu.utpl.poo.jfacturacion.model.ICalculaTotalFactura;

public class FacturaConDescuento implements ICalculaTotalFactura {
    @Override
    public double calcularTotal(Factura factura) {
        double total=0;
        double descuento=0;


        for (var producto: factura.getDetalle()) {

            if(producto.getCantidad()<3) {

                if(factura.getCliente().isFrecuente()){
                    descuento=producto.getProducto().getPrecioUnitario()-0.01;
                    total=total+(descuento* producto.getCantidad());
                }else {

                    total=total+(producto.getProducto().getPrecioUnitario()*producto.getCantidad());
                }

            }else{
                if (producto.getCantidad() > 3 && producto.getCantidad() < 6) {
                    if(factura.getCliente().isFrecuente()==true){
                        descuento=((producto.getProducto().getPrecioUnitario()-0.01)* producto.getCantidad()*0.02);

                        total=total+(producto.getProducto().getPrecioUnitario()-0.01)* producto.getCantidad()-descuento;
                    }else {
                        descuento = producto.getProducto().getPrecioUnitario()* producto.getCantidad() * 0.02;
                        total = total+producto.getProducto().getPrecioUnitario()-descuento;
                    }
                } else {
                    if (producto.getCantidad() >= 6 && producto.getCantidad() < 12){
                        if(factura.getCliente().isFrecuente()==true){
                            descuento=((producto.getProducto().getPrecioUnitario()-0.01)*producto.getCantidad()*0.03);
                            total=total+((producto.getProducto().getPrecioUnitario()-0.01)*producto.getCantidad())-descuento;
                        }else {
                            descuento = producto.getProducto().getPrecioUnitario() *producto.getCantidad()* 0.03;
                            total = total+producto.getProducto().getPrecioUnitario()*producto.getCantidad()-descuento;
                        }
                    }else{
                        if (producto.getCantidad() >=12 ) {
                            if(factura.getCliente().isFrecuente()==true) {
                                descuento=((producto.getProducto().getPrecioUnitario()-0.01)*producto.getCantidad()*0.04);
                                total=total+(producto.getProducto().getPrecioUnitario()-0.01)*producto.getCantidad()-descuento;
                            }else {
                                descuento = producto.getProducto().getPrecioUnitario()*producto.getCantidad()* 0.04;
                                total = total+producto.getProducto().getPrecioUnitario()*producto.getCantidad()-descuento;
                            }
                        }
                    }
                }
            }
        }

        return total;
    }
}

/*
  public double calcularTotal(Factura factura) {
  var Total;
  var esCliente = factura.getCliente(),isFrecuente();

  for (var detalle: factura.getDetalle()){
  if(esClienteFrecuente){

  }
  }
 */