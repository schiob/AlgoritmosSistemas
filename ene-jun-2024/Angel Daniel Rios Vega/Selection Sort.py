array = [7, 8, 6, 0, 9, 1, 5, 2, 4, 3]

for i in range(len(array)):
    min_index = i
    for j in range(i+1, len(array)):
        if array[j] < array[min_index]:
            min_index = j

    if min_index != i:
        array[i], array[min_index] = array[min_index], array[i]
        print(f"Intercambiando {array[i]} con {array[min_index]}")

print("Array ordenado:", array)