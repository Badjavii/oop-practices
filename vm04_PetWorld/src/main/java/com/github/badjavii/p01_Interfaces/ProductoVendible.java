package com.github.badjavii.p01_Interfaces;
import com.github.badjavii.p03_Cliente.Cliente;

public interface ProductoVendible {
    public boolean verificarDisponible();

    public int reducirStock(int cantidad);

    public double calcularDescuento(Cliente cliente);
}