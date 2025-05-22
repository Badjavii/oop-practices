package com.github.badjavii.p06_Pagos;
import com.github.badjavii.p01_Interfaces.UICaja;
import java.util.ArrayList;
import com.github.badjavii.p02_Products.Producto;
import com.github.badjavii.p03_Cliente.Cliente;
import com.github.badjavii.p04_Notificaciones.Notificaciones;
import com.github.badjavii.p04_Notificaciones.NotificacionesWhatsapp;
import com.github.badjavii.p04_Notificaciones.NotificacionesCorreo;

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

    public void procesarCompra(String metodoNoti) {
        Notificaciones notificacion;
    
        if (metodoNoti.toUpperCase() == "WHATSAPP")
            notificacion = new NotificacionesWhatsapp;
        else if (metodoNoti.toUpperCase() == "CORREO")
            notificacion = new NotificacionesCorreo;
        else 
            throw new IllegalArgumentException("El tipo de notificacion no fue aceptado");
        
        
    
    }
}
