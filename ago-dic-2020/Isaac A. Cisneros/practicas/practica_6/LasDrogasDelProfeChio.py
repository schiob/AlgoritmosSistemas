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
n = input()
ar = input().split()
if len(ar) != n:
    busco = input()
    arord = quickSort(ar)
    pos = binarySearch(arord, 0, len(arord) - 1, busco)
    print(pos)
else:
    print('verifica el numero de medicamentos a agregar')