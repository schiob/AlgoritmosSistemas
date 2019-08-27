# Ordi - Good Luck :smile:
Este parcial va a tener 2 ejercicios, cada uno con valor de 10 puntos. Resuélvelos y explícaselos al profe Chío para que te evalúe.

## Ejercicio 1 - Sorting

Panchito está bien tronadote con los proyectos finales, ordinarios y en general tratando de salvar el semestre. Para poder hacer todas las cosas pendientes que tiene necesita tu ayuda. 

Panchito ya tiene una lista de tareas que tiene que hacer para cumplir sus deberes en la facultad, y le asignó un peso prioridad, entre más alto más importante es, en una escala de **0** a **100**. Ayuda a Panchito a ordenar de forma descendente su lista y muéstrale el orden de las tareas de la mas imporetante a la menos.


### Input

La entrada será recibida por **STDIN**

La primera linea tiene un entero **n**, donde **1<n<500** que representa el número de tareas que tiene que hacer Panchito. Después hay **n** lineas con un string y un entero separados por un espacio, representando el nombre de la tarea **s** y la prioridad que tiene **x**.

### Output

Imprime a salida estandar **STDOUT** una lista de las tareas en orden, una tarea por linea.

### Ejemplos

#### Entrada
```
5
EstudiarParaAlgoritmos 64
CompletarTareasPendientes 54
RezarPorLosParciales 80
ComprarLasBotellasDeSobornos 90
LlorarEnUnRincón 20
```
#### Salida

```
ComprarLasBotellasDeSobornos
RezarPorLosParciales
EstudiarParaAlgoritmos
CompletarTareasPendientes
LlorarEnUnRincón
```

### Notas

Resuelve el problema haciendo una implementación de quick sort o merge sort.


## Ejercicio 2 - Búsqueda

Panchito lo logró, salvó el semestre y ahora se está preparando para disfrutar de las vacaciones. Tiene una lista de regalos ordenados por precio, y quiere saber cuál es la posición en la lista de un artículo. Haz un programa que le ayude a hacerlo.


### Input

La entrada será recibida por **STDIN**

La primera tiene un entero y un string separados por un espacio, donde el primer entero **n** representa el número de artículos en la lista y el string **s** es el artículo que busca Panchito.

Después hay **n** lineas, cada linea tiene un string y un entero separados por un espacio, donde el string es el nombre del artículo y el entero el precio.

### Output

Imprime a salida estandar **STDOUT** la posición del artículo que busca Panchito, el artículo que busca siempre está en la lista.

### Ejemplos

#### Entrada
```
6 NintendoSwitch
TacosPastor 70
Teclado 200
Audífonos 1000
NintendoSwitch 9000
Iphone 15000
LaptopLenovo 20000
```
#### Salida

```
4
```

### Notas

Resuelve el problema haciendo una implementación de binary search.