# Práctica 7 - Mi primer grafo

Recuerdas a Susana? Si, la misma Susana que te pidió ordenar su inventario de Minecraft. Bueno, solicita tu ayuda otra vez porque quedó muy satisfecha con tu último trabajo.

En su mundo de Minecraft construyó su base con una temática de archipiélago, así que tiene varias islas conectadas por puentes. La isla con la granja de aldeanos, la isla con los cultivos, la isla con su casa, la isla con la trampa de monstruos, la sorprendente isla de pollos, entre muchas otras.

El problema es que ya construyó muuuuchas islas después de 5 años jugando en el mismo mapa, y suele olvidar dónde quedan ciertas islas. Así que te pide que hagas un programa para que le indique el camino para llegar a la isla deseada.

Puede ser cualquier camino :)

### Input

La entrada será recibida por **STDIN**

La primera tiene 3 enteros separados por un espacio, el número de islas **N**, el número de puentes **E**, el la isla a la que quiere ir Susana **b**.

Después hay **E** lineas correspondientes a cada puente, estas lineas tienen 2 enteros separados por un espacio **x** **y** el numero que identifica a las 2 islas que conecta el puente.

Susana siempre empieza en la isla **0** que es su casa.

### Output

Imprime a salida estandar **STDOUT** las islas que tiene que atravezar Susana para llegar a la isla deseada.

### Ejemplos

![grafo](grafo.png)

#### Entrada
```
15 20 5
0 1
0 2
0 3
0 7
0 8
1 15
2 4
2 5
2 6
3 7
3 9
3 10
3 11
4 13
4 5
5 14
6 9
9 11
9 14
9 12
```
#### Salida

```
0 2 5
```

### Detalles
Pueden haber varias respuestas correctas, usen BFS o DFS.