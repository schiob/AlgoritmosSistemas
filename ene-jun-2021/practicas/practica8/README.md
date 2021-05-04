# Practica 8 - Buscando videojuegos

Angel tiene una colección gigante de videojuegos, tan grande que se le dificulta mucho encontrar alguno cuando lo está buscando, y Angel tiene una lista de los videojuegos que quiere encontrar, ayúdalo haciendo un programa que le ordene los videojuegos en orden alfabético y luego le diga la posición de cada uno de los videojuegos que te pida.

### Input

La entrada será recibida por **STDIN**

Consiste en varias lineas, la primera tiene 2 enteros, **n** representado el número de videojuegos y **q** representando el número de peticiónes de búsqueda que se hacen para encontrar uno de los videojuegos.

Después hay 1 línea con **n** palabras separadas por espacios, cada palabra es el nombre de un videojuego.
Después hay **q** lineas con una palabra en cada linea representando el videojuego que busca Angel.

### Output

Imprime a salida estandar **STDOUT** una linea por cada petición **q** con el índice de la posición del videojuego, si no lo encuentras regresar un -1.

### Ejemplos

#### Entrada
```

5 3
TheLeyendOfZelda SuperMario64 MegaMan3 PokemonBlue MetalSlug2
SuperMario64
PokemonBlue
PokemonRed
```
#### Salida

```

3
2
-1
```

## Nota
Resuelve el problema haciendo una implementación de Quick Sort y Binary Search para la búsqueda.
