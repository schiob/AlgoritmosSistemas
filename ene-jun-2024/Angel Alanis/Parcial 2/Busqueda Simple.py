def buscar_posicion_libro(nombre_libro, libros_repisa):
    for i, libro in enumerate(libros_repisa):
        if libro == nombre_libro:
            return i + 1
    return -1

# Lectura de la entrada
n, nombre_libro = input().split()
n = int(n)
libros_repisa = input().split()

# Buscar la posición del libro
posicion = buscar_posicion_libro(nombre_libro, libros_repisa)

# Imprimir la posición del libro
print(posicion)
