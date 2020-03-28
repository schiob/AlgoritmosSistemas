# Función que ordena de mayor a menor un arreglo mediante el algoritmo bubble sort.
def bubbleSort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1] :
                arr[j], arr[j+1] = arr[j+1], arr[j]

# Parámetros de confiruación de la entrada.
parametros = input('').split(' ')

# Guardo en dos variables diferentes la cantidad de medicinas que se guardarán y el número de medicinas que se buscarán después.
cantidad_medicinas = int(parametros[0])
medicinas_a_buscar = int(parametros[1])

# Nombre de las medicinas.
medicinas = input('').split(' ')

# Ordeno alfabeticamente los nombres de las medicinas.
bubbleSort(medicinas)

# Obtengo el índice, si este existe retorna su posición, sino entonces retorna un -1.
respuesta = ''
for i in range(0,medicinas_a_buscar):
    medicina = input('')
    try:
        respuesta += '{} \n'.format(medicinas.index(medicina))
    except ValueError:
        respuesta += '-1'

# Imprimo el resultado final.
print(respuesta)
