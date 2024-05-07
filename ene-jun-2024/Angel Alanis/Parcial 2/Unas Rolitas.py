def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quicksort(left) + middle + quicksort(right)

def binary_search(arr, x):
    low = 0
    high = len(arr) - 1
    while low <= high:
        mid = (low + high) // 2
        if arr[mid] < x:
            low = mid + 1
        elif arr[mid] > x:
            high = mid - 1
        else:
            return mid
    return -1

# Leer la entrada
N, Q = map(int, input().strip().split())
playlist_rabin = input().strip().split()
queries = [input().strip() for _ in range(Q)]

# Ordenar la playlist con Quick Sort
playlist_ordenada = quicksort(playlist_rabin)

# Imprimir el nuevo orden de la playlist
print(" ".join(playlist_ordenada))

# Buscar las canciones solicitadas y imprimir los resultados
for cancion in queries:
    indice = binary_search(playlist_ordenada, cancion)
    if indice != -1:
        print(indice)
    else:
        print("-1")
