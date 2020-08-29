# Ordi - Good Luck :smile:
Este parcial va a tener 2 ejercicios, cada uno con valor de 15 puntos.

## Ejercicio 1

Willy Wonka acaba de anunciar un concurso donde el que encuentre el boleto dorado dentro de alguno de sus dulces podrá visitar su fantástica fábrica. El boleto puede estar en cualquiera de los diferentes dulces que produce Wonka, y para evitar que la gente adinerada compre todos los dulces del mercado se hizo una restricción de una caja con dulces por persona.

Cada uno de los **n** integrantes de tu grupo de amigos tiene una caja con dulces. Cada caja tiene **Mi** dulces, donde **1<Mi<30**. Y para cada dulce tardan **t** segundos en abrir la envoltura y ver si adentro está el boleto.

Tú tienes un plán para rápidamente averiguar si el boleto se lo ganó alguien del grupo de tus amigos:

Empezar a abrir primero las cajas con menos dulces, y en las cajas abrir primero los dulces que tarden menos en desenvolver.

Ayuda a tus amigos a hacer un programa que ordene estas cajas de esa manera e imprime cuánto tiempo pasará hasta que encuentren el boleto.

Para facilitar el problema, puedes asumir que el boleto siempre estará en alguna de las cajas.

### Input

La entrada será recibida por **STDIN**

La primera linea tiene un entero **n**, donde **1<n<15** que representa el número de cajas. Después hay **n** lineas con **Mi** strings separados por espacio, cada uno de estos tienen una parte numérica representanto los segundos **t** que tarda en abrirse, un caracter **-** y una letra: **X** si no tiene boleto y **B** si tiene el boleto dorado.

### Output

Ordena las cajas como se indica en la descripción e imprime a salida estandar **STDOUT** el tiempo que tardaron en encontrar el boleto.

### Ejemplos

#### Entrada
```
5
13-X 1-X 12-X 13-X 16-X 4-X
30-X 20-X
7-X 9-X 12-X 8-B
1-X 25-X 12-X
16-X
```
#### Salida

```
119
```

#### Explicación
Primero ordenan las cajas de menor a mayor en cuanto a cantidad de dulces:

```
16-X
30-X 20-X
1-X 25-X 12-X
7-X 9-X 12-X 8-B
13-X 1-X 12-X 13-X 16-X 4-X
```

Luego ordenan cada dulce de menor a mayor:

```
16-X
20-X 30-X
1-X 12-X 25-X
7-X 8-B 9-X 12-X
1-X 4-X 12-X 13-X 13-X 16-X
```

Y contamos cuanto tiempo pasó hasta encontrar el dulce con el Boleto: `16+20+30+1+12+25+7+8`

### Notas

Resuelve el problema haciendo implementaciones de quick sort o merge sort.

## Ejercicio 2 - Búsqueda

A Panchito le fue muy bien con su proyecto y le dieron un bono extra :smile:, ahora está pensando qué se va a comprar con el dinero. En Amazon tiene una lista de regalos ordenados por precio y ya se decidió por un artículo, quiere saber cuál es la posición en la lista para poder comprarlo. Haz un programa que le ayude a hacerlo.


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