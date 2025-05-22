package com.github.badjavii.p01_Interfaces;
import com.github.badjavii.p02_Products.Producto;
import com.github.badjavii.p03_Cliente.Cliente;

import java.util.ArrayList;
//import com.github.badjavii.

public interface UINotificaciones {
    public void enviarNotificacion(Cliente cliente, ArrayList<Producto> productos);
}
