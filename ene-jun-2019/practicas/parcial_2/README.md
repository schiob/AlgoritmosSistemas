# Segundo Parcial - Ordenando y buscando

Rabin tiene un problema. Le encanta la música, y tiene una playlist (algo rabinesco) con sus canciones favoritas. Pero cuando quiere poner una canción en especial tarda mucho tiempo buscándola y eso significa menos tiempo disfrutando y bailando.

Como quieres ayudarlo le propones ordenar esa lista de canciones por orden alfabético y luego aplicar algún algoritmo de búsqueda para encontrar las canciones que quiera.

Realiza ese programa para decirle a Rabin cómo quedaría su playlist ordenada y la nueva posición de las canciones que te pida.

### Input

La entrada será recibida por **STDIN**

La primera linea tiene dos enteros **N** y **Q**, el número de canciones en la playlist de Rabin y el número de peticiones que hará.

La segunda linea tiene **N** palabras separadas por espacio representando las canciones en su playlist.

Luego hay **Q** lineas con una palabra cada una. Estas son las canciones que está buscando Rabin.

### Output

Imprime a salida estandar **STDOUT**.

En la primera linea el nuevo orden de la playlist de Rabin.

Luego imprime **Q** lineas, cada una con el índice de la posición de la canción que busca Rabin en esa petición.

### Ejemplos

#### Entrada
```
8 4
FiestaDeLocos Matador Comprendes,Mendes? PadreNuestro YoTomo Frijolero SiSeñor Imagina
SiSeñor
Imagina
PadreNuestro
Matador
```
#### Salida

```
Comprendes,Mendes? FiestaDeLocos Frijolero Imagina Matador PadreNuestro SiSeñor YoTomo
6
3
5
4
```

### Notas

Resuelve el problema con merge sort y la búsqueda con el algoritmo que prefieras (binary search es más óptimo porque ya está ordenado ;) ) . Cuando termines llévale el código al profe para que te lo revise.