# Segundo Parcial

## Problema 1 - Ordenando Burgers
Carolina es la encargada de las sucursales de Carl's Junior en el país, y está trabajando en un análisis de las sucursales que hay en todo México. Más específicamente quiere hacer un reporte con las sucursales que vendieron más hambuerguesas en el año. Ya tiene una lista de las sucursales con la cantidad de hamburguesas que vendieron y solo quiere que le ayudes a ordenarlas de menor a mayor.

### Input
La entrada será recibida por **STDIN**

La primera linea contiene un entero **N**, denotando el número de sucursales Carl's que hay en la lista. Donde **1 <= N <= 100**.

Después hay **N** líneas cada una con el registro de una sucursal. Estas lineas tienen una palabra **S** y un entero **K** separados por espacio. La palabra **S** se forma solo de letras y el entero **K** es **100 <= K <= 500,000**.

### Output
Imprime a salida estandar **STDOUT**.

Imprime la lista de sucursales ordenadas de menor a mayor.

### Ejemplos
#### Entrada
```
8
periferico 375892
sanPedro 90334
abasolo 203569
guadalajara 403236
CDMX 479983
cancun 122112
tlaxcala 200
sonora 223211
```

#### Salida
```
tlaxcala 200
sanPedro 90334
cancun 122112
abasolo 203569
sonora 223211
periferico 375892
guadalajara 403236
CDMX 479983
```

### Notas

Resuelve el problema con una implementación de radix sort o counting sort.


## Problema 2 - Ordenando y buscando

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

Luego imprime **Q** lineas, cada una con el índice de la posición de la canción que busca Rabin en esa petición, si la canción no está en la lista imprime un **-1** para esa consulta.

### Ejemplos

#### Entrada
```
8 5
FiestaDeLocos Matador Comprendes,Mendes? PadreNuestro YoTomo Frijolero SiSeñor Imagina
SiSeñor
Imagina
PadreNuestro
LaDosisPerfecta
Matador
```
#### Salida

```
Comprendes,Mendes? FiestaDeLocos Frijolero Imagina Matador PadreNuestro SiSeñor YoTomo
6
3
5
-1
4
```

### Notas

Resuelve el problema con quick sort y la búsqueda con binary search.

Cuando termines sube el código a github.