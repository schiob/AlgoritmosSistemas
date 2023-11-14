# Problema 1 - Ordenando
Perlita tiene una colección impresionante de plumones y le gustaría ordenarlos para que pueda encontrarlos de forma más sencilla, pero también para que se vean bonitos. Perlita categoríza cada plumón con un color principal y un número que indica qué tan diluido está ese color, para hacer tonalidades más claras.

Perlita quiere ordenar los plumones en el orden del arcoiris: `Rojo, Anaranjado, Amarillo, Verde, Indigo, Violeta, Azul`. Y dentro de cada color, usando el número del nivel de dilusión, ordenarlos de menor a mayor.

## Especificación de entrada
La primera linea tiene un entero **n**, donde **1<n<500** que representa el número de plumones que tiene Perlita. Después hay **n** lineas con un string representando el plumón **s**, este string tiene una de las palabras de los colores del arcoiris, listadas arriba, seguida de un `-` y un entero que puede ir desde el `0` hasta el `100`. Ejemplos de plumones:

`Anaranjado-43` `Indigo-0` `Rojo-100` `Amarillo-43`

## Especificación de salida
Imprime los plumones en el orden deseado, un plumón por linea.

## Ejemplos

### Entrada
```
5
Anaranjado-34
Indigo-3
Rojo-43
Indigo-0
Anaranjado-44
```
### Salida

```
Rojo-43
Anaranjado-34
Anaranjado-44
Indigo-0
Indigo-3
```

### Notas

Resuelve el problema haciendo una implementación de quick sort.


# Ejercicio - Ordenar Números con Counting Sort
Juan tiene una lista de números enteros positivos y desea ordenarlos de menor a mayor utilizando el algoritmo Countnig Sort. Ayuda a Juan a ordenar su lista de números utilizando Countnig Sort.

## Input
La entrada será recibida por STDIN.

La primera línea contiene un entero n, que representa la cantidad de números en la lista. La siguiente línea contiene n enteros separados por espacios, que son los números que Juan quiere ordenar.

## Output
Imprime a la salida estándar STDOUT la lista de números ordenados de menor a mayor.

## Ejemplo

### Entrada

```
6
7 5 15 3 6 1
```

### Salida

```
1 3 5 6 7 15
```

## Nota
Utiliza Counting sort para ordenar