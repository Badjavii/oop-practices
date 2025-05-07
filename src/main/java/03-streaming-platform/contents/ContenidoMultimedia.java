import interfaces.ContenidoReproducible;


public abstract class ContenidoMultimedia implements ContenidoReproducible {

    // Atributos
    private String titulo;            // Nombre del contenido.
    private String genero;            // Género del contenido.
    private int duracion;             // Duración en minutos.
    private int vecesReproducido;     // Contador de reproducciones.
    private boolean esFavorito;       // Indica si está en la lista de favoritos de algún usuario.

    // Constructor
    public ContenidoMultimedia(String titulo, String genero, int duracion, int vecesReproducido, boolean esFavorito) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.vecesReproducido = vecesReproducido;
        this.esFavorito = esFavorito;
    }

    public ContenidoMultimedia(String titulo, String duracion, String genero){
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = Integer.parseInt(duracion);
        this.vecesReproducido = 0;
        this.esFavorito = false;
    }

    // Implementacion de metodos
    @Override
    public void reproducir() {
        vecesReproducido++; // Aumentar el valor de veces reproducidas
        System.out.println("Reproduciendo... ");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando... ");
    }

    @Override
    public int obtenerDuracion() {
        return duracion;
    }

    @Override
    public String obtenerTitulo() {
        return titulo;
    }

    @Override
    public String obtenerGenero() {
        return genero;
    }

    public int obtenerVecesReproducido() {
        return vecesReproducido;
    }

    @Override
    public boolean esFavorito() {
        return esFavorito;
    }

    // Setter
    public void setEsFavorito(boolean esFavorito) {
        this.esFavorito = esFavorito;
    }

    protected void registrarInteraccion(){
        System.out.println("Registrando interaccion...");
        System.out.println("Titulo: " + this.titulo);
    }

    // Metodo abstracto
    public abstract double calcularPuntuacion();

}