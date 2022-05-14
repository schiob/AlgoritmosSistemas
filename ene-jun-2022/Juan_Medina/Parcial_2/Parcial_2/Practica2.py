Canciones = ["FiestaDeLocos", "Matador", "Comprendes,Mendes?", "PadreNuestro","yoTomo", "Frijolero", "Siseñor", "Imagina"]

def quicksort(lst):
    if not lst:
        return []
    return (quicksort([x for x in lst[1:] if x <  lst[0]])
            + [lst[0]] +
            quicksort([x for x in lst[1:] if x >= lst[0]]))


Nueva_lista = quicksort(Canciones)
print("---------------La lista ordenada de forma alfabetica con quick sort es: ---------------------")
print(quicksort(Canciones))

posicion = ("Siseñor")
posicion1 = ("Imagina")
posicion2 = ("PadreNuestro")
posicion3 = ("LaDosisPerfecta")
posicion4 = ("Matador")


print("----------- La ubicación de las canciones buscadas es --------- ")

for j in range(len(Nueva_lista)):
    if posicion == Nueva_lista[j]:
        print("La canción {} se ha encontrado en la posición {} de tu playlist".format(posicion,j))

for j in range(len(Nueva_lista)):
    if posicion1 == Nueva_lista[j]:
        print("La canción {} se ha encontrado en la posición {} de tu playlist".format(posicion1,j))

for j in range(len(Nueva_lista)):
    if posicion2 == Nueva_lista[j]:
        print("La canción {} se ha encontrado en la posición {} de tu playlist".format(posicion2,j))

for j in range(len(Nueva_lista)):
    if posicion3 == Nueva_lista[j]:
        print("La canción {} se ha encontrado en la posición {} de tu playlist".format(posicion3,j))

    else: 
        print("La canción {} se ha encontrado en la posición: -1".format(posicion3))
        break

for j in range(len(Nueva_lista)):
    if posicion4 == Nueva_lista[j]:
        print("La canción {} se ha encontrado en la posición {} de tu playlist".format(posicion4,j))