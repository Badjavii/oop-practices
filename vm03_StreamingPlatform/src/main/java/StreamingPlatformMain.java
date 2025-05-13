import com.github.badjavii.p03_Users.User;
import com.github.badjavii.p02_Contents.Audiolibro;
import com.github.badjavii.p02_Contents.ContenidoMultimedia;
import com.github.badjavii.p02_Contents.Pelicula;
import com.github.badjavii.p02_Contents.Serie;
import com.github.badjavii.p04_Extras.PlataformaStreaming;
import com.github.badjavii.p04_Extras.ResolutionType;

public class StreamingPlatformMain {
    public static void main(String[] args) {

        // Crear instancias
        PlataformaStreaming StreamX =  new PlataformaStreaming("StreamX");
        User usu1 = new User("Ana", 1000);
        User usu2 = new User("Bob", 6000);
        ContenidoMultimedia contenido1 = new Pelicula("Inception", 148, "Ciencia Ficcion", "Javi", ResolutionType._4K);
        ContenidoMultimedia contenido2 = new Serie("Stranger Things", 100, "Ciencia Ficción", 3, 8);
        ContenidoMultimedia contenido3 = new Audiolibro("Dune", 100, "Ficción", "Javi", 500);

        //  Primera prueba
        usu1.descargarContenido(contenido3);

        // Segunda prueba
        usu2.descargarContenido(contenido1);
        usu2.reproducirContenido(contenido3);
        usu2.reproducirContenido(contenido2);
        usu2.reproducirContenido(contenido2);
        usu2.agregarFavorito(contenido1);

        // Tercera prueba
        StreamX.generarReporte();
        StreamX.buscarPorGenero("Ciencia Ficción");


    }
}
