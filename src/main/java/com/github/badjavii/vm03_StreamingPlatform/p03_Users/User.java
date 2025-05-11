package com.github.badjavii.vm03_StreamingPlatform.p03_Users;
import com.github.badjavii.vm03_StreamingPlatform.p02_Contents.ContenidoMultimedia;

import java.util.ArrayList;


public class User {
    private String nombre;                                      // Nombre del usuario.
    private double espacioDisponible;                           // Espacio de almacenamiento en MB.
    private final ArrayList<ContenidoMultimedia> listaFavoritos;    // Lista de contenidos marcados como favoritos (ContenidoReproducible).

    // Constructor
    public User(String nombre, double espacioDisponible) {
        this.nombre = nombre;
        this.espacioDisponible = espacioDisponible;
        listaFavoritos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEspacioDisponible() {
        return espacioDisponible;
    }

    public void setEspacioDisponible(double espacioDisponible) {
        this.espacioDisponible = espacioDisponible;
    }

    public void agregarFavorito(ContenidoMultimedia contenido) {
        listaFavoritos.add(contenido);
        contenido.setEsFavorito(true);
    }

    public void descargarContenido(ContenidoMultimedia contenido){
        if (!(contenido instanceof ContenidoDescargable))
            return;

        boolean sePuedeDescargar = contenido.verificarEspacioRequerido(espacioDisponible);

        if (sePuedeDescargar)
            setEspacioDisponible(espacioDisponible - ((ContenidoDescargable) contenido).descargar());
    }

    public void reproducirContenido(ContenidoMultimedia contenido){
        contenido.reproducir();
    }

}
