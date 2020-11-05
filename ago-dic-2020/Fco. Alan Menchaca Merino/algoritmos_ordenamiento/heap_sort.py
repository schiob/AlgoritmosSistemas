class HeapSort:

    @staticmethod
    def heapify(array, n, i):
        largest = i
        # Definiendo nodo izquierdo y derecho
        idx_left = (2 * i) + 1
        idx_right = (2 * i) + 2

        if idx_left < n and array[i] < array[idx_left]:
            largest = idx_left

        if idx_right < n and array[largest] < array[idx_right]:
            largest = idx_right

        if largest != i:
            array[i], array[largest] = array[largest], array[i]
            HeapSort.heapify(array, n, largest)

    @staticmethod
    def sort(array):
        n = len(array)

        for i in range(n // 2, -1, -1):
            HeapSort.heapify(array, n, i)

        for i in range(n - 1, -1, -1):
            array[i], array[0] = array[0], array[i]
            HeapSort.heapify(array, i, 0)

    @staticmethod
    def reverse_heapify(array, n, i):
        largest = i
        # Definiendo nodo izquierdo y derecho
        idx_left = (2 * i) + 1
        idx_right = (2 * i) + 2

        if idx_left < n and array[i] > array[idx_left]:
            largest = idx_left

        if idx_right < n and array[largest] > array[idx_right]:
            largest = idx_right

        if largest != i:
            array[i], array[largest] = array[largest], array[i]
            HeapSort.reverse_heapify(array, n, largest)

    @staticmethod
    def reverse_sort(array):
        n = len(array)

        for i in range(n // 2, -1, -1):
            HeapSort.reverse_heapify(array, n, i)

        for i in range(n - 1, -1, -1):
            array[i], array[0] = array[0], array[i]
            HeapSort.reverse_heapify(array, i, 0)
