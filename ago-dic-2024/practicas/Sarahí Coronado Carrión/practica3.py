def bubble_sort(arr):
    n = len(arr)
    # Implementación del algoritmo Bubble Sort
    for i in range(n):
        for j in range(0, n - i - 1):
            if arr[j] < arr[j + 1]:  # Ordenar de mayor a menor
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

# Leer la entrada
n = int(input("Ingrese el número de pokemons: "))
poderes = list(map(int, input("Ingrese los poderes de los pokemons: ").split()))

# Ordenar los poderes de los pokemons
bubble_sort(poderes)

# Imprimir la salida
print(" ".join(map(str, poderes)))
