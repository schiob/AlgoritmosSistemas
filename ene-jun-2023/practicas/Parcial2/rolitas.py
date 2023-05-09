def quicksort(arreglo):
    if len(arreglo) <= 1:
        return arreglo
    pivoto = arreglo[len(arreglo) // 2]
    izq = [x for x in arreglo if x < pivoto]
    mid = [x for x in arreglo if x == pivoto]
    der = [x for x in arreglo if x > pivoto]
    return quicksort(izq) + mid + quicksort(der)

def binary_search(arreglo, x):
    menor = 0
    mayor = len(arreglo) - 1
    while menor <= mayor:
        mid = (menor + mayor) // 2
        if arreglo[mid] < x:
            menor = mid + 1
        elif arreglo[mid] > x:
            mayor = mid - 1
        else:
            return mid
    return -1

n, q = map(int, input().split())

rolitas = input().split()

rolitasOrdenadas = quicksort(rolitas)

posiciones = []

for i in range(q):
    rolitasBuscadas = input().strip()
    posiciones.append(binary_search(rolitasOrdenadas, rolitasBuscadas))

print(" ".join(rolitasOrdenadas))
for posicion in posiciones:
    print(posicion)


