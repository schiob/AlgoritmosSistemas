# Segundo Parcial - parte 2

## Problema 1 - Ordenando Burgers
Carolina es de las mejores entrenadoras Pokemon de la región Kanto, y está preparándose para enfrentar a la Liga Pokemon, pero tiene tantos Pokemons que no sabe cuáles elegir para su equipo. Ayudala ordenando los Pokemons de su caja de mayor a menor.

### Input
La entrada será recibida por **STDIN**

La primera linea contiene un entero **N**, denotando el número de Pokemons que hay en la caja. Donde **1 <= N <= 100**.

Después hay **N** líneas cada una con el registro de un Pokemon. Estas lineas tienen una palabra **S** y un entero **K** separados por espacio. La palabra **S** se forma solo de letras y corresponde al nombre del Pokemon y el entero **K** es **100 <= K <= 100** correspondiente al nivel.

### Output
Imprime a salida estandar **STDOUT**.

Imprime la lista de Pokemons ordenadas de mayor a menor.

### Ejemplos
#### Entrada
```
8
Charizard 60
Gengar 70
Eevee 34
Abra 14
Snorlax 55
Dragonair 39
Pikachu 62
Hitmonchan 44
```

#### Salida
```
Gengar 70
Pikachu 62
Charizard 60
Snorlax 55
Hitmonchan 44
Dragonair 39
Eevee 34
Abra 14
```

### Notas

Resuelve el problema con una implementación de tree sort o heap sort.


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