# Función para implementar el algoritmo Bubble Sort
def bubble_sort(arr):
    n = len(arr)
    # Iterar sobre cada elemento de la lista
    for i in range(n):
        # Últimos i elementos ya están en su lugar
        for j in range(0, n-i-1):
            # Intercambiar si el elemento actual es mayor que el siguiente
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

# Paso 1: Leer la entrada STDIN
n = int(input())  # Leemos el número de medicamentos (aunque no es necesario usar 'n')
medicinas = input().split()  # Leemos los nombres de las medicinas y las dividimos en una lista

# Paso 2: Ordenar la lista usando Bubble Sort
bubble_sort(medicinas)

# Paso 3: Imprimir la lista ordenada STDOUT
print(" ".join(medicinas))
