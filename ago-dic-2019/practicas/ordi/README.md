# Ordi - Good Luck :smile:
Este parcial va a tener 2 ejercicios, cada uno con valor de 10 puntos. Resuélvelos y explícaselos al profe para que te evalúe.

## Ejercicio 1 - Sorting

Panchito está muy feliz porque acaba de conseguir trabajo en la industria de videojuegos, más específicamente en Supercell para su juego Clash Royale. Ese juego se basa en cartas, las cuales tienen diferentes tipos de calidad dependiendo de qué tan raras son: **común**, **especial**, **épica** y **legendaria**. Como parte de su primer encargo le pidieron implementar un sistema para ordenar las cartas según la calidad que tengan, ordenando **de menor a mayor** siguiendo la lista de arriba: **común -> especial -> épica -> legendaria**. 
En el caso de que varias cartas tengan la misma calidad entonces **deberán ordenarse de forma alfabética**.


### Input

La entrada será recibida por **STDIN**

La primera linea tiene un entero **n**, donde **1<n<30** que representa el número de cartas que se tienen que ordenar. Después hay **n** lineas con dos strings separados por un espacio, representando el nombre de la carta **s** y la calidad que tiene **x**.

### Output

Imprime a salida estandar **STDOUT** una lista de las cartas en orden, una carta por linea.

### Ejemplos

#### Entrada
```
14
golem épica
megaesbirro especial
verdugo épica
esqueletos común
bruja épica
bolaDeFuego especial
caballero común
ballesta épica
princesa legendaria
tornado épica
montapuercos especial
bárbaros común
veneno épica
leñador legendaria
```
#### Salida

```
bárbaros
caballero
esqueletos
bolaDeFuego
megaesbirro
montapuercos
ballesta
bruja
golem
tornado
veneno
verdugo
leñador
princesa
```

### Notas

Resuelve el problema haciendo una implementación de quick sort o merge sort.


## Ejercicio 2 - Búsqueda

A Panchito le fue muy bien con su proyecto y le dieron un bono extra :smile:, ahora está pensando qué se va a comprar con el dinero. En Amazon tiene una lista de regalos ordenados por precio y ya se decidió por un artículo, quiere saber cuál es la posición en la lista para poder comprarlo. Haz un programa que le ayude a hacerlo.


### Input

La entrada será recibida por **STDIN**

La primera tiene un entero y un string separados por un espacio, donde el primer entero **n** representa el número de artículos en la lista y el string **s** es el artículo que busca Panchito.

Después hay **n** lineas, cada linea tiene un string y un entero separados por un espacio, donde el string es el nombre del artículo y el entero el precio.

### Output

Imprime a salida estandar **STDOUT** la posición del artículo que busca Panchito, el artículo que busca siempre está en la lista.

### Ejemplos

#### Entrada
```
6 NintendoSwitch
TacosPastor 70
Teclado 200
Audífonos 1000
NintendoSwitch 9000
Iphone 15000
LaptopLenovo 20000
```
#### Salida

```
4
```

### Notas

Resuelve el problema haciendo una implementación de binary search.