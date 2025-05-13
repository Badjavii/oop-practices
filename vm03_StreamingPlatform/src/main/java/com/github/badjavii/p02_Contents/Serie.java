package com.github.badjavii.p02_Contents;

public class Serie extends ContenidoMultimedia {
    private int temporadas;              // Número de temporadas
    private int episodiosPorTemporada;   // Episodios por temporada

    public Serie(String titulo, int duracion, String genero, int temporadas, int episodiosPorTemporada) {
        super(titulo, genero, duracion);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public Serie(String titulo, int duracion, String genero, int vecesReproducido, boolean esFavorito, int temporadas, int episodiosPorTemporada) {
        super(titulo, genero, duracion, vecesReproducido, esFavorito);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    @Override
    public double calcularPuntuacion() {
        return 0;
    }

    // Implementar
}


