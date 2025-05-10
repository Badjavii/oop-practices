# Sistema de Gestión de Plataforma de Streaming Multimedia

**Objetivo:** Diseñar e implementar un sistema orientado a objetos para gestionar una plataforma de streaming de contenido multimedia, utilizando interfaces, clases abstractas, herencia, polimorfismo y manejo de excepciones. El sistema debe ser modular, extensible y reflejar un diseño robusto que permita la incorporación de nuevos tipos de contenido en el futuro.

## Descripción del Sistema
El sistema simula una plataforma de streaming (similar a Netflix o Spotify) que gestiona diferentes tipos de contenidos multimedia (películas, series y audiolibros) y sus interacciones con usuarios. Los contenidos comparten comportamientos comunes pero tienen características y reglas específicas. Los usuarios pueden reproducir, descargar (en ciertos casos) y marcar contenidos como favoritos, mientras que la plataforma proporciona reportes sobre popularidad y estadísticas.

## Requisitos del Sistema

1. Interfaz ContenidoReproducible:
   - Define métodos para todos los contenidos multimedia:
     - reproducir(): Inicia la reproducción del contenido.
     - pausar(): Pausa la reproducción.
     - obtenerDuracion(): Retorna la duración en minutos (int).
     - obtenerTitulo(): Retorna el título del contenido (String).
     - obtenerGenero(): Retorna el género del contenido (String).
     - esFavorito(): Retorna si el contenido está marcado como favorito (boolean).
   - Todos los tipos de contenido deben implementar esta interfaz.
2. Interfaz ContenidoDescargable:
   - Define métodos para contenidos que pueden descargarse:
     - descargar(): Retorna el tamaño del contenido en MB (double). 
     - verificarEspacioRequerido(): Verifica si hay suficiente espacio para la descarga; lanza una excepción si no lo hay. 
   - Solo ciertos contenidos (películas y audiolibros) implementan esta interfaz.
3. Clase abstracta ContenidoMultimedia:
   - Implementa ContenidoReproducible.
     - Atributos:
       - titulo (String): Nombre del contenido.
       - genero (String): Género del contenido. 
       - duracion (int): Duración en minutos. 
       - vecesReproducido (int): Contador de reproducciones. 
       - esFavorito (boolean): Indica si está en la lista de favoritos de algún usuario. 
     - Métodos implementados:
       - reproducir(): Incrementa vecesReproducido y muestra un mensaje de reproducción. 
       - pausar(): Muestra un mensaje de pausa. 
       - obtenerDuracion(), obtenerTitulo(), obtenerGenero(), esFavorito(): Retornan los valores de los atributos correspondientes. 
       - registrarInteraccion() (protegido): Registra interacciones para uso interno. 
     - Método abstracto:
       - calcularPuntuacion(): Cada tipo de contenido define su propia lógica para calcular una puntuación de popularidad.
4. Clases concretas que heredan de ContenidoMultimedia:
   - Pelicula:
     - Implementa ContenidoDescargable. 
     - Atributos adicionales:
       - director (String): Nombre del director. 
       - resolucion (String): Resolución del video (ej. "4K", "HD"). 
       - calcularPuntuacion(): Retorna vecesReproducido * 0.5 + (10 si es 4K, 0 si no). 
       - descargar(): Retorna el tamaño en MB según la resolución (ej. 5000 MB para 4K, 2000 MB para HD). 
       - verificarEspacioRequerido(): Lanza EspacioInsuficienteException si el espacio disponible es menor al requerido. 
     - Serie:
       - No implementa ContenidoDescargable. 
       - Atributos adicionales:
         - temporadas (int): Número de temporadas. 
         - episodiosPorTemporada (int): Episodios por temporada. 
         - calcularPuntuacion(): Retorna vecesReproducido * 0.3 + 5 * temporadas. 
     - Audiolibro:
       - Implementa ContenidoDescargable.
       - Atributos adicionales:
         - narrador (String): Nombre del narrador. 
         - tamanoMB (double): Tamaño del archivo en MB. 
         - calcularPuntuacion(): Retorna vecesReproducido * 0.2. 
         - descargar(): Retorna tamanoMB. 
         - verificarEspacioRequerido(): Lanza EspacioInsuficienteException si el espacio disponible es menor a tamanoMB.
