# Práctica 8 - Buscando, pero ahora buscamos ciclos

El granjero Bob ya vendió sus vacas, resulta que eran demaciado problemáticas. Ahora solo tiene Truchas, muchas, muchas truchas de diferentes edades en varios estanques. Esos estanques están conectados unos con otros con pequeños riachuelos, donde las truchas más pequeñas en los estanques chicos pueden viajar a estanques más grandes cuando crecen, pero esos riachuelos son de un solo sentido, para que las truchas grandes no puedan ir a los estanques pequeños y comerse a sus hermanos pequeños :( . 
Bob tiene **N** estanques en su granja identificados con números desde el **0** a **N-1**. Estos estanques están conectados por **E** riachuelos. 

Asegúrate de que no haya ninguna forma de que hay aun camino en que las truchas puedan regresar a un estanque en el que estaban antes.

### Input

La entrada será recibida por **STDIN**

Consiste en varias lineas. La primera tiene 2 enteros separados por un espacio, el número de estanques **N** y el número de riachuelos **E**. 

Después hay **E** lineas correspondientes a cada riachuelo, estas lineas tienen 2 enteros separados por un espacio **x** **y** el numero que identifica a los estanques que conecta el riachuelo, donde el estanque **x** es de donde salen las truchas y el **y** a donde llegan.

### Output

Imprime a salida estandar **STDOUT** *"todo bien"* si no encontraste ciclos y de lo contrario imprime *"hay problemas Bob"*.

### Ejemplos

#### Entrada
```
5 6
0 2
0 1
0 3
3 4
1 4
2 4
```
#### Salida

```
todo bien
```

#### Entrada
```
5 6
0 2
0 1
0 3
3 4
4 2
2 4
```
#### Salida

```
hay problemas Bob
```


### Detalles
Usa DFS para resolverlo.
