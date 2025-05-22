package com.github.badjavii.p05_Factura;
import com.github.badjavii.p02_Products.Producto;

public class DetalleFactura {
    private final int cantidad;
    private final double impuesto;
    private final double precio;
    private final Producto producto;

    public DetalleFactura(int cantidad, double impuesto, Producto producto) {
        this.cantidad = cantidad;
        this.impuesto = impuesto;
        this.precio = producto.getPrecioUnitario();
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public double getPrecio() {
        return precio;
    }

    public Producto getProducto() {
        return producto;
    }

    public double getPrecioDetalle() {
        return (getCantidad() * getPrecio()) * getImpuesto();
    }

    public void mostrarDetalle() {
        System.out.println("- Nombre: " + getProducto().getNombre() + ", Cantidad: " + cantidad);
        System.out.println("  Impuesto: " + getImpuesto() + ", Precio: " + getPrecio());
        System.out.println("  PrecioTotal: " + getPrecioDetalle());
    }


}
