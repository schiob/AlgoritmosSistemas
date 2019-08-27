# Práctica 10 - Muchas posibilidades

Alex es un fan del juego de rol, y tiene un montón de dados, d4, d6, d8, d10, d20, etc, etc, etc.

Tiene tantos dados con tantas caras que se plantea un pequeño desafío.

Tomando **n** dados, cada uno con **m** caras, todas las caras numeradas desde el **1** hasta **m**. Al momento de lanzar todos, de cuántas formas diferentes se puede obtener la suma **x**.

Por ejemplo lanzando 2 dados de 2 caras (como una moneda), solo hay dos formas para obtener 3 de resultado:

[1, 2] y [2, 1]

### Input

La entrada será recibida por **STDIN**

Consiste en una linea de 3 enteros separados por espacios, el número de dados **n**, el número de caras por dado **m** y la suma **x** que se desea optener.

### Output

Imprime a salida estandar **STDOUT** el número de diferentes formas para obtener **x**. Considera que si no se puede obtener esa suma, el resultado es 0.

### Ejemplos

#### Entrada
```
2 2 3
```
#### Salida

```
2
```
#### Entrada
```
6 3 8
```
#### Salida

```
21
```
#### Entrada
```
4 2 5
```
#### Salida

```
4
```
#### Entrada
```
4 3 5
```
#### Salida

```
6
```

### Detalles
Piensa en el cómo resolvimos el problema de la tortuga en clase para tratar de formular el algoritmo.