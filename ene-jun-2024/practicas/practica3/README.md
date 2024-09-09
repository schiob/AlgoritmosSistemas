# Práctica 3 - Ordenando

Chuy está estudiando para ser doctor y batalla mucho con los nombres tan extraños que tienen las medicinas, algunos de esos nombres pueden ser muy largos, como *CANDESARTAN HIDROCLOROTIAZIDA ALTER*, Chuy tiene una lista con nombres de medicamentos y quiere ordenarla de los nombres más cortos a los más largos para así estudiarla mejor.

Ayuda a Chuy haciendo un programa que haga eso.

### Input

La entrada será recibida por **STDIN**

Consiste en una linea con un entero **n**, el número de medicinas, donde **1 <= n <= 100**. Seguido de **n** lineas con el nombre de una medicina.

### Output

Imprime a salida estandar **STDOUT**, la lista de los medicamentos ordenados de más corto a más largo.

### Ejemplos

#### Entrada
```
7
CANDESARTAN HIDROCLOROTIAZIDA ALTER
CARBAMAZEPINA NORMON
MATRIF
ACICLOVIR SANDOZ
MELOXICAM
FENDIVIA
SEBUMSELEN
```
#### Salida

```
MATRIF
FENDIVIA
MELOXICAM
SEBUMSELEN
ACICLOVIR SANDOZ
CARBAMAZEPINA NORMON
CANDESARTAN HIDROCLOROTIAZIDA ALTER
```

### Notas

Resuelve el problema haciendo una implementación de selection sort o bubble sort.