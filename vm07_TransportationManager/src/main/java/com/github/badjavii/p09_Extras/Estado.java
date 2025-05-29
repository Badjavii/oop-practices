package com.github.badjavii.p09_Extras;

/**
 * @enum Estado
 * @brief Ennumerado para representar a los estados de un vehiculo en el sistema de transporte
 * 
 * @attrs:
 *      @op DISPONIBLE      // Vehiculo se encuentra disponible para su uso
 *      @op EN_SERVICIO     // Vehiculo se encuentra en servicio (ya esta usado)
 *      @op FUERA_SERVICIO  // Vehiculo se encuentra fuera de servicio 
*/

public enum Estado {
    DISPONIBLE,
    EN_SERVICIO,
    FUERA_SERVICIO
}
