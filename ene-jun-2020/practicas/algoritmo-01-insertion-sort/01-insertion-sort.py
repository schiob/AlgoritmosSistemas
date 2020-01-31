# Arreglo desordenado.
unsorted = [3,60,5,4,76,55,32,90,100,1]

# El primero se toma como ordenado.
# En la primera vuelta del ciclo el primer ordenado será unsorted[j-1] que equivale a la posición 0.
# Después se utilizará otro ciclo en decremento que recorrerá de la posición i+1 hasta 0.
# Lo que sigue es comparar la posición actual del indice del nuevo ciclo con todas las posiciones anteriores.
# En caso de que el valor de la posición del indice del nuevo ciclo sea menor al valor de alguna de las posiciones
# anteriores se van a mover, sin embargo, tienes que guardar en una variable temporal o de paso dicho valor
# para que al sobreescribirlo no se pierda.
# De esta forma lograremos ordenar el arreglo.

# V̵O̵N
print("__     __ \n\ \   / /__  _ __  \n \ \ / / _ \| '_ \ \n  \ V / (_) | | | | \n   \_/ \___/|_| |_| \n")

# Función para imprimir un arreglo.
def print_array(array):
    string = '['
    for i in range(0,len(array)):
        if i == len(array)-1:
            string += '{}]'.format(array[i])
        elif i < len(array)-1:
            string += '{},'.format(array[i])
    return string

# Función para imprimir el arreglo desordenado.
print('Unsorted: {}'.format(print_array(unsorted)))

# Ciclo que se encarga de la magia.
for i in range(0, len(unsorted)-1):
    for j in range(i+1, 0, -1):
        if unsorted[j] < unsorted[j-1]:
            temporal = unsorted[j-1]
            unsorted[j-1] = unsorted[j]
            unsorted[j] = temporal

# Función para imprimir el arreglo ya ordenado.
print('Sorted: {}'.format(print_array(unsorted)))
