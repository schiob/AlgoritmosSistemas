# Practica 7 - El profe está enfermo

El profe Chio se enfermó de la garganta y le recetaron un montón de drogas para que se cure. Por la fiebre no quiere andar batallando para encontrar la medicina que ocupa así que ayúdalo haciendo un programa que le ayude a ordenar los medicamentos en orden alfabético y luego le diga la posición de cada una de las peticiones que haga para cada medicina.

### Input

La entrada será recibida por **STDIN**

Consiste en varias lineas, la primera tiene 2 enteros, **n** representado el número de medicinas y **q** representando el número de peticiónes que se hacen para encontrar una de las medicinas.

Después hay 1 línea con **n** palabras separadas por espacios, cada palabra es el nombre de una medicina.
Después hay **q** lineas con una palabra en cada linea representando la medicina que busca el profe.

### Output

Imprime a salida estandar **STDOUT** una linea por cada petición **q** con el índice de la posición de la medicina, si no lo encuentras regresar un -1.

### Ejemplos

#### Entrada
```
5 3
naproxeno paracetamol rimantadina azitromicina ibuprofeno
azitromicina
ibuprofeno
aspirina
```
#### Salida

```
0
1
-1
```

### Notas

Resuelve el problema haciendo una implementación de quicksort, y binary search para cada petición.