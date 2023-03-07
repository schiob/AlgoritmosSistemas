def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    mid = len(arr) // 2
    izq = merge_sort(arr[:mid])
    der = merge_sort(arr[mid:])
    return merge(izq, der)

def merge(izq, der):
    resultado = []
    i, j = 0, 0
    while i < len(izq) and j < len(der):
        if izq[i][1] <= der[j][1]:
            resultado.append(izq[i])
            i += 1
        else:
            resultado.append(der[j])
            j += 1
    resultado += izq[i:]
    resultado += der[j:]
    return resultado

n = int(input("Ingresa el numero de peliculas a ordenar: "))

peliculas = []
for i in range(n):
    nombre = input("Ingresa el nombre de la pelicula: ")
    duracion = int(input("Ingresa la duración de la pelicula: "))
    peliculas.append((nombre, duracion))

ordenPeliculas = merge_sort(peliculas)

for peli in ordenPeliculas:
    print(peli[0])
