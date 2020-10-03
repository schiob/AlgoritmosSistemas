cantidad_peliculas = int(input("¿Cuantas peliculas van a ser filomeno?"))
cadena = []
nombre_peliculas = []

for i in range(0, cantidad_peliculas):
    pelicula = input("Nombre de la pelicula, su numero de horas y minutos")
    pelicula_split = pelicula.split()
    print(pelicula_split)
    horas = float(pelicula_split[1])
    minutos = float(pelicula_split[2])
    tiempo = horas  + (minutos/60)
    cadena.append(tiempo)
    nombre_peliculas.append(pelicula)
# Función merge_sort
def merge_sort(lista):
   if len(lista) < 2:
      return lista
   else:
        middle = len(lista) // 2
        right = merge_sort(lista[:middle])
        left = merge_sort(lista[middle:])
        return merge(right, left)

def merge(lista1, lista2):
    i, j = 0, 0 
    result = [] 

    while(i < len(lista1) and j < len(lista2)):
        if (lista1[i] < lista2[j]):
            result.append(lista1[i])
            i += 1
        else:
            result.append(lista2[j])
            j += 1

    result += lista1[i:]
    result += lista2[j:]

    return result
merge_sort_result = merge_sort(cadena)
print(nombre_peliculas.append(pelicula), merge_sort_result)