
public class Main {
    public static void main(String[] args) {
        ContenidoMultimedia peli1 = new Pelicula("deadpool", 7, "romance", "Javier", ResolutionType._4K);
        ContenidoMultimedia peli2 = new Pelicula("son como ninos", 10, "accion", "dani", ResolutionType.HD);


        User usu1 = new User("Javi", 2000);
        usu1.agregarFavorito(peli1);
        usu1.agregarFavorito(peli2);

        System.out.println(usu1.);
    }
}