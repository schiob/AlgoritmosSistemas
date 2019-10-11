#parcial-1
cantidad_peliculas = int(input("Dame la cantidad \n"))
cadena = []
nombre_peliculas = []

for i in range(0, cantidad_peliculas):
    pelicula = input("Dame la pelicula, su numero de horas y minutos \n")
    pelicula_split = pelicula.split()
    print(pelicula_split)
    horas = float(pelicula_split[1])
    minutos = float(pelicula_split[2])
    tiempo = (horas * 60) + minutos
    cadena.append(tiempo)
    nombre_peliculas.append(pelicula)

# Función merge_sort
def merge_sort(lista):

   """
   Lo primero que se ve en el psudocódigo es un if que
   comprueba la longitud de la lista. Si es menor que 2, 1 o 0, se devuelve la lista.
   ¿Por que? Ya esta ordenada.
   """
   if len(lista) < 2:
      return lista

    # De lo contrario, se divide en 2
   else:
        middle = len(lista) // 2
        right = merge_sort(lista[:middle])
        left = merge_sort(lista[middle:])
        return merge(right, left)

# Función merge
def merge(lista1, lista2):
    """
    merge se encargara de intercalar los elementos de las dos
    divisiones.
    """
    i, j = 0, 0 # Variables de incremento
    result = [] # Lista de resultado

   # Intercalar ordenadamente
    while(i < len(lista1) and j < len(lista2)):
        if (lista1[i] < lista2[j]):
            result.append(lista1[i])
            i += 1
        else:
            result.append(lista2[j])
            j += 1

   # Agregamos los resultados a la lista
    result += lista1[i:]
    result += lista2[j:]

    # Retornamos el resultados
    return result

# Prueba del algoritmo

#lista = [31,3,88,1,4,2,42]

merge_sort_result = merge_sort(cadena)
print(merge_sort_result)