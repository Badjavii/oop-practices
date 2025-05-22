package com.github.badjavii.p04_Notificaciones;
import com.github.badjavii.p03_Cliente.Cliente;
import com.github.badjavii.p05_Factura.Factura;

public class NotificacionesCorreo extends Notificaciones{

    public NotificacionesCorreo(Factura factura){
        super(factura);
    }

    public void showMessage(){
        System.out.println("Mensaje enviado por Correo");
        System.out.println(getMensaje());
    }

    public void enviarNotificaciones(Cliente cliente) {
    }


}
