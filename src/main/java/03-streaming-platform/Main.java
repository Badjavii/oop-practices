
public class Main {
    public static void main(String[] args) {

        // Crear instancias
        PlataformaStreamming StreamX =  new PlataformaStreamming("StreamX");
        User usu1 = new User("Ana", 1000);
        User usu2 = new User("Bob", 6000);
        ContenidoMultimedia contenido1 = new Pelicula("Inception", "148", "Ciencia Ficcion", "Javi", ResolutionType._4K);
        ContenidoMultimedia contenido2 = new Serie("Stranger Things", "100", "Ciencia Ficción", 3, 8);
        ContenidoMultimedia contenido3 = new Audiolibro("Dune", "100", "Ficción", "Javi", 500);

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
