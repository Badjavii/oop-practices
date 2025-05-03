package Menus;
import abstractclasses.LibraryMaterial;
import abstractclasses.User;
import extras.ConsoleUtils;
import extras.Loan;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<LibraryMaterial> materials;
    private List<User> users;
    private List<Loan> loans;

    SubMenuUsers userManager = new SubMenuUsers();
    SubMenuMaterials materialManager = new SubMenuMaterials();
    SubMenuLoans loansManager = new SubMenuLoans();

    // Constructor
    public Library() {
        this.materials = new ArrayList<>();
        this.users = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    private void showMenu (){
        ConsoleUtils.clear_screen();
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n\n\t=== Library System Menu ===");
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n1. Users Management");
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n2. Materials Management");
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n3. Loans Management");
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n0. EXIT");
    }

    public void mainMenu (){
        Scanner input = new Scanner(System.in);
        int i = -1;

        while (i != 0){
            showMenu();
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "\n\nSelect Option: ");

            i = ConsoleUtils.scanv(i, "int");

            switch (i){
                case 1:
                    userManager.mainMenu(users);
                    break;
                case 2:
                    materialManager.mainMenu(materials);
                    break;
                case 3:
                    loansManager.mainMenu(loans, users, materials);
                case 0:
                    System.out.println("Closing program...");
                    break;
                default:


            }
            ConsoleUtils.pause_terminal();
        }
    }
}