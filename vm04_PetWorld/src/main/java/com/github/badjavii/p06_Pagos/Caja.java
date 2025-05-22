package com.github.badjavii.p06_Pagos;
import com.github.badjavii.p01_Interfaces.UICaja;
import java.util.ArrayList;
import com.github.badjavii.p02_Products.Producto;
import com.github.badjavii.p03_Cliente.Cliente;
import com.github.badjavii.p05_Factura.

public class Caja implements UICaja{
    private Cliente cliente;
    private ArrayList<Producto> listaProductos;

    public Caja(Cliente cliente) {
        this.cliente = cliente;
        this.listaProductos = new ArrayList<Producto>();
    }

    public void agregarProductoEnCaja(Producto producto) {
        listaProductos.add(producto);
    }

    public void eliminarProductoEnCaja(Producto producto) {
        listaProductos.remove(producto);
    }

    public void procesarCompra() {

    }
}
