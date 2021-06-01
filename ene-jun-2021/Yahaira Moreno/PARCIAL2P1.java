def quickSort(array):
    if len(array) == 0:
        return []
    izq = []
    der = []
    pivote = array[0]
    for x in array[1:]:
        if x < pivote:
            izq.append(x)
        else:
            der.append(x)
    return quickSort(izq) + [pivote] + quickSort(der)


def binarySearch(arr, inicio, fin, buscando):
    middle = (inicio + fin) // 2
    if arr[middle] == buscando:
        return middle

    if inicio == fin:
        return -1

    if arr[middle] < buscando:
        return binarySearch(arr, (middle + 1), fin, buscando)
    else:
        return binarySearch(arr, inicio, (middle - 1), buscando)

n=input('valores separdos por espacio: ').split()
arr=input('arreglo de canciones: ').split()


ordenado=quickSort(arr)
busquedas=[]
for i in range(int(n[1])):
    busquedas.append(input('buscar: '))

busquedas_index=[]
for b in busquedas:
    result = binarySearch(ordenado, 0, len(ordenado)-1, b)
    busquedas_index.append(result)
print(ordenado)
for index in busquedas_index:
    print(index)