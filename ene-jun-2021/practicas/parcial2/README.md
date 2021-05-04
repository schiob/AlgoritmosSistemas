# Segundo Parcial
Resuelve los siguientes 2 problemas:

## Problema 1 - Búsqueda simple

Toño está buscando un libro de cálculo en la infoteca de la universidad, pero como la tarea que tiene es muy difícil no quiere perder tiempo buscando el libro, ayuda a Toño indicándole la posición del libro que busca en la repisa.


### Input

La entrada será recibida por **STDIN**

Consiste en 2 lineas, la primera tiene un entero y un string separados por un espacio, donde el primer entero **n** representa el número de libros en la repisa de mate y el string **x** el nombre del libro que busca Toño.

La siguiente linea tiene **n** strings separados por un espacio, siendo cada string el nombre de un libro en la repisa.

### Output

Imprime a salida estandar **STDOUT** la posición del libro que está buscando Juan, en caso de que no esté imprimir **-1**.

### Ejemplos

#### Entrada
```
5 CalculoForDummies
Calculo2Deitel CalculoForDummies AlgebraLineal TeoríaDeNúmeros TheMangaGuideToCalculus
```
#### Salida

```
2
```

### Notas
Resuelve el problema haciendo una implementación cualquier algoritmo de búsqueda.

## Problema 2 - Ordenando y buscando

Rabin tiene un problema. Le encanta la música, y tiene una playlist (algo rabinesco) con sus canciones favoritas. Pero cuando quiere poner una canción en especial tarda mucho tiempo buscándola y eso significa menos tiempo disfrutando y bailando.

Como quieres ayudarlo le propones ordenar esa lista de canciones por orden alfabético y luego aplicar algún algoritmo de búsqueda para encontrar las canciones que quiera.

Realiza ese programa para decirle a Rabin cómo quedaría su playlist ordenada y la nueva posición de las canciones que te pida.

### Input

La entrada será recibida por **STDIN**

La primera linea tiene dos enteros **N** y **Q**, el número de canciones en la playlist de Rabin y el número de peticiones que hará.

La segunda linea tiene **N** palabras separadas por espacio representando las canciones en su playlist.

Luego hay **Q** lineas con una palabra cada una. Estas son las canciones que está buscando Rabin.

### Output

Imprime a salida estandar **STDOUT**.

En la primera linea el nuevo orden de la playlist de Rabin.

Luego imprime **Q** lineas, cada una con el índice de la posición de la canción que busca Rabin en esa petición, si la canción no está en la lista imprime un **-1** para esa consulta.

### Ejemplos

#### Entrada
```
8 5
FiestaDeLocos Matador Comprendes,Mendes? PadreNuestro YoTomo Frijolero SiSeñor Imagina
SiSeñor
Imagina
PadreNuestro
LaDosisPerfecta
Matador
```
#### Salida

```
Comprendes,Mendes? FiestaDeLocos Frijolero Imagina Matador PadreNuestro SiSeñor YoTomo
6
3
5
-1
4
```

### Notas

Resuelve el problema con quick sort y la búsqueda con binary search.

Cuando termines sube el código a github.