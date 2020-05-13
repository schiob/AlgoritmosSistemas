#pedir num de canciones a registrar y numerode salida
a=input().split(" ")
b= [int(x) for x in a]

#decir posicion le corresponde 
tamaño=b[0] # tamaño de canciones a registrar
salida=b[1] # numero de salidas


#declarar el arreglo con el numero de canciones a registrar y pedirlos
arreglo=[tamaño]
arreglo=input().split(" ")


#imprime arreglo1
#print(arreglo)





#ordena con el algoritmo quicksort
def quickSort(arr,start,end):
    # Se asigna un pivote y un point dados como parámetros.
    pivot = start
    point = end
    # Se comparan hasta que seans iguale o mientras sean diferentes.
    while pivot != point:
        # Comparo pivote con el point.
        # Acercar el point al pivote.
        if arr[point] < arr[pivot] and point > pivot:
            # Si la regla no se cumple, cambio.
            arr[point], arr[pivot] = arr[pivot], arr[point]
            pivot, point = point, pivot
        elif arr[point] > arr[pivot] and point < pivot:
            # Si la regla no se cumple, cambio.
            arr[point], arr[pivot] = arr[pivot], arr[point]
            pivot, point = point, pivot
        # Acercar el apuntador al pivote.
        if pivot > point:
            point += 1
        else:
            point -= 1
    # Izquierda.
    if pivot != start:
        quickSort(arr, start, pivot-1)
    # Derecha.
    if pivot != end:
        quickSort(arr, pivot+1, end)

#ordena el arreglo por forma albeticamente

quickSort(arreglo,0,len(arreglo)-1)
#imprimer ordenado
print(arreglo)

#metodo de busqueda binaria
def busqueda_binaria(arreglo, busqueda):
    izquierda, derecha = 0, len(arreglo) - 1
    while izquierda <= derecha:
        indiceDelElementoDelMedio = (izquierda + derecha) // 2
        elementoDelMedio = arreglo[indiceDelElementoDelMedio]
        if elementoDelMedio == busqueda:
            return indiceDelElementoDelMedio
        if busqueda < elementoDelMedio:
            derecha = indiceDelElementoDelMedio - 1
        else:
            izquierda = indiceDelElementoDelMedio + 1
    # Si salimos del ciclo significa que no existe el valor
    return -1



#ingresa canciones que busca rabin
arreglo2=[salida]

#  ingrese las canciones a buscar e imprime su posicion
for i in range(salida):
    arreglo2 = input()
    print(busqueda_binaria(arreglo, arreglo2))


  


