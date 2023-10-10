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
    left_index, right_index = 0, 0

    while left_index < len(left) and right_index < len(right):
        if left[left_index][1] < right[right_index][1]:
            result.append(left[left_index])
            left_index += 1
        else:
            result.append(right[right_index])
            right_index += 1

    result.extend(left[left_index:])
    result.extend(right[right_index:])
    
    return result

# num libros
n = int(input("Ingrese el número de libros: "))

# entrada 
libros = []
for _ in range(n):
    entrada = input().split()
    nombre = entrada[0]
    paginas = int(entrada[1])
    libros.append((nombre, paginas))

# mergeSort
libros_ordenados = merge_sort(libros)

# Imprimir nombres 
print("Lista de libros ordenados por número de páginas:")
for libro in libros_ordenados:
    print(libro[0], end=" ")
