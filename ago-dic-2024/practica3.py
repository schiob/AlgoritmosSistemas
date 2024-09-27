def selection_sort_desc(arr):
    n = len(arr)
    for i in range(n):
        # Encontrar el índice del valor máximo en el resto de la lista
        max_idx = i
        for j in range(i + 1, n):
            if arr[j] > arr[max_idx]:
                max_idx = j
        # Intercambiar el elemento máximo encontrado con el primer elemento no ordenado
        arr[i], arr[max_idx] = arr[max_idx], arr[i]

# Leer la entrada
n = int(input())  # Número de Pokemons
powers = list(map(int, input().split()))  # Lista de poderes de los Pokemons

# Ordenar la lista de poderes en orden descendente
selection_sort_desc(powers)

# Imprimir la lista ordenada
print(" ".join(map(str, powers)))
