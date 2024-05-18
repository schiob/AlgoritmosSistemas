def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quicksort(left) + middle + quicksort(right)

# Leer el número de medicinas
n = int(input().strip())

# Leer los nombres de las medicinas
medicinas = input().strip().split()

# Ordenar las medicinas alfabéticamente
medicinas_ordenadas = quicksort(medicinas)

# Imprimir las medicinas ordenadas
print(" ".join(medicinas_ordenadas))
