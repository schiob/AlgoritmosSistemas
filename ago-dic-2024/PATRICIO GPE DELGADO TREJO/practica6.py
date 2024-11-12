def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivote = arr[len(arr) // 2]
    izquierda = [x for x in arr if x < pivote]
    medio = [x for x in arr if x == pivote]
    derecha = [x for x in arr if x > pivote]
    return quicksort(izquierda) + medio + quicksort(derecha)

n = int(input("Cuantos colores vas a ordenar ").strip())
ids_colores = list(map(int, input("introduce los ids de los colores separados por espacios: ").strip().split()))
colores_ordenados = quicksort(ids_colores)
print(" ".join(map(str, colores_ordenados)))
