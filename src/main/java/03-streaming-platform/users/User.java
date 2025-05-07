import java.util.ArrayList;


public class User {
    private String nombre;                                      // Nombre del usuario.
    private double espacioDisponible;                           // Espacio de almacenamiento en MB.
    private ArrayList<ContenidoReproducible> listaFavoritos;    // Lista de contenidos marcados como favoritos (ContenidoReproducible).

    // Constructor
    public User(String nombre, double espacioDisponible) {
        this.nombre = nombre;
        this.espacioDisponible = espacioDisponible;
        listaFavoritos = new ArrayList<>();
    }

    public void agregarFavorito(ContenidoMultimedia contenido) {
        listaFavoritos.add(contenido);
        contenido.setEsFavorito(true);
    }

    public void descargarContenido(ContenidoDescargable contenido){
        System.out.println("Descargado...");
    }

}