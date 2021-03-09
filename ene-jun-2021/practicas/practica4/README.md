# Práctica 4

Susana le encanta jugar Minecraft, en donde se pasa horas explorando, obteniendo recursos y construyendo cosas. Después de días jugando Susana ya ha acumulado cientos de objetos en su almacén, y quiere que le ayudes a ordenar sus objetos.

### Input

La entrada será recibida por **STDIN**

La primera linea contine un entero **n** donde **1 <= n <= 50** y representa el número de objetos diferentes que tiene Susana en su almacén.

Las siguientes líneas tiene un string **s** que representa el nombre del objeto y un entero **1 <= x <= 100**, la cantidad del objeto en el almacén, separados por un espacio donde.


### Output

Imprime a salida estandar **STDOUT**

La salida es una línea con los **n** objetos ordenados de mayor a menor.

### Ejemplos

#### Entrada
```
6
RedStone 40
Dirt 60
Books 32
Wood 12
Stone 55
Sand 43
```
#### Salida

```
Dirt Stone Sand RedStone Books Wood
```

### Notas

Resuelve el problema haciendo una implementación de selection sort, bubble sort o insertion sort.