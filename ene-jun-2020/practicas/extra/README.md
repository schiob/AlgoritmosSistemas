# Extra
El examen consta de 2 ejercicios cada uno con un valor de 15 puntos.

## Ejercicio 1 - Ordenando

Juan tiene un montón de libros que quiere leer, y quiere leer la mayor cantidad posible en un año así que empezará a leer sus libros empezando del más corto en adelante. El problema es que toda su biblioteca está desordenada, ayúdalo a ordenarla de menor a mayor tomando en cuenta el número de páginas que tiene cada libro.

### Input

La entrada será recibida por **STDIN**

Consiste en varias lineas, la primera tiene un entero **n** representado el número de libros que tiene Juan.

Después hay **n** líneas en la que cada una tiene un string y un entero separados por espacio representando el nombre del libro y el número de páginas que tiene.

### Output

Imprime a salida estandar **STDOUT** la lista con el nombre de los libros ordenados de menor a mayor.

### Ejemplos

#### Entrada
```
5
HarryPotter 245
GodelEscherBach 777
Flatland 96
Mistborn 541
CleanCode 469

```
#### Salida

```
Flatland HarryPotter CleanCode Mistborn GodelEscherBach
```

### Notas

Resuelve el problema haciendo una implementación de MergeSort.


# Ejercicio 2 - Buscando cosas

Ricardo le encantan las palabras, grades, pequeñas, con vocales y consonantes. Pero tú ya sabes eso, ya que le ayudaste a ordenar su lista de palabras faboritas en orden alfabético.

Le gustó tanto tu trabajo que ahora te pide que le ayudes a hacer un programa para buscar una palabra en esa lista para ver su posición.

### Input

La entrada será recibida por **STDIN**

Consiste en 2 lineas, la primera tiene un entero **n** y una palabra **s** separados por un espacio. **n** representa el número de palabras en la lista de Ricardo, y la pablabra **s** la palabra que está buscando.

En la segunda linea está la lista ordenada de forma alfabética con **n** palabras separados por espacio.

### Output

Imprime a salida estandar **STDOUT** la posición de la palabra en la lista o un -1 si no está en la lista.

### Ejemplos

#### Entrada
```
7 a12
a a12 b2 text2 text2a text2a2 text2a12
```
#### Salida

```
2
```

### Detalles
Usa el algoritmo de binary search ;)