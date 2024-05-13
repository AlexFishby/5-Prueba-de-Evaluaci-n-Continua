# 5: Prueba de Evaluacion Continua

# Entrega 1

Este proyecto es una implementación del patrón de diseño Builder en Java. El proyecto consta de varias clases e interfaces que representan diferentes tipos de medios, como libros, revistas y periódicos.

## Clases e Interfaces

- `Media`: Esta es una interfaz que define un método `display()`.
- `Book`, `Magazine`, `Newspaper`: Estas son clases que implementan la interfaz `Media` y proporcionan su propia implementación del método `display()`.
- `MediaFactory`: Esta es una clase que se utiliza para crear instancias de diferentes tipos de medios.
- `MediaItem1`: Esta es una clase que utiliza el patrón de diseño Builder. Contiene un título, un autor, un año y un objeto `Media`. También tiene una clase interna `Builder` que se utiliza para crear instancias de `MediaItem1`. Localizada en el directorio "Común" ya que se usara en los futuros directorios.

## Cómo usar

Para crear una instancia de `MediaItem`, puedes usar el patrón Builder de la siguiente manera:

``` java
MediaItem item = new MediaItem.Builder()
    .setTitle("Some Title")
    .setAuthor("Some Author")
    .setYear(2022)
    .setMedia(new Book())
    .build();
```

# Entrega 2: Patrones de Estructuración

Este proyecto implementa los patrones de diseño Composite, Adapter y Observer en el contexto de una biblioteca de medios.

## Clases y su relación

### MediaComponent
Esta es una interfaz que define el método `display()`. Tanto `MediaItem1` como `MediaCollection` implementan esta interfaz.

### MediaItem1
Esta clase representa un medio individual. Implementa la interfaz `MediaComponent` y define campos para el título, el autor y el año, así como métodos para obtener y establecer estos valores.

### MediaCollection
Esta clase representa una colección de medios. Implementa la interfaz `MediaComponent` y mantiene una lista de `MediaComponent`. Puede agregar `MediaComponent` a la lista y mostrar todos los `MediaComponent` en la lista.

### MediaFormat y ExternalMediaFormat
`MediaFormat` es una interfaz que define el método `display()`. `ExternalMediaFormat` es una clase que representa un formato de medios externos y tiene un método `show()`. 

### MediaFormatAdapter
Esta clase se utiliza para adaptar `ExternalMediaFormat` a `MediaFormat`. Implementa `MediaFormat` y utiliza un objeto `ExternalMediaFormat` para implementar el método `display()`.

### Observer y User
`Observer` es una interfaz que define el método `update()`. `User` es una clase que implementa `Observer` y muestra un mensaje cuando se llama al método `update()`.

## Patrones de diseño utilizados

### Composite
El patrón Composite se utiliza para tratar tanto los medios individuales (`MediaItem1`) como las colecciones de medios (`MediaCollection`) de manera uniforme a través de la interfaz `MediaComponent`.

### Adapter
El patrón Adapter se utiliza para integrar diferentes formatos de archivos sin cambiar la interfaz de usuario. `MediaFormatAdapter` se utiliza para adaptar `ExternalMediaFormat` a `MediaFormat`.

### Observer
El patrón Observer se utiliza para notificar a los usuarios sobre nuevos lanzamientos o actualizaciones en sus suscripciones. `User` implementa `Observer` y se actualiza cuando se llama al método `update()`.
