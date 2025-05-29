package com.github.badjavii.p03_Conductor;

/**
 * @class Conductor
 * @type abstracto
 * @brief Clase para representar a un conductor en el sistema de transporte
 * 
 * @attrs:
 *      @obj direccion: String  // Direccion del conductor
 *      @obj nombre: String     // Nombre del conductor
 *      @obj licencia: String   // Licencia del conductor
 *      @std id: int            // ID del conductor 
 */

public abstract class Conductor {
    String nombre, licencia, direccion;
    int id;
    
    public Conductor (String nombre, String licencia, String direccion, int id){
        this.direccion = direccion;
        this.id = id;
        this.licencia = licencia;
        this.nombre = nombre;
    }
}
