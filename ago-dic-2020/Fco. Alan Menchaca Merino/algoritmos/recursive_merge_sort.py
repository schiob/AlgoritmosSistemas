class MergeSort:

    @staticmethod
    def sort(array):
        if len(array) == 1:
            return array

        middle = len(array) // 2

        left_array = array[:middle]
        right_array = array[middle:]

        sorted_left_array = MergeSort.sort(left_array)
        sorted_right_array = MergeSort.sort(right_array)

        # Array que contiene el arreglo izquierdo y derecho fucionados
        array_resultado = []

        # Se ordenan los elementos de los arreglos ordenados (de menor a mayor)
        while len(sorted_left_array) > 0 and len(sorted_right_array) > 0:
            if sorted_left_array[0] > sorted_right_array[0]:
                array_resultado.append(sorted_right_array[0])
                del sorted_right_array[0]
            else:
                array_resultado.append(sorted_left_array[0])
                del sorted_left_array[0]

        # Se colocan los valores sobrantes del arreglo derecho en el arreglo resultado
        while len(sorted_left_array) > 0:
            array_resultado.append(sorted_left_array[0])
            del sorted_left_array[0]

        # Se colocan los valores sobrantes del arreglo izquierda en el arreglo resultado
        while len(sorted_right_array) > 0:
            array_resultado.append(sorted_right_array[0])
            del sorted_right_array[0]

        return array_resultado

    @staticmethod
    def reverse_sort(array):
        if len(array) == 1:
            return array

        middle = len(array) // 2

        left_array = array[:middle]
        right_array = array[middle:]

        sorted_left_array = MergeSort.sort(left_array)
        sorted_right_array = MergeSort.sort(right_array)

        # Array que contiene el arreglo izquierdo y derecho fucionados
        array_resultado = []

        # Se ordenan los elementos de los arreglos ordenados (de mayor a menor)
        while len(sorted_left_array) > 0 and len(sorted_right_array) > 0:
            if sorted_left_array[-1] < sorted_right_array[-1]:
                array_resultado.append(sorted_right_array[-1])
                del sorted_right_array[-1]
            else:
                array_resultado.append(sorted_left_array[-1])
                del sorted_left_array[-1]

        # Se colocan los valores sobrantes del arreglo derecho en el arreglo resultado
        while len(sorted_left_array) > 0:
            array_resultado.append(sorted_left_array[-1])
            del sorted_left_array[-1]

        # Se colocan los valores sobrantes del arreglo izquierda en el arreglo resultado
        while len(sorted_right_array) > 0:
            array_resultado.append(sorted_right_array[-1])
            del sorted_right_array[-1]

        return array_resultado
