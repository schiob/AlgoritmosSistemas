def selection_sort_desc(arr):
    # Recorremos la lista para ordenar de mayor a menor
    n = len(arr)
    for i in range(n):
        # Suponemos que el máximo está en la posición actual
        max_idx = i
        # Buscamos el valor más grande en el resto de la lista
        for j in range(i + 1, n):
            if arr[j] > arr[max_idx]:
                max_idx = j
        # Intercambiamos el valor más grande encontrado con el valor actual
        arr[i], arr[max_idx] = arr[max_idx], arr[i]
    return arr

# Lectura de entrada
n = int(input())  # Número de Pokémons
cp_list = list(map(int, input().split()))  # Lista de CPs

# Ordenamos la lista usando selection sort en orden descendente
sorted_cp = selection_sort_desc(cp_list)

# Imprimimos la lista ordenada
print(" ".join(map(str, sorted_cp)))
