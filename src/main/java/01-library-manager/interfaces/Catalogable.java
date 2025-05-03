package interfaces;

// Definition of interface. In spanish its called "Catalogable"
public interface Catalogable {

    // Definition of method. In spanish its called "generarFichaBibliografica"
    public String generateBibliographicRecord ();

    // Definition of method. In spanish its called "clasificarPorCategoria"
    public void sortByCategory (String category);

    // Definition of method. In spanish its called "actualizarUbicacion"
    public void updateLocation (String location);
}