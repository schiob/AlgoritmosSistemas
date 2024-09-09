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

## Ejercicio 2

Juan está organizando un torneo de Clash Royale en su escuela. Cada participante va a ser dividido en grupos de 10 personas y dentro de cada grupo habrá una serie de peleas para sacar las 3 personas que pasan a la siguiente etapa.

Las 3 personas con más victorias serán las que pasen, si algunas personas tienen el mísmo número de victorias se decidirá por el que tenga más empates, y si este número también es igual el que tenga menos derrotas es el que pasará.

Ayuda a Juan realizando un programa que tome los resultados de los 10 participantes de un grupo e imprima el nombre de los 3 integrantes que pasarán a la siguiente etapa.

### Entrada:

La entrada consta de 10 lineas, cada linea tiene un string, el nombre del concursante, seguido de 3 enteros separados por un espacio, el número de victorias, empates y derrotas del participante.

### Salida:

Imprime en una sola línea y separado por espacios los 3 nombres de los concursantes que pasan a la siguiente etapa.

### DETALLE:

Realiza el ordenamiento haciendo una implementación de quicksort.

### Ejemplo de entrada:

```
pepe 5 3 0
juan 1 5 3
maria 4 4 1
luci 4 0 5
mario 3 4 2
tom 4 4 2
pedro 3 2 4
david 5 2 3
francisco 0 0 9
saul 1 0 8
```

### Ejemplo de salida

```
pepe david maria
```
