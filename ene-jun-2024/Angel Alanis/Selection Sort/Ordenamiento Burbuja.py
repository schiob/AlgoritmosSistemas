def bubble_sort(arr):
    n = len(arr)

    # Iterar a través de todos los elementos del arreglo
    for i in range(n):
        # Últimos i elementos ya están en su lugar
        for j in range(0, n-i-1):
            # Iterar sobre el arreglo de 0 a n-i-1
            # Intercambiar si el elemento encontrado es mayor que el siguiente elemento
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

# Ejemplo de uso
arr = [64, 34, 25, 12, 22, 11, 90]

# Llamar a la función bubble_sort para ordenar el arreglo
bubble_sort(arr)

print("Arreglo ordenado:")
for i in range(len(arr)):
    print(arr[i], end=" ")