5. Clase Usuario:
   - Atributos:
     - nombre (String): Nombre del usuario. 
     - espacioDisponible (double): Espacio de almacenamiento en MB. 
     - listaFavoritos (lista): Lista de contenidos marcados como favoritos (ContenidoReproducible). 
   - Métodos:
     - agregarFavorito(ContenidoReproducible): Añade un contenido a listaFavoritos y actualiza su atributo esFavorito. 
     - descargarContenido(ContenidoDescargable): Verifica si el contenido es descargable, ejecuta verificarEspacioRequerido() y, si es de éxito, reduce espacioDisponible según el tamaño retornado por descargar(). 
     - reproducirContenido(ContenidoReproducible): Ejecuta el método reproducir() del contenido.
6. Clase PlataformaStreaming:
   - Atributos:
     - nombre (String): Nombre de la plataforma. 
     - contenidos (lista): Lista de ContenidoReproducible. 
     - usuarios (lista): Lista de Usuario. 
   - Métodos:
     - agregarContenido(ContenidoReproducible): Añade un contenido a la plataforma. 
     - agregarUsuario(Usuario): Añade un usuario. 
     - obtenerContenidoMasPopular(): Retorna el contenido con mayor valor de calcularPuntuacion(). 
     - buscarPorGenero(String genero): Retorna una lista de contenidos que coinciden con el género especificado. 
     - generarReporte(): Genera un resumen con:
       - Contenido más popolare.
       - Número total de reproducciones en la plataforma.
       - Promedio de puntuaciones de todos los contenidos.

## Tareas a Realizar

1. Implementación:
   - Implemente el sistema en un lenguaje de programación orientado a objetos (Java, Python, C#, etc.). 
   - Asegúrese de aplicar:
     - Encapsulamiento: Atributos privados con getters y setters. 
     - Herencia: Uso de clases abstractas y especialización en clases concretas. 
     - Polimorfismo: Manejo de diferentes tipos de contenido a través de interfaces y clases base. 
     - Manejo de excepciones: Uso de try-catch para gestionar errores. 
     - Modularidad: Diseño que permita agregar nuevos tipos de contenido sin modificar el código existente. 
2. Programa Principal:
   - Cree una clase principal que simule el funcionamiento del sistema con el siguiente escenario:
     - Instancie una plataforma de streaming llamada "StreamX". 
     - Cree al menos dos usuarios con diferentes espacios disponibles (ej. Ana con 1000 MB, Bob con 6000 MB). 
     - Añada al menos tres contenidos:
       - Una película (ej. "Inception", género "Ciencia Ficción", 148 min, 4K). 
       - Una serie (ej. "Stranger Things", género "Ciencia Ficción", 3 temporadas, 8 episodios por temporada). 
       - Un audiolibro (ej. "Dune", género "Ficción", 500 MB). 
     - Simule interacciones:
       - Ana intenta descargar el audiolibro (debe lanzar EspacioInsuficienteException). 
       - Bob descarga la película y el audiolibro, reproduce la serie dos veces y marca la película como favorita. 
     - Muestre un reporte con:
       - El contenido más popular. 
       - Los contenidos del género "Ciencia Ficción". 
       - El resumen de la plataforma (total de reproducciones y promedio de puntuaciones). 
3. Entregables:
   - Código fuente completo, organizado en paquetes o módulos. 
   - Documentación breve (en comentarios o un archivo aparte) que explique el diseño y las decisiones tomadas. 
   - Ejemplo de salida del programa principal que muestre el escenario descrito.