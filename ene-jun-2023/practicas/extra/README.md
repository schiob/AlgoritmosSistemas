# Ejercicio 1 - Ordenando

Juan tiene un montón de libros que quiere leer, y quiere leer la mayor cantidad posible en un año así que empezará a leer sus libros empezando del más corto en adelante. El problema es que toda su biblioteca está desordenada, ayúdalo a ordenarla de menor a mayor tomando en cuenta el número de páginas que tiene cada libro.

Una vez tengas los libros ordenados Juan te preguntará por la posición de algunos de ellos, busca su posición y muéstrala.

### Input

La entrada será recibida por **STDIN**

Consiste en varias lineas, la primera tiene dos enteros, el primer entero **n** representado el número de libros que tiene Juan, y el segundo entero **m** es el número de busquedas que hace después.

Después hay **n** líneas en la que cada una tiene un string y un entero separados por espacio representando el nombre del libro y el número de páginas que tiene.

Luego hay **m** lineas cada una tiene un string con el nombre del libro que está buscando Juan.

### Output

Imprime a salida estandar **STDOUT** la lista con el nombre de los libros ordenados de menor a mayor en la primera linea.

Luego en las siguientes **m** lineas imprime el índice del libro que se está buscando, en el caso de que no exista el libro imprime `-1`.


### Ejemplos

#### Entrada
```
5 3
HarryPotter 245
GodelEscherBach 777
Flatland 96
Mistborn 541
CleanCode 469
Mistborn
NewMoon
HarryPotter
```

#### Salida

```
Flatland HarryPotter CleanCode Mistborn GodelEscherBach
3
-1
1
```

### Notas

Resuelve el problema haciendo una implementación de QuickSort y Binary Search.
