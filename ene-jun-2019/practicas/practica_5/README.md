# Práctica 5 - Ordenando y buscando cosas

Ricardo le encantan las palabras, grades, pequeñas, con vocales y consonantes. Tiene una lista don sus palabras favoritas y quiere que le ayudes a ordenarlas por orden alfabético. Pero eso no es todo también te pide que le ayudes a hacer un programa para buscar una palabra en esa lista para ver su posición.

### Input

La entrada será recibida por **STDIN**

Consiste en 2 lineas, la primera tiene un entero **n** y una palabra **s** separados por un espacio. **n** representa el número de palabras en la lista de Ricardo, y la pablabra **s** la palabra que está buscando.

En la segunda linea está la lista sin ordenar con **n** palabras separados por espacio.

### Output

Imprime a salida estandar **STDOUT** la posición de la palabra en la lista o un -1 si no está en la lista.

### Ejemplos

#### Entrada
```
7 a12
text2a12 text2 a text2a text2a2 b2 a12
```
#### Salida

```
2
```

### Detalles
Usa el algoritmo de quick Sort para ordenrlo y binary search para buscar ;)
