package com.github.badjavii.p02_Products;
import java.time.LocalDate;

public class Alimento extends Producto {
    private LocalDate fechaVencimiento;

    public Alimento(LocalDate fechaVencimiento, int id, String nombre, double precioUnitario, int cantidadStock) {
        super(id, nombre, precioUnitario, cantidadStock);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


}