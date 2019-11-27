## Ejercicio

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

### Notas

Resuelve el problema haciendo implementaciones de quick sort.
