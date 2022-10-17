## Ejercicio Ordenando

Este semestre se realizó la primera edición de las Olimpiadas Pumas. Muchos estudiantes participaron en diferentes competencias deportivas y consiguieron muchas medallas. Pero todavía no se sabe quién fue el que quedó en primer lugar.

Para esto hay que considerar quién tiene más medallas de Oro, si algunos participantes tienen la misma cantidad se determina por el número de medallas de Plata, y si también coinciden ahí se desempata por medallas de Bronce.

Si tienen el mismo número de medallas de oro, plata y bronce puedes ordenarlos por orden alfabético.

Dada una lista con los concursantes y cuántas medallas consiguieron, imprime la lista ordenada con las reglas de arriba.


### Input

La entrada será recibida por **STDIN**

La primera linea tiene un entero **n**, donde **1<n<500** que representa el número de concursantes de las olimpiadas. Después hay **n** lineas con un string y 3 enteros separados por un espacio, representando el nombre del concursante **s**, las medallas obtenidas de oro **x**, plata **y** y bronce **z**. **0<=xyz<=20**.

### Output

Imprime a salida estandar **STDOUT** la lista de concursantes ordenada.

### Ejemplos

#### Entrada
```
6
David 10 8 0
Mario 10 7 2
Saul 12 0 4
Francisco 10 7 0
Luis 12 0 4
Karla 15 5 0
```
#### Salida

```
Karla
Luis
Saul
David
Mario
Francisco
```

### Notas

Puedes resolver el problema con cualquier algoritmo de ordenamiento.