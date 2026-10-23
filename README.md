Parte C. Retos
1. Escribe una versión de eliminarArtista que recorra con for-each y elimine dentro del ciclo. Úsala sobre Viaje
para eliminar a Nevado, copia la excepción y explica por qué ocurre.
java.util.ConcurrentModificationException
Ocurre porque se intenta modificar la estructura de la lista mientras se está recorriendo con un ciclo for-each. Java detecta este cambio concurrente por seguridad para evitar errores impredecibles en memoria.

4. Intenta crear un Puesto desde parqueadero.app. Copia el error y explica qué tiene que ver con la composición.
Puesto(int) is not public in parqueadero.modelo; cannot be accessed from outside package
Ocurre porque el constructor de Puesto tiene visibilidad de paquete (package-private), lo que impide que sea instanciado desde fuera. Esto refuerza la composición estricta donde solo el Parqueadero puede crear y gestionar sus propios puestos.

Preguntas
1. ¿Por qué ArrayList<int> no compila y ArrayList<Integer> sí?
Porque las colecciones en Java solo aceptan tipos de referencia (objetos), no tipos primitivos (int). Integer es la clase envolvente que permite tratar los enteros como objetos.

2. ¿Por qué eliminar a Nevado de Favoritas no lo eliminó de Viaje? ¿Qué relación muestra eso?
Porque aunque comparten las mismas instancias de canciones en memoria, cada playlist tiene su propio ArrayList independiente. Modificar una lista no afecta a la otra.

3. ¿Qué diferencia hay entre la relación Playlist–Cancion y la relación Parqueadero–Puesto?
La relación Playlist-Cancion es una agregación. La relación Parqueadero-Puesto es una composición.

4. ¿Por qué totalCanciones debe ser static y titulo no?
totalCanciones es estático porque pertenece a la clase y lleva la cuenta global de todas las canciones creadas. titulo no es estático porque cada objeto Cancion individual necesita tener su propio valor único e independiente.

5. ¿Por qué un método static no puede usar this?
Porque this hace referencia al objeto actual en ejecución, mientras que los miembros estáticos pertenecen a la clase en general y pueden ser llamados sin necesidad de instanciar ningún objeto.
