def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[0]  
        menores = [x for x in arr[1:] if x[1] <= pivot[1]] 
        mayores = [x for x in arr[1:] if x[1] > pivot[1]]  
        return quick_sort(mayores) + [pivot] + quick_sort(menores)

n = int(input())
autos = []
for _ in range(n):
    nombre, kilometraje = input().split()
    autos.append((nombre, int(kilometraje)))  

autos_ordenados = quick_sort(autos)

for auto in autos_ordenados:
    print(auto[0], end=' ')
