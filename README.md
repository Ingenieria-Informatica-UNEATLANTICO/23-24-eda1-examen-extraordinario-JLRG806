# Refactorización del modelo

> Parte 1 - in plan english

Para refactorizar el modelo con el objetivo de permitir mayor flexibilidad, podemos introducir estructuras de datos más avanzadas que las matrices simples. Utilizaremos listas (GenericList) para manejar los elementos de la hamburguesa. Esto permitirá agregar y eliminar elementos fácilmente, y también reorganizarlos si es necesario.

### Explicación de los cambios:

> Parte 2 - Dev...

- *Métodos `mostrar`, `describir` y `agregarExtra`*: Se adaptaron para iterar sobre la GenericList de extras en lugar de una matriz.

- *Constructor*: El constructor ya no requiere un número fijo de extras, ya que GenericList manejará dinámicamente el tamaño de la colección de extras.

- *Uso de `GenericList` para los extras*: En lugar de una matriz fija, usamos GenericList, que permite dinámicamente agregar y quitar elementos.

- *Método `quitarExtra`*: Se ha añadido un método para eliminar un extra específico de la lista.

- *Método `reorganizarExtras`*: Se ha añadido un método para reorganizar los extras dentro de la lista, intercambiando posiciones entre dos índices dados.

- *Método `insertarExtra`*: Se ha añadido un metodo para insertar los extras dentro de la lista en un indice especificado

### Pruebas del codigo

En la clase `Restaurante` se ha colocado trasabilidad y uso de las nuevas funcionalidades que tiene la hamburguesa, para identificar las pruebas en la linea 15 se inicia hasta la linea 47.
