package Menus;
import abstractclasses.LibraryMaterial;
import extras.ConsoleUtils;
import java.util.List;
import materials.Book;
import materials.DigitalResources;
import materials.Magazine;

public class SubMenuMaterials extends Library {

    public SubMenuMaterials() {
        super();
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "SubMenuMaterials initialized.");
    }

    private void addMaterial(List<LibraryMaterial> materials) {
        // Solicitar tipo de material
        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\n\nEnter material type (1. Book, 2. Digital Resource, 3. Magazine): ");
        int materialType = ConsoleUtils.scanv(0, "int");

        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter material title: ");
        String title = ConsoleUtils.scanv("", "string");

        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter material ID: ");
        int id = ConsoleUtils.scanv(0, "int");

        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter publication year: ");
        int year = ConsoleUtils.scanv(0, "int");

        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nIs the material reserved (true/false)?: ");
        boolean reserved = ConsoleUtils.scanv(false, "boolean");

        LibraryMaterial newMaterial = null;

        switch (materialType) {
            case 1: // Book
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter book author: ");
                String author = ConsoleUtils.scanv("", "string");

                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter book editor: ");
                String editor = ConsoleUtils.scanv("", "string");

                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter book ISBN: ");
                String isbn = ConsoleUtils.scanv("", "string");

                newMaterial = new Book(id, year, title, reserved, author, editor, isbn);
                break;

            case 2: // Digital Resources
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter resource URL: ");
                String url = ConsoleUtils.scanv("", "string");

                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter resource format: ");
                String format = ConsoleUtils.scanv("", "string");

                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter resource size (MB): ");
                int size = ConsoleUtils.scanv(0, "int");

                newMaterial = new DigitalResources(id, year, title, reserved, url, format, size);
                break;

            case 3: // Magazine
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter magazine volume: ");
                int volume = ConsoleUtils.scanv(0, "int");

                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter magazine editor: ");
                int magazineEditor = ConsoleUtils.scanv(0, "int");

                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter magazine ISSN: ");
                String issn = ConsoleUtils.scanv("", "string");

                newMaterial = new Magazine(id, year, title, reserved, volume, magazineEditor, issn);
                break;

            default:
                ConsoleUtils.printlnf(ConsoleUtils.RED, "\nInvalid material type. Returning to menu.\n");
                return;
        }

        // Agregar material a la lista
        materials.add(newMaterial);
        ConsoleUtils.printlnf(ConsoleUtils.GREEN, "\nMaterial added successfully!\n");
    }

    private void showMaterials(List<LibraryMaterial> materials) {
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n=== Current Materials ===\n");

        if (materials.isEmpty()) {
            ConsoleUtils.printlnf(ConsoleUtils.RED, "No materials found.\n");
            return;
        }

        for (LibraryMaterial material : materials) {
            // Mostrar atributos comunes
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "\n- Material ID: " + material.getId());
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "  Title: " + material.getTitle());
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "  Publication Year: " + material.getYear());
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "  Reserved: " + (material.isReserved() ? "Yes" : "No"));

            // Mostrar atributos específicos según el tipo
            if (material instanceof Book) {
                Book book = (Book) material; // Casting a Book
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Type: Book");
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Author: " + book.getAuthor());
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Editor: " + book.getEditor());
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  ISBN: " + book.getIsbn());
            } else if (material instanceof DigitalResources) {
                DigitalResources digital = (DigitalResources) material; // Casting a DigitalResources
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Type: Digital Resource");
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  URL: " + digital.getUrl());
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Format: " + digital.getFormat());
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Size: " + digital.getSize() + " MB");
            } else if (material instanceof Magazine) {
                Magazine magazine = (Magazine) material; // Casting a Magazine
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Type: Magazine");
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Volume: " + magazine.getVolume());
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Editor: " + magazine.getEditor());
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  ISSN: " + magazine.getIssn());
            } else {
                ConsoleUtils.printlnf(ConsoleUtils.RED, "  Unknown material type.");
            }
        }
    }

    private void deleteMaterial(List<LibraryMaterial> materials) {
        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter the ID of the material to delete: ");
        int id = ConsoleUtils.scanv(0, "int");

        LibraryMaterial targetMaterial = null;
        for (LibraryMaterial material : materials) {
            if (material.getId() == id) {
                targetMaterial = material;
                break;
            }
        }

        if (targetMaterial != null) {
            materials.remove(targetMaterial);
            ConsoleUtils.printlnf(ConsoleUtils.GREEN, "\nMaterial deleted successfully!\n");
        } else {
            ConsoleUtils.printlnf(ConsoleUtils.RED, "\nMaterial not found.\n");
        }
    }

    private void showMenu() {
        ConsoleUtils.clear_screen();
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n\n\t=== Materials Management Menu ===");
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n1. Add Material");
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n2. Show Materials");
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n3. Delete Material");
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n0. EXIT");
    }

    public void mainMenu(List<LibraryMaterial> materials) {
        int option = -1;

        while (option != 0) {
            showMenu();
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "\nSelect Option: ");
            option = ConsoleUtils.scanv(0, "int");

            switch (option) {
                case 1:
                    addMaterial(materials);
                    break;
                case 2:
                    showMaterials(materials);
                    break;
                case 3:
                    deleteMaterial(materials);
                    break;
                case 0:
                    ConsoleUtils.printlnf(ConsoleUtils.GREEN, "\nExiting Materials Management Menu...\n");
                    break;
                default:
                    ConsoleUtils.printlnf(ConsoleUtils.RED, "\nInvalid option. Try again.\n");
            }
            ConsoleUtils.pause_terminal();
        }
    }
}