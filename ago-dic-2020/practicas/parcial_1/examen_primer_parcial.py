def sort(array):
    if len(array) == 1:
        return array

    middle = len(array) // 2

    left_array = array[:middle]
    right_array = array[middle:]

    sorted_left_array = sort(left_array)
    sorted_right_array = sort(right_array)

    # Array que contiene el arreglo izquierdo y derecho fucionados
    array_resultado = []

    # Se ordenan los elementos de los arreglos ordenados (de menor a mayor)
    while len(sorted_left_array) > 0 and len(sorted_right_array) > 0:
        if sorted_left_array[0]['horas'] > sorted_right_array[0]['horas']:
            array_resultado.append(sorted_right_array[0])
            del sorted_right_array[0]
        elif sorted_left_array[0]['horas'] == sorted_right_array[0]['horas']:
            if sorted_left_array[0]['minutos'] > sorted_right_array[0]['minutos']:
                array_resultado.append(sorted_right_array[0])
                del sorted_right_array[0]
            else:
                array_resultado.append(sorted_left_array[0])
                del sorted_left_array[0]
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

peliculas_length = int(input())
peliculas = []

for pelicula in range(peliculas_length):
    nombre, horas, minutos = input().split()
    pelicula = {'nombre': nombre,
                'horas': int(horas),
                'minutos': int(minutos)
                }
    peliculas.append(pelicula)

peliculas_sorted = sort(peliculas)
[print(f"{pelicula['nombre']} ", end="") for pelicula in peliculas_sorted]