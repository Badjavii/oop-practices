package com.github.badjavii.p02_Vehiculo;
import com.github.badjavii.p09_Extras.Estado;

/**
 * @class Vehiculo
 * @type abstracto
 * @brief Clase para representar a un vehiculo en el sistema de transporte
 * 
 * @attrs:
 *      @obj matricula: String  // Matricula del vehiculo
 *      @obj modelo: String     // Modelo del vehiculo
 *      @obj marca: String      // Marca del vehiculo
 *      @std capacidad: double  // Capacidad del vehiculo (expresado en toneladas)
 *      @prs estado: Estado     // Estado del vehiculo (disponible, en servicio, fuera de servicio)
*/

public abstract class Vehiculo {
    String matricula, modelo, marca;
    double capacidad;
    Estado estado;
    
    public Vehiculo (String matricula, String modelo, String marca, double capacidad, Estado estado){
        this.capacidad = capacidad;
        this.estado = estado;
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
    }
}
