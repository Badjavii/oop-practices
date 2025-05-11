package com.github.badjavii.vm01_LibraryManager.p05_Menus;

import extras.Loan;
import abstractclasses.User;
import abstractclasses.LibraryMaterial;
import extras.ConsoleUtils;

import java.util.List;

public class SubMenuLoans extends Library {

    public SubMenuLoans() {
        super();
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "SubMenuLoans initialized.");
    }

    private void addLoan(List<Loan> loans, List<User> users, List<LibraryMaterial> materials) {
        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\n\nEnter Loan ID: ");
        int id = ConsoleUtils.scanv(0, "int");

        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter User ID for the Loan: ");
        int userId = ConsoleUtils.scanv(0, "int");

        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter Material ID for the Loan: ");
        int materialId = ConsoleUtils.scanv(0, "int");

        User loanUser = null;
        for (User user : users) {
            if (user.getId() == userId) {
                loanUser = user;
                break;
            }
        }

        LibraryMaterial loanMaterial = null;
        for (LibraryMaterial material : materials) {
            if (material.getId() == materialId) {
                loanMaterial = material;
                break;
            }
        }

        if (loanUser == null) {
            ConsoleUtils.printlnf(ConsoleUtils.RED, "\nUser not found.\n");
            return;
        }

        if (loanMaterial == null) {
            ConsoleUtils.printlnf(ConsoleUtils.RED, "\nMaterial not found.\n");
            return;
        }

        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter Loan Status (e.g., 'active', 'completed'): ");
        String status = ConsoleUtils.scanv("", "string");

        loans.add(new Loan(id, loanUser, loanMaterial, status));
        ConsoleUtils.printlnf(ConsoleUtils.GREEN, "\nLoan added successfully!\n");
    }

    private void showLoans(List<Loan> loans) {
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n=== Current Loans ===\n");

        if (loans.isEmpty()) {
            ConsoleUtils.printlnf(ConsoleUtils.RED, "No loans found.\n");
            return;
        }

        for (Loan loan : loans) {
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "\n- Loan ID: " + loan.getId());
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "  User: " + loan.getUser().getName());
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "  Material: " + loan.getBorrowedMaterial());
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "  Loan Date: " + loan.getLoanDate());
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "  Estimated Return Date: " + loan.getEstimatedReturnDate());
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "  Actual Return Date: " + (loan.getActualReturnDate() == null ? "Pending" : loan.getActualReturnDate()));
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "  Status: " + loan.getStatus());
        }
    }

    private void deleteLoan(List<Loan> loans) {
        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter Loan ID to delete: ");
        int id = ConsoleUtils.scanv(0, "int");

        Loan targetLoan = null;
        for (Loan loan : loans) {
            if (loan.getId() == id) {
                targetLoan = loan;
                break;
            }
        }

        if (targetLoan != null) {
            loans.remove(targetLoan);
            ConsoleUtils.printlnf(ConsoleUtils.GREEN, "\nLoan deleted successfully!\n");
        } else {
            ConsoleUtils.printlnf(ConsoleUtils.RED, "\nLoan not found.\n");
        }
    }

    private void showMenu() {
        ConsoleUtils.clear_screen();
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n\n\t=== Loan Management Menu ===");
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n1. Add Loan");
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n2. Show Loans");
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n3. Delete Loan");
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n0. EXIT");
    }

    public void mainMenu(List<Loan> loans, List<User> users, List<LibraryMaterial> materials) {
        int option = -1;

        while (option != 0) {
            showMenu();
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "\nSelect Option: ");
            option = ConsoleUtils.scanv(0, "int");

            switch (option) {
                case 1:
                    addLoan(loans, users, materials);
                    break;
                case 2:
                    showLoans(loans);
                    break;
                case 3:
                    deleteLoan(loans);
                    break;
                case 0:
                    ConsoleUtils.printlnf(ConsoleUtils.GREEN, "\nExiting Loan Management Menu...\n");
                    break;
                default:
                    ConsoleUtils.printlnf(ConsoleUtils.RED, "\nInvalid option. Try again.\n");
            }
            ConsoleUtils.pause_terminal();
        }
    }
}