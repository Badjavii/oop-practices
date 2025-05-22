package com.github.badjavii.p04_Notificaciones;
import com.github.badjavii.p01_Interfaces.UINotificaciones;
import com.github.badjavii.p03_Cliente.Cliente;
import com.github.badjavii.p05_Factura.Factura;
import com.github.badjavii.p02_Products.Producto;
import java.util.ArrayList;

public abstract class Notificaciones {
    private Factura factura;

    public Notificaciones(Factura factura) {
        this.factura = factura;
    }

    public String getMensaje(){
        return "Estimado usuario, le agradecemos por elegir PetWorld para comprarle a su mascota la orden: \n";
    }

    public abstract void showMensaje();

    public void enviarNotificaciones(Cliente cliente, ArrayList<Producto> productos){
        Fact
    }
}
