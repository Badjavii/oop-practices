package com.github.badjavii.p02_Products;
import com.github.badjavii.p01_Interfaces.ProductoVendible;
import com.github.badjavii.p03_Cliente.Cliente;

public abstract class Producto implements ProductoVendible {
    private int id;
    private String nombre;
    private double precioUnitario;
    private int cantidadStock;

    public Producto(int id, String nombre, double precioUnitario, int cantidadStock) {
        this.id = id;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidadStock = cantidadStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public boolean verificarDisponible(){
        if (getCantidadStock() == 0) return false;
        return true;
    }

    public int reducirStock(int cantidad){
        int stock = getCantidadStock() - cantidad;

        setCantidadStock(stock);
        return stock;
    }

    public double calcularDescuento(Cliente cliente){
        double descuento = 0;

        if (cliente.getTipoCliente() == TipoCliente.REGULAR){
            descuento = precioUnitario * cantidadStock;
        } else {
            descuento = precioUnitario * cantidadStock;
        }

        return descuento;
    }
}