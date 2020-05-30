# Búsqueda binaria.
def binarySearch(lista, izquierda, derecha, objetivo):
    if derecha >= izquierda:
        medio = izquierda+(derecha-izquierda)//2
        if int(lista[medio][1]) == objetivo:
            return medio
        elif int(lista[medio][1]) > objetivo:
            return binarySearch(lista,izquierda,medio-1,objetivo)
        else:
            return binarySearch(lista,medio+1,derecha,objetivo)
    else:
        return -1

# Entrada de datos.
entrada = input('Ingresa la cantidad de productos y el producto a buscar \n').split(' ')
# Destructuración.
n = int(entrada[0])
s = entrada[1]
# Declaración de una lista.
lista = []
# Ciclo para iterar a través del rango dado.
for i in range(n):
    entrada_articulo = input('').split(' ')
    lista.append(entrada_articulo)
    # Condicional para validar si lo que buscamos es igual al producto que se acaba de ingresar, de ser así guardaremos su valor númerico.
    if s == entrada_articulo[0]:
        valor_numerico = int(entrada_articulo[1])

# Se obtiene la posición y dependiendo el resultado se imprimirá algo diferente.
posicion = binarySearch(lista, 0, len(lista)-1, valor_numerico)+1
if posicion == -1:
    print('No existe brother')
else:
    print(posicion)
# La verdad estuvo suepr tricky este problema, no te lo voy a negar, todo dependía del condicional de la variable númerica.
# Fue un buen semestre maestro, fue increíble poder estar en su clase.