def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quicksort(left) + middle + quicksort(right)


def binary_search(arr, target):
    low = 0
    high = len(arr) - 1
    while low <= high:
        mid = (low + high) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1
    return -1


# Lectura de la entrada
n, q = map(int, input("Ingresa el numero de medicamentos y el numero de peticiones separadas de un espacio\n").split())
medicinas = input("\nIngresa el nombre de medicamentos separados por un espacio\n").split()

# Ordenar las medicinas
medicinas = quicksort(medicinas)

print("\n**si tu medicamento no existe se regresara un -1**\n")
# Realizar las búsquedas
for _ in range(q):
    query = input(f"Ingresa el {_+1} medicamento a buscar\n").strip()
    position = binary_search(medicinas, query)
    print(f"\n*El medicamento {query} se encuentra en la posicion {position}*\n")
