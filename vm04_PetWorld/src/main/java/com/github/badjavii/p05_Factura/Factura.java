package com.github.badjavii.p05_Factura;
import java.time.LocalDate;
import java.util.ArrayList;
import com.github.badjavii.p05_Factura.DetalleFactura;
import java.util.Random;
import com.github.badjavii.p02_Products.Producto;

public class Factura {
    private final LocalDate fecha;
    private double montoTotal;
    private ArrayList<DetalleFactura> detalles;

    public Factura(LocalDate fecha) {
        this.fecha = fecha;
        this.montoTotal = 0;
        this.detalles = new ArrayList<DetalleFactura>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal() {
        double total = 0;
        for (DetalleFactura detalle : detalles) {
            total += detalle.getPrecio();
        }
        montoTotal = total;
    }

    public void addDetalles(ArrayList<Producto> listaProductos) {
        Random randomNumbers = new Random();
        double impuesto = randomNumbers.nextDouble();
        detalles.add(new DetalleFactura());
        setMontoTotal();
    }

    public void mostrarFactura() {

    }
}
