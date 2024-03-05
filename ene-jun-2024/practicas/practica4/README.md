# Práctica 4 - Ordenando cartitas
Un deck de cartas estandar tiene 52 cartas. Cada carta tiene un valor y un palo. Los valores son $A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K$. Los Palos son Espada, Corazón, Trebol y Diamante. Dada una mano de cartas tienes que ordenar la mano, ordena primero por valor y si hay dos cartas con el mismo valor ordena por palo. Usa el ordenamiento que está arriba.


## Input
La entrada empieza con una linea conteniendo un entero positivo $H \le 300$ representado el numero de manos que siguen. Después hay $H$ lineas de manos, cada una empieza con un entero N, donde $1 \le N \le 52$, el número de cartas en la mano. En seguida las cartas separadas por espacio. 

Cada carta está representada por 2 caracteres:

El primer caracter es A, 2, 3, 4, 5, 6, 7, 8, 9, T, J, Q o K y denota el valor (usamos T en lugar de 10).

El segundo caracter es E, C, T o D y denota la Espada, Corazón, Trebol y Diamante.

Puedes asumir que las cartas en una mano no se repiten.


### Output
Por cada mano imprime en una sola linea la mano ordenada con la criteria de arriba.

### Ejemplos

#### Entrada
```
3
4 AT 2C 3E 4D
5 3T 3C TE 3D 2D
2 TE AE
```
#### Salida

```
AT 2C 3E 4D
2D 3C 3T 3D TE
AE TE
```

### Notas

Resuelve el problema haciendo una implementación de merge sort.