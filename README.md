
# Ejercicios Desarrollo Software Tema 1 y 2 

### 03/04/2024

## 1 Identifica el Patrón de Diseño Software

1. Patrón que especifique un mecanismo para construir un complejo objeto paso a paso,
    donde se necesitan diferentes representaciones del objeto para diferentes procesos de
    pedido en un restaurante online.
2. Desarrolle un marco para juegos que permita extender f acilmente el tipo de personajes
    disponibles, sin cambiar el codigo que añade nuevos personajes al juego.
3. Construya un sistema de edicion de graficos que debe permitir al usuario crear objetos
    personalizados y luego duplicarlos sin conocer los detalles de como se crean o estructuran.
4. Implemente un gestor de configuracion para su aplicacion que asegure que solo haya una
    instancia de la configuracion en toda la aplicacion y que sea accesible globalmente.
5. Integre una librería de procesamiento de imagenes de terceros en su aplicacion de galería,
    pero la interfaz de la librería no es compatible con el sistema actual de su aplicacion.
6. Desarrolle un sistema de archivos donde archivos y carpetas puedan ser tratados de
    manera uniforme.
7. Implemente un sistema de pedidos de cafe donde se pueda añadir dinamicamente nuevos
    complementos y variantes a los cafes sin alterar las clases existentes.
8. Cree una interfaz simple para el complejo sistema de subcomponentes de un home
    theater que incluye el proyector, amplificador, reproductor de DVD y las luces de la
    habitacion.
9. Desarrolle un sistema de alertas meteorologicas donde los usuarios puedan recibir actu-
    alizaciones en tiempo real cuando se emitan nuevas previsiones.
10. Diseñe un sistema de navegacion que pueda calcular la ruta entre dos puntos utilizando
diferentes algoritmos de ruta como el mas rapido, el mas corto y el mas economico.
11. Imagine que es un ingeniero de software encargado de simplificar la interaccion de los
usuarios con un sistema de reservacion de viajes, que incluye multiples componentes
como reservacion de vuelos, hoteles y alquiler de autos. Cada uno de estos componentes
tiene su propio sistema de interfaz complicado.

#### 1


## 2 Identificar Patrón de diseño, realizar diagrama UML, código de las clases y un main()

1. Necesitas diseñar un sistema de gestion de tareas para un equipo de proyecto. Las tareas
    pueden ser simples o complejas, lasultimas consisten en sub-tareas. Debes permitir que
    las tareas simples y las tareas compuestas sean tratadas de la misma manera.
2. Estas creando un simulador de trafico que debe poder a diferentes distancias (euclidea,
    manhatan y distancia coseno). El usuario podra elegir que distancia ejecutar en tiempo
    de ejecucion para ir desde un punto A a otro punto B.
3. Una empresa de cafe desea una aplicacion que pueda añadir ingredientes adicionales a
    una orden de cafe. Cada adicion (leche, azucar, crema, etc.) agrega un costo adicional
    y la descripcion del cafe debe actualizarse en consecuencia. La solucion debe permitir
    añadir nuevos ingredientes sin cambiar el codigo existente de las clases de cafe.
4. Desarrolle una aplicacion para personalizar vehículos. Cree la clase base Vehiculo con
    un metodo costo y descripcion. Extienda esta funcionalidad con clases adicionales como
    ConGPS, ConPinturaEspecial y ConAsientosDeLujo que agreguen comportamientos y
    costos adicionales. Estas clases deben poder envolver objetos de tipo Vehiculo y modi-
    ficar su comportamiento sin cambiar la clase Vehiculo original.
5. Una aplicacion de blog necesita generar diferentes tipos de publicaciones: Artículo,
    Noticia, y Entrevista. Cada tipo de publicacion tiene un metodo publicar que difiere en
    su comportamiento. Diseña un sistema que permita la creacion de estas publicaciones
    sin determinar específicamente la clase de publicacion en el codigo cliente.
       - Implementar las clases Publicacion, Articulo, Noticia, y Entrevista, todas con el
          metodo publicar.
       - Crear un metodo o clase Creador que, dependiendo de un parametro o contexto
          dado, instancie y retorne el tipo de publicacion adecuado.
6. Para un juego de estrategia, se requiere un sistema para crear copias exactas de unidades
    de combate sin conocer sus clases específicas. Las unidades tienen estados y compor-
    tamientos que pueden ser duplicados. Implementa este sistema asegurando que el pro-
    ceso de duplicacion sea eficiente y seguro.
       - Implementar la interfaz correspondiente.
       - Crear clases concretas Infanteria, Arquero, y Caballeria que permitan crear otras
          copias a partir de ellas.
7. Un sistema de analisis de datos trabaja con diferentes proveedores de datos. Uno de
    los proveedores suministra los datos en un formato incompatible con el sistema actual.
    Implementa una solucion que permita al sistema utilizar los datos de este proveedor sin
    cambiar el codigo fuente del sistema de analisis.
       - Crear una interfaz ProveedorDatos que el sistema de analisis utiliza para leer datos.
       - Implementar una clase AdaptadorProveedorDatos que convierte los datos del provee-
          dor incompatible a un formato que el sistema de analisis puede utilizar.

#### 2


