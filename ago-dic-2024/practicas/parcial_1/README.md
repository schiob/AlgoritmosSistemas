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

## Ejercicio 2 - Chio guardando sus medicamentos

El profe Chio ya se siente mejor y ha decidido organizar sus medicamentos que le quedaron para cuando necesite usarlos nuevamente. Sin embargo, en su prisa por guardarlos no recuerda en qué orden tenía las pastillas. Así que, para evitar confusiones, decide ordenarlos de tal manera que los medicamentos con más pastillas queden primero y los que tienen menos, después. Ayúdalo a resolver este problema.

### Input

La entrada será recibida por **STDIN**.

Consiste en dos líneas. La primera línea contiene un entero, **n**, representando el número de medicinas. La segunda línea contiene **n** pares de datos separados por espacios. Cada par estará compuesto por el nombre de la medicina seguido por un número que indica cuántas pastillas le quedan de esa medicina.

### Output

Imprime a salida estándar **STDOUT** una línea con los nombres de las medicinas ordenadas de mayor a menor según la cantidad de pastillas que le quedan.

### Ejemplos

#### Entrada

```
5
naproxeno 10 paracetamol 5 rimantadina 20 azitromicina 15 ibuprofeno 8
```

#### Salida

```
rimantadina azitromicina naproxeno ibuprofeno paracetamol
```

### Notas

Resuelve el problema haciendo una implementación cualquier algoritmo de ordenamiento.
