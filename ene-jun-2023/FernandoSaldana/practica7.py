def quicksort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[0]
        left = []
        right = []
        for i in range(1, len(arr)):
            if arr[i] < pivot:
                left.append(arr[i])
            else:
                right.append(arr[i])
        return quicksort(left) + [pivot] + quicksort(right)

n, q = map(int, input().split())
medicinas = input().split()
medicinas_ordenadas = quicksort(medicinas)

for i in range(q):
    busqueda = input().strip()
    indice = -1
    for j in range(n):
        if medicinas_ordenadas[j] == busqueda:
            indice = j
            break
    print(indice)
