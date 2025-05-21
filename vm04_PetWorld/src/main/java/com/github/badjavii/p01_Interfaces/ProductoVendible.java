package com.github.badjavii.p01_Interfaces;

interface ProductoVendible {
    public boolean verificarDisponible();

    public int reducirStock(int cantidad);

    public double calcularDescuento(Cliente cliente);
}