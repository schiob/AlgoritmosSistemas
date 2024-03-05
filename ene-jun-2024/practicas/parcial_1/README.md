# Parcial 1 - Mucho Más ordenamiento

A mi tío Bartolo le encantan los relojes, muchos de los que tiene ya no funcionan y se quedaron con una hora fija en sus manecillas y/o dígitos. Mi tío tiene una fijación muy particular y quiere que los relojes estén acomodados de menor a mayor según la hora que tengan marcados, ayudalo a ordenar sus relojes de esta forma.

### Input

La entrada será recibida por **STDIN**

Consiste en varias lineas, la primera tiene un entero **n** representado el número de relojes que tiene Bartolo.

Después hay **n** líneas en la que cada una tiene un string con la hora del reloj x, en formato de 12 hrs con el string PM o AM al final respectivamente.

### Output

Imprime a salida estandar **STDOUT** la lista con los relojes ordenados.

### Ejemplos

#### Entrada
```
6
01:23 AM
11:01 PM
12:54 AM
09:00 PM 
12:30 PM
02:12 AM


```
#### Salida

```
12:54 AM
01:23 AM
02:12 AM
12:30 PM
11:01 PM
09:00 PM 
```

### Notas

Resuelve el problema haciendo una implementación de MergeSort.