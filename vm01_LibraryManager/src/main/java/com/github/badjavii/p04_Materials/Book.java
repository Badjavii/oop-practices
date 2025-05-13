package com.github.badjavii.vm01_LibraryManager.p04_Materials;
import abstractclasses.LibraryMaterial;
import abstractclasses.User;
import interfaces.Loanable;
import interfaces.Catalogable;

import java.time.LocalDate;

// Definition of extended class. In spanish its called "Libro"
public class Book extends LibraryMaterial implements Loanable, Catalogable {

    // Additional attributes
    private String author;
    private String editor;
    private String isbn;

    // Constructor
    public Book(int id, int year, String title, boolean reserved, String author, String editor, String isbn) {
        super(id, year, title, reserved);
        this.author = author;
        this.editor = editor;
        this.isbn = isbn;
    }

    // Getters
    public String getAuthor() {
        return author;
    }

    public String getEditor() {
        return editor;
    }

    public String getIsbn() {
        return isbn;
    }

    // Setters
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Implementation of abstract methods of Materials.LibraryMaterial class
    @Override
    public void calculateLoanTime() {

    }

    @Override
    public void generateCatalogCode() {

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

}