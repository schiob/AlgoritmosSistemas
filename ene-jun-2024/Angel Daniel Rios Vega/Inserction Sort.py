array = [7, 8, 6, 0, 9, 1, 5, 2, 4, 3]

for i in range(1, len(array)):
    key = array[i]
    j = i - 1
    while j >= 0 and key < array[j]:
        array[j + 1] = array[j]
        j -= 1
    array[j + 1] = key
    print("Array después de la iteración", i, ":", array)

print("Array ordenado:", array)