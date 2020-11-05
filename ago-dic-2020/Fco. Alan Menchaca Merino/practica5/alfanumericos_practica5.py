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


palabras_length = int(input())
palabras = input().split()

# Ordenando las palabras
quick_sort(palabras, 0, palabras_length - 1)
print(palabras)
