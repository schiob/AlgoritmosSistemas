# Alan Menchaca M. 26 / 09 / 2020
class BubbleSort:

    @staticmethod
    def sort(array):
        for i in range(0, len(array) - 1):
            for pos_actual in range(0, len(array) - i - 1):
                pos_siguiente = (pos_actual + 1)
                valor_temp = array[pos_siguiente]

                if array[pos_actual] > array[pos_siguiente]:
                    array[pos_siguiente] = array[pos_actual]
                    array[pos_actual] = valor_temp

    @staticmethod
    def reverse_sort(array):
        for i in range(0, len(array) - 1):
            for pos_actual in range(0, len(array) - i - 1):
                pos_siguiente = (pos_actual + 1)
                valor_temp = array[pos_siguiente]

                if array[pos_actual] < array[pos_siguiente]:
                    array[pos_siguiente] = array[pos_actual]
                    array[pos_actual] = valor_temp
