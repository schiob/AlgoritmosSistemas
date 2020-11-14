def quick_sort(array, start_idx, end_idx):
    pivot = start_idx
    pointer = end_idx

    while pivot != pointer:
        if array[pointer] < array[pivot] and pointer > pivot:
            array[pointer], array[pivot] = array[pivot], array[pointer]
            pointer, pivot = pivot, pointer

        elif array[pointer] > array[pivot] and pointer < pivot:
            array[pointer], array[pivot] = array[pivot], array[pointer]
            pointer, pivot = pivot, pointer

        if pointer > pivot:
            pointer -= 1
        else:
            pointer += 1

    if start_idx < pivot:
        quick_sort(array, start_idx, pivot - 1)

    if end_idx > pivot:
        quick_sort(array, pivot + 1, end_idx)


def binary_search(array, start, end, value):
    middle = (start + end) // 2

    if value == array[middle]:
        return middle

    if start == end:
        return -1

    if value < array[middle]:
        return binary_search(array, start, middle - 1, value)
    else:
        return binary_search(array, middle + 1, end, value)


tazos_length, serie = map(int, input().split())
tazos = list(map(int, input().split()))

# Ordenamiento y busqueda
# 6 42
# 32 231 23 42 90 45
quick_sort(tazos, 0, tazos_length - 1)
tazo_idx = binary_search(tazos, 0, tazos_length - 1, serie)
# 1, 2, ..., 6
print((tazo_idx + 1))
