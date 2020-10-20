# Alan Menchaca M.
class InsertionSort:

    @staticmethod
    def sort(array):
        for i in range(0, len(array) - 1):
            pos_actual = i
            pos_siguiente = (pos_actual + 1)

            while array[pos_siguiente] <= array[pos_actual]:
                elemento_actual = array[pos_actual]
                elemento_siguiente = array[pos_siguiente]

                array[pos_actual] = elemento_siguiente
                array[pos_siguiente] = elemento_actual

                if pos_actual == 0:
                    break

                pos_actual -= 1
                pos_siguiente = (pos_actual + 1)

    @staticmethod
    def reverse_sort(array):
        for i in range(0, len(array) - 1):
            pos_actual = i
            pos_siguiente = (pos_actual + 1)

            while array[pos_siguiente] >= array[pos_actual]:
                elemento_actual = array[pos_actual]
                elemento_siguiente = array[pos_siguiente]

                array[pos_actual] = elemento_siguiente
                array[pos_siguiente] = elemento_actual

                if pos_actual == 0:
                    break

                pos_actual -= 1
                pos_siguiente = (pos_actual + 1)
