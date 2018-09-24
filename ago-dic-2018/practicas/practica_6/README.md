# Práctica 6 - Buscando cosas

Ricardo le encantan las palabras, grades, pequeñas, con vocales y consonantes. Pero tú ya sabes eso, ya que le ayudaste a ordenar su lista de palabras faboritas en orden alfabético.

Le gustó tanto tu trabajo que ahora te pide que le ayudes a hacer un programa para buscar una palabra en esa lista para ver su posición.

### Input

La entrada será recibida por **STDIN**

Consiste en 2 lineas, la primera tiene un entero **n** y una palabra **s** separados por un espacio. **n** representa el número de palabras en la lista de Ricardo, y la pablabra **s** la palabra que está buscando.

En la segunda linea está la lista ordenada de forma alfabética con **n** palabras separados por espacio.

### Output

Imprime a salida estandar **STDOUT** la posición de la palabra en la lista o un -1 si no está en la lista.

### Ejemplos

#### Entrada
```
7 a12
a a12 b2 text2 text2a text2a2 text2a12
```
#### Salida

```
2
```

### Detalles
Usa el algoritmo de binary search ;)
