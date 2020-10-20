# Alan Menchaca M. 25 / 09 / 2020
def sort(array):
    # Recorremos toda la lista
    for pos_actual in range(0, len(array)):

        # recorremos la lista inicializando desde la posición actual
        for pos_recorrido in range(pos_actual, len(array)):
            # guardamos el valor de la posición recorrido para no
            # perder el dato durante el intercambio de variables
            recorrido_value = array[pos_recorrido]

            if array[pos_recorrido] < array[pos_actual]:
                # se intercambian los valores
                array[pos_recorrido] = array[pos_actual]
                array[pos_actual] = recorrido_value


def reverse_sort(array):
    for pos_actual in range(0, len(array)):

        for pos_recorrido in range(pos_actual, len(array)):
            recorrido_value = array[pos_recorrido]

            if array[pos_recorrido] > array[pos_actual]:
                array[pos_recorrido] = array[pos_actual]
                array[pos_actual] = recorrido_value
