package com.github.badjavii.vm01_LibraryManager.p04_Materials;
import abstractclasses.LibraryMaterial;
import interfaces.Catalogable;

// Definition of extended class. In spanish its called "RecursosDigitales"
public class DigitalResources extends LibraryMaterial implements Catalogable{

    // Atributos Adicionales
    private String url;
    private String format;
    private int size;

    // Constructor
    public DigitalResources(int id, int year, String title, boolean reserved, String url, String format, int size) {
        super(id, year, title, reserved);
        this.url = url;
        this.format = format;
        this.size = size;
    }

    // Getters
    public String getUrl() {
        return url;
    }

    public String getFormat() {
        return format;
    }

    public int getSize() {
        return size;
    }

    // Setters
    public void setUrl(String url) {
        this.url = url;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setSize(int size) {
        this.size = size;
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
}