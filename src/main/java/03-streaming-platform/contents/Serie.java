

public class Serie extends ContenidoMultimedia {
    private int temporadas;              // Número de temporadas
    private int episodiosPorTemporada;   // Episodios por temporada

    public Serie(String titulo, String duracion, String genero, int temporadas, int episodiosPorTemporada) {
        super(titulo, duracion, genero);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public Serie(String titulo, String duracion, String genero, int vecesReproducido, boolean esFavorito, int temporadas, int episodiosPorTemporada) {
        super(titulo, duracion, genero, vecesReproducido, esFavorito);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    // Implementar
}