def quick_sort(arr):
    if len(arr) <= 1:
        return arr

    pivot = arr[0]
    equal = [x for x in arr if x[1] == pivot[1]]
    less = [x for x in arr if x[1] < pivot[1]]
    greater = [x for x in arr if x[1] > pivot[1]]

    return quick_sort(greater) + equal + quick_sort(less)

# Leer la entrada
n = int(input())
autos = []

for i in range(n):
    nombre, kilometraje = input().split()
    autos.append((nombre, int(kilometraje)))

# Aplicar Quick Sort
autos_ordenados = quick_sort(autos)

# Imprimir la lista ordenada
for auto in autos_ordenados:
    print(auto[0], end=" ")
