def quick_sort(arr):
    if len(arr) <= 1:
        return arr

    a = arr[0]
    i = []
    d = []

    for car in arr[1:]:
        if car[1] > a[1]:
            i.append(car)
        else:
            d.append(car)

    return quick_sort(i) + [a] + quick_sort(d)

n = int(input())
autos = []

for _ in range(n):
    marca, km = input().split()
    autos.append((marca, int(km)))

# Ordenar de mayor a menor kilometraje
autos_ordenados = quick_sort(autos)

# Imprimir la lista ordenada
for auto in autos_ordenados:
    print(auto[0], end=" ")

