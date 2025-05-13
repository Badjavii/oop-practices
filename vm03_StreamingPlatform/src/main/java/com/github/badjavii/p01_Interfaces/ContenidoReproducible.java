package com.github.badjavii.p01_Interfaces;

public interface ContenidoReproducible {

    public void reproducir();

    public void pausar();

    public int obtenerDuracion();

    public String obtenerTitulo();

    public String obtenerGenero();

    public boolean esFavorito();

    double calcularPuntuacion();
}