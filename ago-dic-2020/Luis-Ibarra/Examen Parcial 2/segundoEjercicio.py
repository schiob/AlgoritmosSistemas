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


def binarySearch(arr, l, r, x):
    if r >= l:

        mid = l + (r - l) // 2

        if arr[mid] == x:
            return mid

        elif arr[mid] > x:
            return binarySearch(arr, l, mid-1, x)

        else:
            return binarySearch(arr, mid + 1, r, x)
    else:
        return -1


n, x = input().split()
tazos = input().split()
if int(n) != len(tazos):
    print('Verificar el numero de tazos a agregar')
    exit()


tazos = quickSort(tazos)
print(binarySearch(tazos, 0, len(tazos) - 1, x))

