#### Introducción:
En este ejercicio, desarrollarás un sistema de gestión de una tienda de videojuegos que abarque conceptos de herencia, interfaces y polimorfismo. Se espera que puedas crear una jerarquía de clases para diferentes tipos de videojuegos y que implementes interfaces para manejar ciertas funcionalidades comunes. También deberás demostrar cómo se puede utilizar el polimorfismo en este contexto.

#### Requisitos del Sistema:

1. **Clases Base y Herencia:**
    - Crea una clase abstracta `Videojuego` con los siguientes atributos:
        - `titulo` (String)
        - `genero` (String)
        - `plataforma` (String)
        - `precio` (double)
    - Define los métodos abstractos:
        - `iniciarJuego()`: Realiza una acción para iniciar el juego.
        - `detenerJuego()`: Realiza una acción para detener el juego.

2. **Clases Derivadas:**
    - Crea una clase `JuegoConsola` que extienda `Videojuego`. Esta clase debe tener un atributo adicional `numeroJugadores` (int).
    - Crea una clase `JuegoPC` que extienda `Videojuego`. Esta clase debe tener un atributo adicional `requisitosSistema` (String).
    - Crea una clase `JuegoMovil` que extienda `Videojuego`. Esta clase debe tener un atributo adicional `tamanoArchivo` (double) en MB.

3. **Interfaces:**
    - Define una interfaz `Multijugador` con los siguientes métodos:
        - `conectar()`: Realiza una acción para conectar a la sesión multijugador.
        - `desconectar()`: Realiza una acción para desconectar de la sesión multijugador.
    - Crea clases `JuegoConsolaMultijugador` y `JuegoPCMultijugador` que extiendan `JuegoConsola` y `JuegoPC` respectivamente, y que implementen la interfaz `Multijugador`.

4. **Polimorfismo:**
    - Implementa un método `mostrarDetalles(Videojuego juego)` que acepte cualquier objeto de tipo `Videojuego` y muestre sus detalles (titulo, genero, plataforma, precio).
    - Implementa una lista de videojuegos en la clase principal y demuestra cómo se puede utilizar el polimorfismo para interactuar con diferentes tipos de videojuegos.

#### Reglas y Restricciones:

- La clase abstracta `Videojuego` debe tener un constructor que inicialice los atributos `titulo`, `genero`, `plataforma` y `precio`.
- Las clases derivadas (`JuegoConsola`, `JuegoPC`, `JuegoMovil`) deben implementar los métodos abstractos de `Videojuego`.
- Las clases que implementan la interfaz `Multijugador` deben proporcionar su propia implementación de los métodos `conectar()` y `desconectar()`.
- La clase principal del sistema debe contener un método `main` donde se creen instancias de los diferentes tipos de videojuegos y se demuestre el uso de herencia, interfaces y polimorfismo.

#### Ejemplo de Uso:

- Crear instancias de `JuegoConsolaMultijugador`, `JuegoPCMultijugador`, `JuegoConsola`, `JuegoPC`, y `JuegoMovil`.
- Iniciar y detener los videojuegos.
- Mostrar detalles de cada videojuego utilizando el método `mostrarDetalles`.
- Demostrar cómo los videojuegos que implementan `Multijugador` pueden conectar y desconectar de una sesión multijugador.

Este ejercicio te permitirá practicar y entender mejor los conceptos de herencia, interfaces y polimorfismo en Java, mientras desarrollas un sistema funcional para la gestión de una tienda de videojuegos.