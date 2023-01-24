# Practica 2 - Empezando a ordenar
David está haciendo su tarea de cálculo, y tiene que resolver muuuuchos problemas. Para ser más específico **n** problemas que le encargó la profe. 

Tal vez David no tenga tiempo de hacerlos todos, pero quiere hacer la mayor cantidad posible de problemas en lo que le queda de la tarde. 

David sabe cuántos minutos le toma hacer cada problema en especial y tiene **m** minutos restantes en el día para terminarlos.

Ayúdalo haciendo un programa que le diga cuántos problemas va a poder hacer y cuánto tiempo se va a tardar.

## Entrada
La primera linea de la entrada tiene 2 enteros separados por un espacio, el número de problemas que le encargaron de tarea **n**, y el número de minutos que tiene disponible David para hacer la tarea **m**.

La segunda linea tiene **n** enteros separados por espacios, cada entero **ni** representa el número de minutos que le toma hacer ese problema.

## Salida
Imprime un número entero diciendo la mayor cantidad de problemas que puede hacer David en ese tiempo, si no puede hacer ninguno imprime **0**.

## Ejemplo

### Entrada
```
10 6
4 2 3 7 5 1 2 1 3 2
```

### Salida
```
4
```

## Nota
Utiliza insertion sort cuando estés ordenando la lista.

Tip: Necesitas ordenar la lista para resolver este problema