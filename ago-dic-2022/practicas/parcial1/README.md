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

## Ejercicio 2 - Mas ordenamiento

Juan tiene un montón de libros que quiere leer, y quiere leer la mayor cantidad posible en un año así que empezará a leer sus libros empezando del más corto en adelante. El problema es que toda su biblioteca está desordenada, ayúdalo a ordenarla de menor a mayor tomando en cuenta el número de páginas que tiene cada libro.

### Input

La entrada será recibida por **STDIN**

Consiste en varias lineas, la primera tiene un entero **n** representado el número de libros que tiene Juan.

Después hay **n** líneas en la que cada una tiene un string y un entero separados por espacio representando el nombre del libro y el número de páginas que tiene.

### Output

Imprime a salida estandar **STDOUT** la lista con el nombre de los libros ordenados de menor a mayor.

### Ejemplos

#### Entrada
```
5
HarryPotter 245
GodelEscherBach 777
Flatland 96
Mistborn 541
CleanCode 469

```
#### Salida

```
Flatland HarryPotter CleanCode Mistborn GodelEscherBach
```

### Notas

Resuelve el problema haciendo una implementación de MergeSort.