def selection_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        max_index = i
        for j in range(i + 1, n):
            if arr[j] > arr[max_index]:
                max_index = j
        arr[i], arr[max_index] = arr[max_index], arr[i]

# Leer la cantidad de Pokémon y sus CP
n = int(input())
cp_list = list(map(int, input().split()))

# Ordenar la lista de CP utilizando selection sort
selection_sort(cp_list)

# Imprimir la lista ordenada
print(" ".join(map(str, cp_list)))