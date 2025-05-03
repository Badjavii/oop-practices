package abstractclasses;

// Definition of abstract class. In spanish its called "MaterialLibreria"
public abstract class User {
    private int id;
    private String name;
    private String mail;
    private boolean active;

    // Constructor
    public User(int id, String name, String mail, boolean active) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.active = active;
    }

    // Definition of abstract method. In spanish its called "calcularLimitePrestamos"
    public abstract int calculateLoanLimit();

    // Definition of abstract method. In spanish its called "puedeReservar"
    public abstract boolean canReserve();

    // Definition Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // Definition Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public boolean isActive() {
        return active;
    }
}