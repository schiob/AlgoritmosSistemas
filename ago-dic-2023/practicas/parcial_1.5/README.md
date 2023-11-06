# Parcial 1 
## Ejercicio 1 - El profe está enfermo

El profe Chio se enfermó de la garganta y le recetaron un montón de drogas para que se cure. Por la fiebre no quiere andar batallando para encontrar la medicina que ocupa así que ayúdalo haciendo un programa que le ayude a ordenar los medicamentos en orden alfabético.

### Input

La entrada será recibida por **STDIN**

Consiste en dos lineas, la primera tiene 1 entero, **n** representado el número de medicinas.

Después hay 1 línea con **n** palabras separadas por espacios, cada palabra es el nombre de una medicina.

### Output

Imprime a salida estandar **STDOUT** una linea con las medicinas ordenas en orden alfabético.

### Ejemplos

#### Entrada
```
5
naproxeno paracetamol rimantadina azitromicina ibuprofeno
```
#### Salida

```
azitromicina ibuprofeno naproxeno paracetamol rimantadina
```

### Notas

Resuelve el problema haciendo una implementación cualquier algoritmo de ordenamiento. 

## Ejercicio 2 - Filomeno y las pelis

A Filomeno le encantan las películas y está organizando un maratón de ciencia ficción en su escuela. Filomeno quiere que las pelis se proyecten de la más corta a la más larga, ayudalo a ordenar sus películas de esta forma.

### Input

La entrada será recibida por **STDIN**

Consiste en varias lineas, la primera tiene un entero **n** representado el número de películas que usará Filomeno.

Después hay **n** líneas en la que cada una tiene un string y un dos enteros separados por espacio representando el nombre del libro, el número de horas y minutos que tiene.

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