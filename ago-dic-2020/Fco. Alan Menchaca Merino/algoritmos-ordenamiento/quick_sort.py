class QuickSort:

    @staticmethod
    def sort(array, start_idx, end_idx):
        pivot = start_idx
        pointer = end_idx

        while pivot != pointer:
            # Se compara que el valor del puntero sea menor que el valor del pivote
            # y que el puntero se encuentre a la derecha del pivote.
            if array[pointer] < array[pivot] and pointer > pivot:
                # Se intercambian los valores entre puntero y pivote
                array[pointer], array[pivot] = array[pivot], array[pointer]
                # Se intercambian los indices entre puntero y pivote.
                pointer, pivot = pivot, pointer
                # Si el puntero es mayor que el pivote, el puntero disminuira para
                # lograr coincidir con el pivote.

            # Se compara que el valor del puntero sea mayor que el valor del pivote
            # y que el puntero se encuentre a la izquierda del pivote.
            elif array[pointer] > array[pivot] and pointer < pivot:
                # Se intercambian los valores entre puntero y pivote
                array[pointer], array[pivot] = array[pivot], array[pointer]
                # Se intercambian los indices entre puntero y pivote.
                pointer, pivot = pivot, pointer
                # Si el puntero es menor que el pivote, el puntero aumentará para
                # lograr coincidir con el pivote.

            if pointer > pivot:
                pointer -= 1
            else:
                pointer += 1

        # Se ordenan de manera recursiva los valores ubicados a la izquierda
        # del pivote.
        if start_idx < pivot:
            QuickSort.sort(array, start_idx, pivot - 1)

        # Se ordenan de manera recursiva los valores ubicados a la derecha
        # del pivote.
        if end_idx > pivot:
            QuickSort.sort(array, pivot + 1, end_idx)

    @staticmethod
    def reverse_sort(array, start_idx, end_idx):
        pivot = start_idx
        pointer = end_idx

        while pivot != pointer:
            if array[pointer] > array[pivot] and pointer > pivot:
                array[pointer], array[pivot] = array[pivot], array[pointer]
                pointer, pivot = pivot, pointer

            elif array[pointer] < array[pivot] and pointer < pivot:
                array[pointer], array[pivot] = array[pivot], array[pointer]
                pointer, pivot = pivot, pointer

            if pointer > pivot:
                pointer -= 1
            else:
                pointer += 1

        if start_idx < pivot:
            QuickSort.reverse_sort(array, start_idx, pivot - 1)

        if end_idx > pivot:
            QuickSort.reverse_sort(array, pivot + 1, end_idx)
