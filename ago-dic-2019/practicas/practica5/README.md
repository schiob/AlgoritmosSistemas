# Practica 5 - Mas ordenamiento

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