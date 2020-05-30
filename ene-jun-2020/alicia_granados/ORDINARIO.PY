
##algoritmo de busqueda binaria
def binarySearch(arreglo, inicial, final, x):

    medio = (inicial + final)//2 ##sDivide el arreglo en partes iguales
    if inicial > final: 
        return -1

    if arreglo[medio][0] == x : ## si x esta exactamente a la mitad
        return medio

    if x < arreglo[medio][0]: 
        return binarySearch(arreglo, inicial, medio-1, x) ## busca x en el inicio hasta medio-1
    else:
        return binarySearch(arreglo, medio+1, final, x) ## busca x en la mitad +1 hasta el final del arreglo


##ingreso del tamaño del arreglo y lo que buscas
entrada_datos = input().split()    

#declarar posiciones
# número de artículo
tamaño=int(entrada_datos[0]) 
#artículo que busca Panchito.
palabra=entrada_datos[1]
## arreglo 
arreglo = []              
for i in range(tamaño): 
    b = input().split()     ##datos a ingresar
    arreglo.append(b)       ## se agregan los datos en el arreglo

def quickSort(arr,start,end):
    # Se asigna un pivote y un point dados como parámetros.
    pivot = start
    point = end
    # Se comparan hasta que seans iguale o mientras sean diferentes.
    while pivot != point:
        # Comparo pivote con el point.
        # Acercar el point al pivote.
        if len(arr[point]) < len(arr[pivot]) and point > pivot:
            # Si la regla no se cumple, cambio.
            arr[point], arr[pivot] = arr[pivot], arr[point]
            pivot, point = point, pivot
        elif len(arr[point]) > len(arr[pivot]) and point < pivot:
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

quickSort(arreglo,0,len(arreglo)-1)
#print(arreglo)
print(binarySearch(arreglo, 0, len(arreglo), palabra)+1)
