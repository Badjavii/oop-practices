package com.github.badjavii.vm03_StreamingPlatform.p02_Contents;
import com.github.badjavii.vm03_StreamingPlatform.p01_Interfaces.ContenidoDescargable;

public class Audiolibro extends ContenidoMultimedia implements ContenidoDescargable {

    private final String narrador;    // Nombre del narrador.
    private final double tamanoMB;    // Tamaño del archivo en MB.

    public Audiolibro(String titulo, int duracion, String genero, String narrador, double tamanoMB) {
        super(titulo, genero, duracion);
        this.narrador = narrador;
        this.tamanoMB = tamanoMB;
    }

    public Audiolibro(String titulo, int duracion, String genero, int vecesReproducido, boolean esFavorito, String narrador, double tamanoMB) {
        super(titulo, genero, duracion, vecesReproducido, esFavorito);
        this.narrador = narrador;
        this.tamanoMB = tamanoMB;
    }

    public String getNarrador() {
        return narrador;
    }

    // Implementacion de interface
    public double descargar() {
        return tamanoMB;
    }

    public boolean verificarEspacioRequerido(double espacioDisponible) {
        double size = descargar();

        if (espacioDisponible < size)
            return false;

        return true;
    }


    // Implementacion de metodo abstracto
    public double calcularPuntuacion() {

        return (obtenerVecesReproducido() * 0.2);
    }
}