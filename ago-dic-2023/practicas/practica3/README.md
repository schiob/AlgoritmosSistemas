# Práctica 3 - Selection Sort

En su último viaje a Ciudad de México Carlitos capturó un montón de Pokemons en Pokemon go. 
Y quiere ver todos esos pokemons del más poderoso al más debil. 

Carlitos tiene una lista con **n** enteros representando el poder de cada Pokemon (CP). 
Y como tú eres su amigo *que le sabe a eso de las compus* te pidió que hicieras un programa 
que le regrese la una lista de los pokemons de mayor a menor.

### Input

La entrada será recibida por **STDIN**

La entrada consiste en dos lineas donde la primera contine un entero **n** donde **1 <= n <= 50** y 
representa el número de pokemons que capturó Carlitos.

La segunda línea tiene *n* enteros **n<sub>i</sub>**  separados por un espacio donde 
**1 <= n<sub>i</sub> <= 2000**

### Output

Imprime a salida estandar **STDOUT**

La salida es una línea con los **n** enteros separados por un espacio ordenados de mayor a menor

### Ejemplos

#### Entrada
```
5
1432 230 1980 1689 400
```
#### Salida

```
1980 1689 1432 400 230
```

### Notas

Resuelve el problema haciendo una implementación de selection sort