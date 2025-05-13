package com.github.badjavii.vm01_LibraryManager.p01_Interfaces;
import java.time.LocalDate;
import abstractclasses.User;

import java.time.LocalDate;

// Definition of interface. In spanish its called "Prestable"
public interface Loanable {

    // Definition of method. In spanish its called "prestar"
    public void lend (User user, LocalDate loanDate);

    // Definition of method. In spanish its called "devolver"
    public void returnIt (LocalDate returnDate);

    // Definition of method. In spanish its called "estaDisponible"
    public boolean isAvailable ();

    // Definition of method. In spanish its called "estaPrestado"
    public double calculateFine (LocalDate returnDate);
}