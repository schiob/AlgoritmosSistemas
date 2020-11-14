def binary_search(array, start, end, value):
    middle = (start + end) // 2

    if value == array[middle] or end == middle:
        return middle

    if start == end or middle == -1:
        return -1

    if value < array[middle]:
        return binary_search(array, start, middle - 1, value)
    else:
        return binary_search(array, middle + 1, end, value)


# 5 CalculoForDummies
# Calculo2Deitel CalculoForDummies AlgebraLineal TeoríaDeNúmeros TheMangaGuideToCalculus
cant_libros, libro = input().split()
libros = input().split()

libro_idx = binary_search(libros, 0, int(cant_libros) - 1, libro)
print(libro_idx)
