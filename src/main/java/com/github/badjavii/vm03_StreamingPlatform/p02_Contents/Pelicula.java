package com.github.badjavii.vm03_StreamingPlatform.p02_Contents;
import com.github.badjavii.vm03_StreamingPlatform.p01_Interfaces.ContenidoDescargable;
import com.github.badjavii.vm03_StreamingPlatform.p04_Extras.ResolutionType;

public class Pelicula extends ContenidoMultimedia implements ContenidoDescargable {
    private String director;         // Nombre del director;
    private final ResolutionType resolucion;       // Resolución del video (ej. "4K", "HD").

    public Pelicula(String titulo, int duracion, String genero, String director, ResolutionType resolucion) {
        super(titulo, genero, duracion);
        this.director = director;
        this.resolucion = resolucion;
    }

    public Pelicula(String titulo, int duracion, String genero, int vecesReproducido, boolean esFavorito, String director, ResolutionType resolucion){
        super(titulo, genero, duracion, vecesReproducido, esFavorito);
        this.director = director;
        this.resolucion = resolucion;
    }

    // Implementacion de interface
    public double descargar() {
        double size = 5000;

        if (resolucion == ResolutionType.HD)
            size = 2000;

        return size;
    }

    public boolean verificarEspacioRequerido(double espacioDisponible) {
        double size = descargar();

        if (espacioDisponible < size)
            return false;

        return true;
    }


    // Implementacion de metodo abstracto
    public double calcularPuntuacion() {
        int i = 0;

        if (resolucion == ResolutionType.HD)
            i = 10;

        return (obtenerVecesReproducido() * 0.5 + i);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}