# Función de búsqueda lineal
def busqueda_lineal(libros, libro_buscado):
    for i in range(len(libros)):
        if libros[i] == libro_buscado:
            return i + 1
    return -1


n, libro_buscado = input().split()
n = int(n)

libros = input().split()

posicion = busqueda_lineal(libros, libro_buscado)
print(posicion)
