# Parcial 1 - Mucho Más ordenamiento

A Filomeno le encantan las películas y está organizando un maratón de ciencia ficción en su escuela. Filomeno quiere que las pelis se proyecten de la más corta a la más larga, ayudalo a ordenar sus películas de esta forma.

### Input

La entrada será recibida por **STDIN**

Consiste en varias lineas, la primera tiene un entero **n** representado el número de películas que usará Filomeno.

Después hay **n** líneas en la que cada una tiene un string y un dos enteros separados por espacio representando el nombre de la película, el número de horas y minutos que tiene.

### Output

Imprime a salida estandar **STDOUT** la lista con el nombre de las películas ordenadas de menor a mayor.

### Ejemplos

#### Entrada
```
6
StarWars 2 1
Alien 1 57
ASpaceOdyssey 2 41
Matrix 2 30
BladeRunner 1 57

```
#### Salida

```
Alien BladeRunner StarWars Matrix ASpaceOdyssey
```

### Notas

Resuelve el problema haciendo una implementación de MergeSort.