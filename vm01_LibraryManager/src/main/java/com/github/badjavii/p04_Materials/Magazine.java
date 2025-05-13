package com.github.badjavii.vm01_LibraryManager.p04_Materials;
import abstractclasses.LibraryMaterial;
import abstractclasses.User;
import interfaces.Catalogable;
import interfaces.Loanable;

import java.time.LocalDate;

// Definition of extended class. In spanish its called "Revista"
public class Magazine extends LibraryMaterial implements Loanable, Catalogable {

    // Atributos Adicionales
    private int volume;
    private int editor;
    private String issn;

    // Constructor
    public Magazine(int id, int year, String title, boolean reserved, int volume, int editor, String issn) {
        super(id, year, title, reserved);
        this.volume = volume;
        this.editor = editor;
        this.issn = issn;
    }

    // Getters
    public int getVolume() {
        return volume;
    }

    public int getEditor() {
        return editor;
    }

    public String getIssn() {
        return issn;
    }

    // Setters
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setEditor(int editor) {
        this.editor = editor;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    // Implementation of abstract methods of Materials.LibraryMaterial class
    @Override
    public void calculateLoanTime() {

    }

    @Override
    public void generateCatalogCode() {

    }

    // Implementing Loanable interface methods
    @Override
    public void lend(User user, LocalDate loanDate) {

    }

    @Override
    public void returnIt(LocalDate returnDate) {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public double calculateFine(LocalDate returnDate) {
        return 0;
    }

    // Implementing Catalogable interface methods
    @Override
    public String generateBibliographicRecord() {
        return "";
    }

    @Override
    public void sortByCategory(String category) {

    }

    @Override
    public void updateLocation(String location) {

    }

}