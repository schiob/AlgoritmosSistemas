# Práctica 2 - Insertion Sort

Juan es un fanático de las hamburguesas de queso, tanto así que se dedicó todas las vacaciones a clasificar las hamburguesas de diferentes lugares en el país. Al finál terminó con una lista de puntuación para cada hamburguesa que probó y ahora quiere ver todas las puntuaciones de mejor a peor. 

Juan tiene una lista con **n** enteros representando la calificación de cada hamburguesa. 
Y como tú eres su amigo *que le sabe a eso de las compus* te pidió que hicieras un programa 
que le regrese la lista ordenada de mayor a menor.

### Input

La entrada será recibida por **STDIN**

La entrada consiste en dos lineas donde la primera contine un entero **n** donde **1 <= n <= 50** y 
representa el número de hamburguesas que Juan calificó.

La segunda línea tiene *n* enteros **n<sub>i</sub>**  separados por un espacio donde 
**0 <= n<sub>i</sub> <= 100**

### Output

Imprime a salida estandar **STDOUT**

La salida es una línea con los **n** enteros separados por un espacio ordenados de mayor a menor

### Ejemplos

#### Entrada
```
5
32 23 10 95 42
```
#### Salida

```
95 42 32 23 10
```

### Notas

Resuelve el problema haciendo una implementación de insertion sort