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
entrada = input('ingresa numero y plumon a buscar').split(' ')
n = int(entrada[0])
s = entrada[1]
lista = []
for i in range(n):
    entrada_plumon = input('').split(' ')
    lista.append(entrada_plumon)

    if s == entrada_plumon[0]:
        valor_numerico = int(entrada_plumon[1])

posicion = binarySearch(lista, 0, len(lista)-1, valor_numerico)+1
if posicion == -1:
    print('no esta')
else:
    print("numero es")
    print(posicion) 