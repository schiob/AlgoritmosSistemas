# Ordinario
Este parcial va a tener 2 ejercicios,  cada uno con valor de 8 puntos. Resuélvelos y súbelos a github.

## Problema 1 - Ordenando
Perlita tiene una colección imprecionante de plumones y le gustaría ordenarlos para que pueda encontrarlos de forma más sencilla, pero también para que se vean bonitos. Perlita categoríza cada plumón con un color principal y un número que indica qué tan diluido está ese color, para hacer tonalidades más claras.

Perlita quiere ordenar los plumones en el orden del arcoiris: `Rojo, Anaranjado, Amarillo, Verde, Indigo, Violeta, Azul`. Y dentro de cada color, usando el número del nivel de dilusión, ordenarlos de menor a mayor.

### Especificación de entrada
La primera linea tiene un entero **n**, donde **1<n<500** que representa el número de plumones que tiene Perlita. Después hay **n** lineas con un string representando el plumón **s**, este string tiene una de las palabras de los colores del arcoiris, listadas arriba, seguida de un `-` y un entero que puede ir desde el `0` hasta el `100`. Ejemplos de plumones:

`Anaranjado-43` `Indigo-0` `Rojo-100` `Amarillo-43`

### Especificación de salida
Imprime los plumones en el orden deseado, un plumón por linea.

### Ejemplos

#### Entrada
```
5
Anaranjado-34
Indigo-3
Rojo-43
Indigo-0
Anaranjado-44
```
#### Salida

```
Rojo-43
Anaranjado-34
Anaranjado-44
Indigo-0
Indigo-3
```

### Notas

Resuelve el problema haciendo una implementación de quick sort o merge sort.

## Problema 2 - Buscando

Afortunadamente Perlita ya tiene sus plumones ordenados gracias a tu programa, pero ahora quiere poder encontrarlos rápidamente, así que acude de nuevo a ti para que la ayudes.

Dada la lista de plumones ordenada y el plumón que está buscando, imprime el índice donde se encuentre el plumón. Si no existe devuelve un `-1`.

### Especificación de entrada
La primera linea tiene un entero **n** y un string **p**, donde **1<n<500** que representa el número de plumones que tiene Perlita y **p** es el plumón que busca. Después hay **n** lineas con un string representando el plumón **s**, este string tiene la misma forma que el problema 1, y **está ordenada como lo indica el primer problema**.

### Especificación de salida
Imprime el índice del plumón deseado, o un `-1` si no se encuentra el plumón.

### Ejemplos

#### Entrada
```
5 Indigo-0
Rojo-43
Anaranjado-34
Anaranjado-44
Indigo-0
Indigo-3
```
#### Salida

```
3
```

#### Entrada
```
7 Indigo-7
Rojo-43
Anaranjado-34
Anaranjado-44
Amarillo-29
Verde-65
Indigo-0
Indigo-3
```
#### Salida

```
-1
```

### Notas

Resuelve el problema haciendo una implementación de binary search.
