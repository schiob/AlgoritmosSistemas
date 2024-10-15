def selection_sort_desc(arr):
    n = len(arr)
    # Recorrer todos los elementos de la lista
    for i in range(n):
        max_index = i  # Suponemos que el elemento más grande es el primero no ordenado
        
        # Buscar el elemento más grande en la parte no ordenada
        for j in range(i + 1, n):
            if arr[j] > arr[max_index]:  # Para ordenar de mayor a menor
                max_index = j
        
        # Intercambiar el elemento más grande encontrado con el primero no ordenado
        arr[i], arr[max_index] = arr[max_index], arr[i]

# Leer la entrada
n = int(input("Ingresa el número de Pokémons: ").strip())  # Número de Pokémons
poderes = list(map(int, input("Ingresa los poderes de los Pokémons (separados por espacios): ").strip().split()))  # Lista de poderes

# Mostrar entrada
print("\nEntrada:")
print(f"Número de Pokémons: {n}")
print(f"Poderes: {' '.join(map(str, poderes))}")

# Ordenar los poderes de mayor a menor
selection_sort_desc(poderes)

# Mostrar salida
print("\nSalida:")
print(" ".join(map(str, poderes)))
