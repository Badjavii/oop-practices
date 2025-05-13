package com.github.badjavii.p04_Extras;
import com.github.badjavii.p01_Interfaces.ContenidoReproducible;
import com.github.badjavii.p02_Contents.ContenidoMultimedia;
import com.github.badjavii.p03_Users.User;
import java.util.ArrayList;

public class PlataformaStreaming {

    private String nombre;                               //Nombre de la plataforma.
    private ArrayList<ContenidoReproducible> contenidos; // Lista de ContenidoReproducible.
    private ArrayList<User> usuarios;                    // Lista de Usuario.

    public PlataformaStreaming(String nombre) {
        this.nombre = nombre;
        contenidos = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarContenido(ContenidoReproducible newContenido) {
        contenidos.add(newContenido);
    }

    public void agregarUsuario(User newUsuario) {
        usuarios.add(newUsuario);
    }

    public ContenidoReproducible obtenerContenidoMasPopular(){
        if (contenidos.isEmpty()){
            return null;
        }

        ContenidoReproducible masPopular = contenidos.get(0); // Mantén el tipo genérico
        double puntuacionMax = masPopular.calcularPuntuacion();

        for (ContenidoReproducible actual : contenidos){
            if (puntuacionMax < actual.calcularPuntuacion()){
                if (actual instanceof ContenidoMultimedia) { // Verifica el tipo antes de convertir
                    masPopular = actual;
                    puntuacionMax = actual.calcularPuntuacion();
                }
            }
        }

        return masPopular; // Retorna el contenido más popular sin casting forzado
    }

    // Retorna una lista de contenidos que coinciden con el género especificado.
    public ArrayList<ContenidoReproducible> buscarPorGenero(String genero){
        ArrayList<ContenidoReproducible> generoList = new ArrayList<>();

        for (ContenidoReproducible contenido : contenidos){
            if (contenido.obtenerGenero() == genero)
                generoList.add(contenido);
        }

        if (generoList.isEmpty()){
            generoList = null;
        }

        return generoList;
    }

    //  Genera un resumen con: ,Contenido más popular, Número total de reproducciones en la plataforma.
    //,Promedio de puntuaciones de todos los contenidos
    public void generarReporte(){
        System.out.println("Generando reporte:");
        System.out.println("- Titulo del contenido mas popular: " + (obtenerContenidoMasPopular().obtenerTitulo()));

        int sumaReproducciones = 0;
        for (ContenidoReproducible contenido : contenidos){
            // sumaReproducciones += contenido.obtenerVecesReproducido();
            sumaReproducciones = 1; // temporal
        }

        System.out.println("- Reproducciones totales: " + sumaReproducciones);

        double promedioPuntuaciones= 0;
        for (ContenidoReproducible contenido : contenidos){
            promedioPuntuaciones += contenido.calcularPuntuacion();
        }

        promedioPuntuaciones /= contenidos.size();

        System.out.println("- Puntuacion totales: " + promedioPuntuaciones);
    }


}