package com.github.badjavii.p04_Notificaciones;

import com.github.badjavii.p03_Cliente.Cliente;

public class NotificacionesWhatsapp extends Notificaciones{

    public NotificacionesWhatsapp(){
        super();
    }

    public void showMessage(){
        System.out.println("Mensaje enviado por Whatsapp");
        System.out.println(getMensaje());
    }

    public void enviarNotificaciones(Cliente cliente) {
        showMessage();
        System.out.println(cliente);
    }
}
