package abstractclasses;
import interfaces.Comparable;

// Definition of abstract class. In spanish its called "MaterialLibreria"
public abstract class LibraryMaterial implements Comparable {
    private int id;
    private int year;
    private String title;
    private boolean reserved;

    // Constructor
    public LibraryMaterial(int id, int year, String title, boolean reserved) {
        this.id = id;
        this.year = year;
        this.title = title;
        this.reserved = reserved;
    }

    // Definition of abstract method. In spanish its called "calcularTiempoPrestamo"
    public abstract void calculateLoanTime();

    // Definition of abstract method. In spanish its called "generarCodigoCatalogo"
    public abstract void generateCatalogCode();

    // Definition Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    // Definition Getters
    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public boolean isReserved() {
        return reserved;
    }

    @Override
    public String toString() {
        return "MaterialBiblioteca{" +
                "id=" + id +
                ", year=" + year +
                '}';
    }

}