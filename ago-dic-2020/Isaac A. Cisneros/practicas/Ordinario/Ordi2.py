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
entrada = input('Ingresa la cantidad de productos y el nombre de producto a buscar \n').split(' ')
n = int(entrada[0])
s = entrada[1]
lista = []
for i in range(n):
    entrada_articulo = input('').split(' ')
    lista.append(entrada_articulo)
    
    if s == entrada_articulo[0]:
        valor_numerico = int(entrada_articulo[1])

posicion = binarySearch(lista, 0, len(lista)-1, valor_numerico)+1
if posicion == -1:
    print('No existe ese krnalito')
else:
    print("El numero es:")
    print(posicion)