# Práctica 7 - Buscando cosas pero más dificil

El granjero Bob tiene un problema con sus vacas, o bueno, tiene un problema un una vaca en especial. Su vacada (colectivo para vacas) es muy tranquilo, pero Betsy es una vaca muy hiperactiva y siempre se escapa de su corral y va a otros. Bob tiene **N** corrales en su granja identificados con números desde el **0** a **N-1**. Estos corrales están conectados por **E** caminos. 

El corral en el que debería estár Betsy es el **0**.

Ayuda a Bob a encontrar a Betsy y mostrarle el camino que debe seguir para regresarla a su corral.

### Input

La entrada será recibida por **STDIN**

Consiste en varias lineas. La primera tiene 3 enteros separados por un espacio, el número de corrales **N**, el número de caminos **E**, el corral en el que está Betsy **b**. 

Después hay **E** lineas correspondientes a cada camino, estas lineas tienen 2 enteros separados por un espacio **x** **y** el numero que identifica a los 2 corrales que conecta el camino.

### Output

Imprime a salida estandar **STDOUT** los corrales que tiene que atravezar Bob con Betsy para llegar hasta el corral 0.

### Ejemplos

#### Entrada
```
5 6 3
0 2
0 1
3 0
1 3
2 3
3 4
```
#### Salida

```
3 0
```

### Detalles
Pueden haber varias respuestas correctas
