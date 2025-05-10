import java.util.ArrayList;

public class PlataformaStreamming {

    private String nombre;                               //Nombre de la plataforma.
    private ArrayList<ContenidoReproducible> contenidos; // Lista de ContenidoReproducible.
    private ArrayList<User> usuarios;                    // Lista de Usuario.

    public PlataformaStreamming(String nombre) {
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

       ContenidoMultimedia masPopular = contenidos.getFirst();
       double puntuacionMax = masPopular.calcularPuntuacion();

       for (ContenidoMultimedia actual : contenidos){
           if (puntuacionMax < actual.calcularPuntuacion()){
               masPopular = actual;
               puntuacionMax = actual.calcularPuntuacion();
           }
       }

       return ((ContenidoReproducible) masPopular);
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
        for (ContenidoMultimedia contenido : contenidos){
            sumaReproducciones += contenido.obtenerVecesReproducido();
        }

        System.out.println("- Reproducciones totales: " + sumaReproducciones);

        double promedioPuntuaciones= 0;
        for (ContenidoMultimedia contenido : contenidos){
            promedioPuntuaciones += contenido.calcularPuntuacion();
        }

        promedioPuntuaciones /= contenidos.size();

        System.out.println("- Puntuacion totales: " + promedioPuntuaciones);
    }


}