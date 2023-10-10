def merge_sort(arr):
    if len(arr) <= 1:
        return arr

    mid = len(arr) // 2
    left_half = arr[:mid]
    right_half = arr[mid:]

    left_half = merge_sort(left_half)
    right_half = merge_sort(right_half)

    return merge(left_half, right_half)

def merge(left, right):
    result = []
    i = j = 0

    while i < len(left) and j < len(right):
        if left[i][1] < right[j][1]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1

    result.extend(left[i:])
    result.extend(right[j:])
    return result

# entrada de libros
n = int(input())
libros = []

for _ in range(n):
    nombre, paginas = input().split()
    libros.append((nombre, int(paginas)))

# Ordenar la lista de libros utilizando MergeSort
books = merge_sort(libros)

# Imprimir los nombres de los libros ordenados
for libros in books:
    print(libros[0], end=" ")
