# Parcial 2 - Examencito
Este parcial va a tener 2 ejercicios, cada uno con valor de 10 puntos. Resuélvelos y explícaselos al profe Chío para que te evalúe.

## Ejercicio 1 - Búsqueda simple

Toño está buscando un libro de cálculo en la infoteca de la universidad, pero como la tarea que tiene es muy dificil no quiere perder tiempo buscando el libro, ayuda a Toño indicándole la posición del libro que busca en la repisa.


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


## Ejercicio 2 - Quick Sort y Binary search

Juan tiene un montón de tazos en una colección, para ser más específicos tiene **n** tazos cada uno con un número de serie en específico. El problema es que Juan necesita encontrar su tazo favorito y su hermanita jugó con ellos y ahóra todos están desordenados. Ayúda a Juan ordenando los tasos de menor a mayor segun el numero de serie y mostrándole la posición del tazo con el número de serie proporcionado. Tengan en cuenta que el tazo que Juan busca **puede no estar** en la colección, probablemente su hermanita lo perdió :(


### Input

La entrada será recibida por **STDIN**

Consiste en 2 lineas, la primera tiene dos enteros separados por un espacio, donde el primer entero **n** representa el número de tazos en la colección y el segundo entero **x** es el numero de serie del tazo que busca Juan.

La siguiente linea tiene **n** enteros separados por un espacio, siendo cada entero el número de serie de ese tazo.

### Output

Imprime a salida estandar **STDOUT** la posición del tazo que está buscando Juan, en caso de que no esté imprimir **-1**.

### Ejemplos

#### Entrada
```
6 42
32 231 23 42 90 45
```
#### Salida

```
3
```

### Notas

Resuelve el problema haciendo una implementación de Quick Sort y binary search.