def selection_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        max_idx = i
        for j in range(i + 1, n):
            if arr[j] > arr[max_idx]:
                max_idx = j
        arr[i], arr[max_idx] = arr[max_idx], arr[i]

n = int(input("Ingrese la cantidad de Pokémon capturados (1 <= n <= 50): "))

print("Ingrese los CP de los Pokémon separados por espacios (1 <= CP <= 2000): ")
cp_list = list(map(int, input().split()))

if len(cp_list) != n:
    print("La cantidad de Pokémon no coincide con la lista ingresada.")
else:
    selection_sort(cp_list)

    print("Lista de Pokémon ordenada de mayor a menor:")
    print(*cp_list)
