package com.github.badjavii.p02_Products;
import com.github.badjavii.p02_Products.extras.Material;

public class Accesorio extends Producto {
    private Material material;

    public Accesorio(Material material, int id, String nombre, double precioUnitario, int cantidadStock) {
        super(id, nombre, precioUnitario, cantidadStock);
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}