package com.github.badjavii.vm01_LibraryManager.p03_Extras;

import java.time.LocalDate;
import abstractclasses.User;
import abstractclasses.LibraryMaterial;

public class Loan {
    private int id;
    private User user;
    private LibraryMaterial material;
    private String borrowedMaterial, status;
    private LocalDate LoanDate, EstimatedReturnDate, ActualReturnDate;

    // Constructor
    public Loan(int id, User user, LibraryMaterial material, String status) {
        this.id = id;
        this.user = user;
        this.material = material;
        this.borrowedMaterial = material.getTitle(); // Se obtiene el título desde el material
        this.status = status;
        this.LoanDate = LocalDate.now(); // Fecha del préstamo: hoy
        this.EstimatedReturnDate = LoanDate.plusDays(7); // Fecha estimada: 7 días después
        this.ActualReturnDate = null; // No hay fecha de devolución inicial (pendiente)
    }

    // Getters
    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public LibraryMaterial getMaterial() {
        return material;
    }

    public String getBorrowedMaterial() {
        return borrowedMaterial;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getLoanDate() {
        return LoanDate;
    }

    public LocalDate getEstimatedReturnDate() {
        return EstimatedReturnDate;
    }

    public LocalDate getActualReturnDate() {
        return ActualReturnDate;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setMaterial(LibraryMaterial material) {
        this.material = material;
        this.borrowedMaterial = material.getTitle();
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setActualReturnDate(LocalDate actualReturnDate) {
        ActualReturnDate = actualReturnDate;
    }
}